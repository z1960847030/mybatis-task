package com.ditian.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeptEmp {
    private int empNo;
    private String deptNo;
    private String deptName;
    private Date fromDate;
    private Date toDate;
    private String firstName;
    private String lastName;
    private String gender;
    private Date hireDate;
    private Date birthDate;

}
