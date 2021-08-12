package com.ditian.pojo;

import lombok.AllArgsConstructor;

import java.sql.Date;

@AllArgsConstructor
public class Employees {
    private int empNo;
    private Date birthDate;
    private String firstName;
    private String lastName;
    private String gender;
    private Date hireDate;
}
