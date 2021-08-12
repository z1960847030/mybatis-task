package com.ditian.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeptManager {
    private int empNo;
    private String deptNo;
    private Date fromDate;
    private Date toDate;
    private String deptName;
}
