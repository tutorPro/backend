package com.tutorPro.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import org.jetbrains.annotations.NotNull;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    @Id
    private Long id;

    @NotNull(message = "message cannot be empty")
    private String message;
    @NotNull
    private String author;
}
