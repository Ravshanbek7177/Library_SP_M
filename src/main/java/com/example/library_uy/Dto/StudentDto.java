package com.example.library_uy.Dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class StudentDto {
   private  Integer id ;
    private String  name ;
    private String surname ;
    private String phone;
    private LocalDateTime createdDate;

}
