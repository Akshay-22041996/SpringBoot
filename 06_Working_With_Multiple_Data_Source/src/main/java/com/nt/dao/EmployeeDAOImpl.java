package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("dao")

public class EmployeeDAOImpl implements IEmployeeDAO{

	private static final String GET_EMPLOYEE_BY_DESG="SELECT * FROM EMPLOYEE1 WHERE DESG IN (?,?,?)";
	
	
	@Autowired
	private DataSource ds;
	@Override
	public List<Employee> getEmployee(String desg1, String desg2, String desg3) {
		List<Employee> list=null;
		
		try(Connection con=ds.getConnection();
			PreparedStatement ps=con.prepareStatement(GET_EMPLOYEE_BY_DESG)){
			
			if(ps !=null) {
				ps.setString(1, desg1);
				ps.setString(2, desg2);
				ps.setString(3, desg3);
				ps.execute();
				
			}
			System.out.println("DATASOURCE CLASS NAME::"+ds.getClass());
			try(ResultSet rs=ps.executeQuery()){
				 list=new ArrayList();
				 
				while(rs.next()) {
					Employee emp=new Employee();
					emp.setEid(rs.getInt(1));
					emp.setEname(rs.getString(2));	
					emp.setSal(rs.getDouble(3));
					emp.setDesg(rs.getString(4));
					emp.setDept(rs.getInt(5));
					list.add(emp);
				}
				 
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("problem in connection with DB");
		}
		return list;
	}

}
