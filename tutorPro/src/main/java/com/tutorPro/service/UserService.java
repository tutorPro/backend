package com.tutorPro.service;

import com.tutorPro.mapper.UserMapper;
import com.tutorPro.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    private final UserMapper userMapper;
    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = this.userMapper.findUserByUsername(s);
        UserDetails userDetails = new User(s, user.getPassword(), user.getAuthorities());
        return userDetails;
    }
}
