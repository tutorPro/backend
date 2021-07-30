package com.tutorPro.mapper;

import com.tutorPro.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    final String findByUsernameQuery = "SELECT * from users where username = #{username}";
    @Select(findByUsernameQuery)
    User findUserByUsername(@Param("username") String username);
}
