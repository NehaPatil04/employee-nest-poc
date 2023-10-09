package com.one.employeenestpoc.employeenestpoc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EducationDetails {
    @Id
    private Integer edId;
    private String qualification;
    private String instituteName;
    private String university;
    private Date startDate;
    private Date endDate;
    private byte[] document;

    @ManyToOne
    @JoinColumn(name = "empId")
    Employee employee;
}
