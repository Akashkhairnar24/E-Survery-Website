package com.klef.jfsd.springboot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Customer;
import com.klef.jfsd.springboot.service.AdminService;
import com.klef.jfsd.springboot.service.CustomerService;
import com.klef.jfsd.springboot.service.GovtESurveyorService;
import com.klef.jfsd.springboot.service.MarketingESurveyorService;

@RestController
public class ClientController {
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private GovtESurveyorService govteSurveyorService;
	
	@Autowired 
	private MarketingESurveyorService marketingeSurveyorService;
	
	@GetMapping("/")
	public ModelAndView mainhomedemo()
	{
ModelAndView mv=new ModelAndView("index");
		
		return mv;
	}
	
	
	
	@GetMapping("/adminlogin")
	public ModelAndView adminlogindemo()
	{
		ModelAndView mv=new ModelAndView("adminlogin");
		
		return mv;
	}
	
	@GetMapping("/adminhome")
	public ModelAndView adminhomedemo()
	{
		ModelAndView mv=new ModelAndView("adminhome");
		
		return mv;
	}
	
	@PostMapping("/checkadminlogin")
	public ModelAndView checkadminlogindemo(HttpServletRequest request)
	{
		ModelAndView mv=new ModelAndView();
		
		
		String auname=request.getParameter("auname");
		String apwd=request.getParameter("apwd");
		Admin admin=adminService.checkadminlogin(auname, apwd);
		
		if(admin!=null)
		{
HttpSession session=request.getSession(false);
			
			session.setAttribute("auname", auname);
			mv.setViewName("adminhome");
			
		}
		else 
		{
			mv.setViewName("adminlogin");
			mv.addObject("msg","Login Failed");
		}
		
		return mv;
	}
	
	@PostMapping("/checkcustomerlogin")
	public ModelAndView checkcustomerlogindemo(HttpServletRequest request)
	{
		ModelAndView mv=new ModelAndView();
		
		
		String auname=request.getParameter("auname");
		String apwd=request.getParameter("apwd");
		Customer customer=customerService.checkcustomerlogin(auname, apwd);
		
		if(customer!=null)
		{
HttpSession session=request.getSession(false);
			
			session.setAttribute("auname", auname);
			mv.setViewName("adminhome");
			
		}
		else 
		{
			mv.setViewName("customerlogin");
			mv.addObject("msg","Login Failed");
		}
		
		return mv;
	}
	
	@GetMapping("/customerregistration")
	public ModelAndView customerregdemo()
	{
		ModelAndView mv=new ModelAndView("customerregistration","customer",new Customer());
		
		return mv;
	}
	
	@GetMapping("/customerlogin")
	public ModelAndView customerlogindemo()
	{
		ModelAndView mv=new ModelAndView("customerlogin");
		
		return mv;
	}
	
	@GetMapping("/samplesurvey")
	public ModelAndView samplesurveydemo() {
ModelAndView mv=new ModelAndView("govrnmentsample");
		
		return mv;
	}
	
}
