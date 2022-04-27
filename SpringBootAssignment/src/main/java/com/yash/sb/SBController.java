package com.yash.sb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.yash.sb.model.*;
import com.yash.sb.dao.*;
@Controller
public class SBController {
	 @Autowired
	 AuthorDAO objauthordao;
	 
	  @Autowired
	  BookDAO bookobj;
	  
	  @Autowired
	  PublisherDAO publisherobj;
	 
	@RequestMapping("/index")
	public String index()
	{
		//System.out.println("hello how are you ");
		return "index";
	}
	@RequestMapping("/addauthor")
	public String m1()
	{
		return "addauthor";
	}
	@RequestMapping("/addbook")
	public String m2()
	{
		return "addbook";
	}
	@RequestMapping("/addpublisher")
	public String m3()
	{
		return "addpublisher";
	}
	@RequestMapping(value="/saveAuthor", method=RequestMethod.POST)
	public ModelAndView saveAuthor(@ModelAttribute Author objuser)
	{
		ModelAndView objmv = new ModelAndView();
		 
		if(objauthordao.addAuthor(objuser)==1)
		{
			 
			objmv.setViewName("success");
			objmv.addObject("author",objuser);	
		
		return objmv;
		}
		else
		{
			objmv.setViewName("addauthor");
			return objmv;
		}
	}
	
	@RequestMapping(value="/saveBook", method=RequestMethod.POST)
	public ModelAndView saveBook(@ModelAttribute Book objuser)
	{
		ModelAndView objmv = new ModelAndView();
		 
		if(bookobj.addBook(objuser)==1)
		{
			 
			objmv.setViewName("success");
			objmv.addObject("book",objuser);	
		
		return objmv;
		}
		else
		{
			objmv.setViewName("addbook");
			return objmv;
		}
	}
	
	@RequestMapping(value="/savePublisher", method=RequestMethod.POST)
	public ModelAndView savePublisher(@ModelAttribute Publisher objuser)
	{
		ModelAndView objmv = new ModelAndView();
		 
		if(publisherobj.addPublisher(objuser)==1)
		{
			 
			objmv.setViewName("success");
			objmv.addObject("publisher",objuser);	
		
		return objmv;
		}
		else
		{
			objmv.setViewName("addpublisher");
			return objmv;
		}
	}
	
	@RequestMapping(value="/showallauthor")
	public ModelAndView authorlist()
	{
		List<Author> authorlist=objauthordao.getAllAuthor();
 		ModelAndView objmv = new ModelAndView();
 		
		objmv.addObject("authorlist",authorlist);	
		objmv.setViewName("authorlist");
		return objmv;
	}
	
	@RequestMapping(value="/showallbook")
	public ModelAndView booklist()
	{
		List<Book> booklist=bookobj.getAllBook();
 		ModelAndView objmv = new ModelAndView();
 		
		objmv.addObject("booklist",booklist);	
		objmv.setViewName("booklist");
		return objmv;
	}
	
	@RequestMapping(value="/showallpublisher")
	public ModelAndView publisherlist()
	{
		List<Publisher> publisherlist=publisherobj.getAllPublisher();
 		ModelAndView objmv = new ModelAndView();
 		
		objmv.addObject("publisherlist",publisherlist);	
		objmv.setViewName("publisherlist");
		return objmv;
	}
}

