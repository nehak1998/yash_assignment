package com.yash.sb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.yash.sb.model.Book;

@Component
public class BookDAO {
	 @Autowired
	  JdbcTemplate jdbc;
	public int addBook(Book objuser)
	{
		if(jdbc!=null)
		{
		int rcount;
		rcount= jdbc.update("insert into book(title,price,aid,pid) values(?,?,?,?)",objuser.getTitle(),objuser.getPrice(),objuser.getAid(),objuser.getPid());
		return rcount;
		}
		return 0;
	}
	public List<Book> getAllBook()
	{
		return jdbc.query("select * from book", new RowMapper<Book>() {
			public Book mapRow(ResultSet rs,int rowno) throws SQLException
			{
				Book obju = new Book();
				obju.setBid(rs.getInt("bid"));
				obju.setTitle(rs.getString("title"));
				obju.setPrice(rs.getFloat("price"));
				obju.setAid(rs.getInt("aid"));
				obju.setPid(rs.getInt("pid"));
				 
				return obju;
			}
		});	
	}	
	
}
