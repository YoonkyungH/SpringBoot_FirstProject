package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // DB가 해당 객체를 인식 가능하도록 함
@AllArgsConstructor
@ToString
public class Article {

    @Id // 대표값을 지정 (마치 주민등록번호처럼 title과 content가 달라도 구분짓도록)
    @GeneratedValue // 1, 2, 3 ... 처럼 알아서 어노테이션
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

}
