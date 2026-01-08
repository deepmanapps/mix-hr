package com.mix.hr.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Person extends Party {

    private String salutation;
    private String firstName;
    private String middleName;
    private String lastName;
    private String personalTitle;
    private String suffix;
    private String nickname;
    private String gender; // M, F
    private LocalDate birthDate;
    private String maritalStatus;
    private String socialSecurityNumber;

    // Add other relevant fields if needed
}
