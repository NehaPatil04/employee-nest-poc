package com.one.employeenestpoc.employeenestpoc.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Documents {
    @Id
    private Integer docId;

    @OneToOne
    @JoinColumn(name = "empId")
    Employee employee;

    private byte[] aadhaarCard;
    private byte[] panCard;
    private byte[] drivingLetter;
    private byte[] form16;
    private byte[] offerLetter;
    private byte[] relievingLetter;
    private byte[] resume;


}
