package com.example.library_uy.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id ;
    @Column(name = "name")
    private String  name ;
    @Column(name = "surname")
    private String surname ;
    @Column(name = "phone")
    private String phone;
    @Column(name = "createdDate")
    private LocalDateTime createdDate;

}
