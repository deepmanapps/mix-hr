package com.mix.hr.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PayGrade {
    @Id
    private String payGradeId;
    private String payGradeName;
    private String comments;
}
