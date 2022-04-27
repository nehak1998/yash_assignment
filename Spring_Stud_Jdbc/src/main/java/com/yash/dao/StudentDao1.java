package com.yash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.yash.model.*;
public class StudentDao1 {
	JdbcTemplate objJDBC;

	public JdbcTemplate getObjJDBC() {
		return objJDBC;
	}

	public void setObjJDBC(JdbcTemplate objJDBC) {
		this.objJDBC = objJDBC;
	}
	
	public int saveStud(Student1 objS)
	{
		String query ="insert into student(first_name,last_name,father_name,mother_name,class_name,section,DOB,date_of_admission,gender,address1,address2,student_phoneno,parent_phoneno,parent_email,cityid) values ('"+objS.getfirst_name()+"','"+objS.getlast_name()+"','"+objS.getfather_name()+"','"+objS.getmother_name()+"','"+objS.getclass_name()+"','"+objS.getsection()+"','"+objS.getDOB()+"','"+objS.getdate_of_admission()+"','"+objS.getgender()+"','"+objS.getaddress1()+"','"+objS.getaddress2()+"','"+objS.getstudent_phoneno()+"','"+objS.getparent_phoneno()+"','"+objS.getparent_email()+"','"+objS.getcityid()+"')";
		int no;
		no = objJDBC.update(query); 
		return no;
	}
	
	public int updateStud(Student1 objS)
	{
		String query="update student set first_name='"+objS.getfirst_name()+"',last_name='"+objS.getlast_name()+"',father_name='"+objS.getfather_name()+"',mother_name='"+objS.getmother_name()+"',class_name='"+objS.getclass_name()+"',section='"+objS.getsection()+"',DOB='"+objS.getDOB()+"',date_of_admission='"+objS.getdate_of_admission()+"',gender='"+objS.getgender()+"',address1='"+objS.getaddress1()+"',address2='"+objS.getaddress2()+"',student_phoneno='"+objS.getstudent_phoneno()+"',parent_phoneno='"+objS.getparent_phoneno()+"',parent_email='"+objS.getparent_email()+"',cityid='"+objS.getcityid()+"' where sid="+objS.getsid();
		int no;
		no =objJDBC.update(query);
		return no;
			
	}
	public int deleteStud(int sid)
	{
		String query ="delete from student where sid="+sid;
		return objJDBC.update(query);
	}
	
	public List<Student1> getAllRecordStud()
	{
		
		return objJDBC.query("select * from student", new ResultSetExtractor<List<Student1>>() {
			
		//@Override
		public List<Student1> extractData(ResultSet rs) throws SQLException, DataAccessException
		{
			List <Student1> studlist=new ArrayList<Student1>();
				while(rs.next())
				{
					Student1 s1=new Student1();
					
					s1.setsid(rs.getInt("sid"));
					s1.setfirst_name(rs.getString("first_name"));
					s1.setlast_name(rs.getString("last_name"));
					s1.setfather_name(rs.getString("father_name"));
					s1.setmother_name(rs.getString("mother_name"));
					s1.setclass_name(rs.getString("class_name"));
					s1.setsection(rs.getString("section"));
					s1.setDOB(rs.getString("DOB"));
					s1.setdate_of_admission(rs.getString("date_of_admission"));
					s1.setgender(rs.getString("gender"));
					s1.setaddress1(rs.getString("address1"));
					s1.setaddress2(rs.getString("address2"));
					s1.setstudent_phoneno(rs.getString("student_phoneno"));
					s1.setparent_phoneno(rs.getString("parent_phoneno"));
					s1.setparent_email(rs.getString("parent_email"));
					s1.setcityid(rs.getInt("cityid"));
					studlist.add(s1);
				}
		return studlist;		
			}
		});
	}
}
