import com.ditian.mapper.DeptEmpMapper;
import com.ditian.pojo.DeptEmp;
import com.ditian.pojo.DeptManager;
import com.ditian.pojo.Employees;
import com.ditian.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Date;
import java.util.List;

public class MyTest {

    //员工
    @Test
    //增加员工到employess
    public void addEmployees(){

        Date date = Date.valueOf("1999-09-05");
        SqlSession sqlSession = new MybatisUtils().getSqlSession();
        DeptEmpMapper mapper = sqlSession.getMapper(DeptEmpMapper.class);
        Employees employees = new Employees(1,date,"zou","sx","M",date);
        mapper.addEmployee(employees);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    //根据编号在employees表中删除员工
    public void deleteEmployees(){

        SqlSession sqlSession = new MybatisUtils().getSqlSession();
        DeptEmpMapper mapper = sqlSession.getMapper(DeptEmpMapper.class);
        mapper.deleteEmployee(1);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    //更改employees表中的信息
    public void updateEmployees(){

        Date date = Date.valueOf("1999-09-05");
        SqlSession sqlSession = new MybatisUtils().getSqlSession();
        DeptEmpMapper mapper = sqlSession.getMapper(DeptEmpMapper.class);
        Employees employees = new Employees(1,date,"zou","sx","M",date);
        mapper.upadteEmployee(employees);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    //根据编号查询对应员工信息
    public void querydeptEmpById(){

        SqlSession sqlSession = new MybatisUtils().getSqlSession();
        DeptEmpMapper mapper = sqlSession.getMapper(DeptEmpMapper.class);

        List<DeptEmp> DeptEmps = mapper.querydeptEmpById(10003);
        for (DeptEmp deptEmp : DeptEmps) {
            System.out.println(deptEmp);
        }
        sqlSession.close();
    }

    //查询所有经理
    @Test
    public void querydeptManager(){

        SqlSession sqlSession = new MybatisUtils().getSqlSession();
        DeptEmpMapper mapper = sqlSession.getMapper(DeptEmpMapper.class);
        List<DeptManager> DeptManagers = mapper.querydeptManager();
        for (DeptManager deptManager : DeptManagers) {
            System.out.println(deptManager);
        }

        sqlSession.close();
    }

    @Test
    //根据编号查询对应经理
    public void querydeptManagerById(){

        SqlSession sqlSession = new MybatisUtils().getSqlSession();
        DeptEmpMapper mapper = sqlSession.getMapper(DeptEmpMapper.class);
        DeptManager deptManager = mapper.querydeptManagerById(110022);
        System.out.println(deptManager);
        sqlSession.close();
    }
}
