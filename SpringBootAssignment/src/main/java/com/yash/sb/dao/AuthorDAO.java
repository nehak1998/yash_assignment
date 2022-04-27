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
public class AuthorDAO {
	  @Autowired
	  JdbcTemplate jdbc;
	public int addAuthor(Author objuser)
	{
		if(jdbc!=null)
		{
		int rcount;
		rcount= jdbc.update("insert into author(name,email) values(?,?)",objuser.getName(),objuser.getEmail());
		return rcount;
		}
		return 0;
	}
	public List<Author> getAllAuthor()
	{
		return jdbc.query("select * from author", new RowMapper<Author>() {
			public Author mapRow(ResultSet rs,int rowno) throws SQLException
			{
				Author obju = new Author();
				obju.setAid(rs.getInt("aid"));
				obju.setName(rs.getString("name"));
				obju.setEmail(rs.getString("email"));
				 
				return obju;
			}
		});	
	}	

}
