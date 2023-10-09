package com.one.employeenestpoc.employeenestpoc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Leaves {
    @Id
    private Integer levId;

    @OneToOne
    @JoinColumn(name = "empId")
    Employee employee;

    private Integer earnedLeaves;
    private Integer sickLeaves;
    private Integer casualLeaves;
    private Integer carryForward;
    private Integer unpaidLeaves;
}
