package com.example.library_uy.Dto;

import com.example.library_uy.Enums.StudentBookStatus;
import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
public class StudentBookDto {
   private Integer id ;

    private StudentDto student;
    private BookDto book;
    private LocalDateTime createdDate;
    private LocalDateTime returnedDate;
    private StudentBookStatus status;
    private LocalDateTime returneDate;
    private  LocalDateTime Duration;

}
