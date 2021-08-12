package com.ditian.mapper;

import com.ditian.pojo.DeptEmp;
import com.ditian.pojo.DeptManager;
import com.ditian.pojo.Employees;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptEmpMapper {

        //员工
        //根据编号查询对应员工信息
        List<DeptEmp> querydeptEmpById(@Param("empNo") int id);

        //增加员工到employees
        int addEmployee(Employees employees);

        //根据编号在employees表中删除员工
        int deleteEmployee (int empNo);

        //在employees表中更改员工信息
        int upadteEmployee(Employees employees);

        //增加员工
        int addeptEmp(DeptEmp deptEmp);

        //删除员工
        int deletedeptEmp(int empNo);



        //经理
         //查询所有经理
        List<DeptManager> querydeptManager();

        //根据编号查询对应经理
        DeptManager querydeptManagerById(int empNo);

        //增加经理
        int addManager(DeptManager deptManager);

}
