package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("dao")
public class EmployeeDAOImpl implements IEmployeeDAO{
	private static final String GET_EMPLOYEE_BY_ID="SELECT ENO,ENAME,SAL,DESG,DEPTNO FROM EMPLOYEE1 WHERE ENO=?";
	
	@Autowired
	private DataSource ds;
	
	public EmployeeDAOImpl() {
		System.out.println("EmployeeDAOImpl::Dao class is execution");
	}

	@Override
	public List<Employee> getEmployeeDao(int eno) throws Exception {
		
		 List<Employee> list=null;
		try(Connection con=ds.getConnection();
			PreparedStatement ps=con.prepareStatement(GET_EMPLOYEE_BY_ID)){
			
			if(ps !=null) {
				ps.setInt(1, eno);
				ps.execute();
			}
			try(ResultSet rs=ps.executeQuery()){
				list=new ArrayList();
				if(rs !=null) {
					while(rs.next()) {
						Employee emp=new Employee();
						System.out.println("in while loop of dao class");
					emp.setEno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setSal(rs.getDouble(3));
					emp.setDesg(rs.getString(4));
					emp.setDept(rs.getInt(5));
						list.add(emp);
					}
				}
			}
		}
		return list;
	}

}
