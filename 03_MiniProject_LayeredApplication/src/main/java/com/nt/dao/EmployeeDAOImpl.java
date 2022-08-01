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


@Repository("empdao")
public class EmployeeDAOImpl implements IEmployeeDAO {
	
	private static final String GET_EMPLOYEE_DETAILS="SELECT * FROM EMPLOYEE1 WHERE DESG IN (?,?,?)";
	
	@Autowired
	private DataSource ds; 
	

	@Override
	public List<Employee> getEmployee(String desg1, String desg2, String desg3) throws Exception {
		
		List<Employee> list=null;
	
		try(Connection con=ds.getConnection();
			PreparedStatement ps=con.prepareStatement(GET_EMPLOYEE_DETAILS)){
		
			if(ps !=null) {
				ps.setString(1, desg1);
				ps.setString(2, desg2);
				ps.setString(3, desg3);		
				ps.execute();
			}
			try(ResultSet rs=ps.executeQuery()){
				list=new ArrayList();
				if(rs !=null) {					
					while(rs.next()) {
						Employee emp=new Employee();
						emp.setEno(rs.getInt(1));
						emp.setEname(rs.getString(2));
						emp.setSal(rs.getDouble(3));
						emp.setDeptNo(rs.getString(4));
						emp.setDesg(rs.getString(5));
						
						list.add(emp);
					}
				}
			}
			
		}//try with resource
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	
		return list;
	}

}
