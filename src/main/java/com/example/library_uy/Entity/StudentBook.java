package com.example.library_uy.Entity;

import com.example.library_uy.Enums.StudentBookStatus;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "student_book")
public class StudentBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private  Student student;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")
    private Book book;
    @Column(name = "createDate")
    private LocalDateTime createdDate;
    @Column(name = "returneDate")
    private LocalDateTime returnedDate;
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StudentBookStatus status;
    @Column(name = "returnDate")
    private LocalDateTime returneDate;
    @Column(name = "duration")
    private  LocalDateTime Duration;

}
