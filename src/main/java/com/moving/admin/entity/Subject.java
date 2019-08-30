package com.moving.admin.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "sys_subject")
public class Subject extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private Integer itemType;

    private String a;

    private String b;

    private String c;

    private String d;

    private String bestanswer;

    private String bestanswerid;

    private String imageurl;

    private String question;

    private String sinaimg;

    private String ta;

    private Integer questionType = 1;
}
