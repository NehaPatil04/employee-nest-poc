package com.one.employeenestpoc.employeenestpoc.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @NotNull
//    @Column(name = "emp_id")
    private Integer empId;
//    @Column(name = "emp_name")
    private String empName;
//    @Column(name = "work_location")
    private String workLocation;
    private String jobTitle;
    private String managerId;
    private Integer salary;

    @Email(message = "Email is not valid",regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}",
            flags = Pattern.Flag.CASE_INSENSITIVE)
    @NotEmpty(message = "Email cannot be empty")
    private String email;

    private Integer contact;
    private String department;
    private Boolean activeStatus;

    @OneToOne
    private PersonalInformation personalInformation;

    @OneToOne
    private EmploymentDetails employmentDetails;

    @OneToOne
    private Documents documents;

    @OneToOne
    private Leaves leaves;

    @OneToMany(cascade = CascadeType.ALL)
    private List<EmploymentHistoryDetails> employmentHistoryDetails;

    @OneToMany(cascade = CascadeType.ALL)
    private List<EducationDetails> educationDetails;
}
