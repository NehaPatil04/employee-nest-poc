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
public class PersonalInformation {

    @Id
    @NotNull
    private Integer perInfo;

    @OneToOne
    @JoinColumn(name = "empId")
    Employee employee;

    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private String maritalStatus;

    @JsonFormat(pattern = "dd-MM-YYYY")
    private Date dateOfBirth;

    private String bloodGroup;
    private Boolean isDisabled;
    private String disabledDesc;
    private String currentAddress;
    private String permanentAddress;

    @Email(message = "Email is not valid",regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}",
            flags = Pattern.Flag.CASE_INSENSITIVE)
    @NotEmpty(message = "Email cannot be empty")
    private String personalEmail;

    private Integer contact;

}
