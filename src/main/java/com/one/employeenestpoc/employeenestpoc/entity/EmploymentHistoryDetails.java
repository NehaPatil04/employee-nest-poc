package com.one.employeenestpoc.employeenestpoc.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmploymentHistoryDetails {
    @Id
    @NotNull
    private Integer historyId;
    private String employerName;

    @JsonFormat(pattern = "dd-MM-YYYY")
    private Date startDate;

    @JsonFormat(pattern = "dd-MM-YYYY")
    private Date endDate;

    private Integer pf;
    private Integer salary;

    @ManyToOne
    @JoinColumn(name = "empId")
    Employee employee;

    private byte[] offerLetter;
    private byte[] relievingLetter;

}
