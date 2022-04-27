package com.yash.sb.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.RowMapper;
import com.yash.sb.model.*;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@Component
public class PublisherDAO {
	  @Autowired
	  JdbcTemplate jdbc;
	public int addPublisher(Publisher objuser)
	{
		if(jdbc!=null)
		{
		int rcount;
		rcount= jdbc.update("insert into publisher(name,email,address) values(?,?,?)",objuser.getName(),objuser.getEmail(),objuser.getAddress());
		return rcount;
		}
		return 0;
	}
	public List<Publisher> getAllPublisher()
	{
		return jdbc.query("select * from publisher", new RowMapper<Publisher>() {
			public Publisher mapRow(ResultSet rs,int rowno) throws SQLException
			{
				Publisher obju = new Publisher();
				obju.setPid(rs.getInt("pid"));
				obju.setName(rs.getString("name"));
				obju.setEmail(rs.getString("email"));
				obju.setAddress(rs.getString("address"));
				 
				return obju;
			}
		});	
	}	

}
