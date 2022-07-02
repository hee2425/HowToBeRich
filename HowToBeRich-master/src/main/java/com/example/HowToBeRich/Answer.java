package com.example.HowToBeRich;

//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.data.annotation.CreatedDate;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//import javax.persistence.ManyToOne;
//
//@Getter
//@Setter
//@Entity
//public class Answer {
//    @Id     // 기본키
//    @GeneratedValue(strategy = GenerationType.IDENTITY) // 1씩 자동 증가
//    private Integer id;
//
//    @Column(columnDefinition = "TEXT")
//    private String content;
//
//    @CreatedDate
//    private LocalDateTime createDate;
//
//    @ManyToOne // ForeignKey 설정
//    private Question question;
//}
//
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @ManyToOne
    private Question question;
}