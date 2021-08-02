package com.tutorPro.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

/*
 * @author Jeff
 * @date 8/1/21 7:22 PM
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Subject {
    @Id
    private Long id;
    private String subjectName;
    private List<User> tutorList;
}
