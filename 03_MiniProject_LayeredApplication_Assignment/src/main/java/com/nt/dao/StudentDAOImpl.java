package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.StudentInfo;

@Repository("dao")
public class StudentDAOImpl implements IStudentDAO {
	private static final String GET_STUDENT_BY_SUBJECT=" SELECT * FROM COPY3 WHERE SUBJECT IN(?,?,?) ORDER BY SUBJECT";
	
	@Autowired
	private DataSource ds;

	@Override
	public List<StudentInfo> getStudent(String sub1, String sub2, String sub3) throws Exception {
		
		List<StudentInfo> list=null;
		try(Connection con=ds.getConnection();
			PreparedStatement ps=con.prepareStatement(GET_STUDENT_BY_SUBJECT)){
			
			if(ps !=null) {
				ps.setString(1, sub1);
				ps.setString(2, sub2);
				ps.setString(3, sub3);
			}
			try(ResultSet rs=ps.executeQuery()){
				list=new ArrayList();
				if(rs !=null) {
					while(rs.next()) {
						
						StudentInfo si=new StudentInfo();
						si.setSno(rs.getInt(1));
						si.setSname(rs.getString(2));
						si.setSub(rs.getString(3));
						si.setMark(rs.getInt(4));
						
						list.add(si);
						
					}
					System.out.println("Size of list is :: "+list.size());
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
			
		}
		return list;
	}

}
