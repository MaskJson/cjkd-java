package com.moving.admin.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "exercise")
public class Exercise extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private Long subjectId;

    private String userId;

    private Integer status; // 1:正确 2：错误

    private Integer lastStatus; // 最后状态
}
