package com.one.employeenestpoc.employeenestpoc.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmploymentDetails {

    @Id
    @NotNull
    private Integer empDetailsId;

    @OneToOne
    @JoinColumn(name = "empId")
    Employee employee;

    @JsonFormat(pattern = "dd-MM-YYYY")
    private Date dateOfJoining;

    private String jobTitle;
    private String department;

    @NotNull
    private String noticePeriod;

    private String workerType;
    private String level;
    private String shift;
    private String l1Manager;
    private String l2Manager;
    private String project;

    @Email(message = "Email is not valid",regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}",
            flags = Pattern.Flag.CASE_INSENSITIVE)
    @NotEmpty(message = "Email cannot be empty")
    private String officeEmail;
}
