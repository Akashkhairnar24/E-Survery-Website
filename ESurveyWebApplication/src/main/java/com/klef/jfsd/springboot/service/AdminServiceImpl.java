package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.GovtESurveyor;
import com.klef.jfsd.springboot.model.MarketingESurveyor;
import com.klef.jfsd.springboot.repository.AdminRepository;
import com.klef.jfsd.springboot.repository.GovtESurveyorRepository;
import com.klef.jfsd.springboot.repository.MarketingESurveyorRepository;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private GovtESurveyorRepository govteSurveyorRepository;
	
	@Autowired
	private MarketingESurveyorRepository marketingeSurveyorRepository;
	
	@Override
	public Admin checkadminlogin(String uname, String pwd) {
		return adminRepository.checkadminlogin(uname, pwd);
	}

	@Override
	public List<GovtESurveyor> viewallGovtSurveyors() {

		return (List<GovtESurveyor>) govteSurveyorRepository.findAll();
	}


	@Override
	public List<MarketingESurveyor> viewallMarketingSurveyors() {

		return (List<MarketingESurveyor>) marketingeSurveyorRepository.findAll();
	}

	

}
