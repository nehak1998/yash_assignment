package com.yash.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

	
	@RequestMapping("/itemsubmit")
	public String ItemSubmit(HttpServletRequest req,Model m)
	{
		String itemname=req.getParameter("item");
		String itemprice=req.getParameter("price");
		String qty=req.getParameter("qty");
		
		String discount=req.getParameter("disc");
		int a=Integer.parseInt(itemprice);
		int b=Integer.parseInt(discount);
		int c=Integer.parseInt(qty);
		
		int x=a*c;
		int y=(x * b)/100;
		int discountprice = x-y;
		m.addAttribute("itemname", itemname);
		m.addAttribute("itemprice", itemprice);
		m.addAttribute("qty", qty);
		m.addAttribute("discount", discount);
		m.addAttribute("discountprice", discountprice);
		
		return "display";
	}
}
