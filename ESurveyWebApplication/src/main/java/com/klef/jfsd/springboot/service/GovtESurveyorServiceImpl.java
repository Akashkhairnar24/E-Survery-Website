package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Customer;
import com.klef.jfsd.springboot.model.GovtESurveyor;
import com.klef.jfsd.springboot.repository.CustomerRepository;
import com.klef.jfsd.springboot.repository.GovtESurveyorRepository;

@Service
public class GovtESurveyorServiceImpl implements GovtESurveyorService{

	@Autowired
	private GovtESurveyorRepository govteSurveyorRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<GovtESurveyor> viewallGovtSurveyors() {

		return (List<GovtESurveyor>) govteSurveyorRepository.findAll();

	}

	@Override
	public List<Customer> viewallCustomerSurveyors() {

		return (List<Customer>) customerRepository.findAll();

	}

	@Override
	public GovtESurveyor addGovtESurveyor(GovtESurveyor govtESurveyor) {
		return govteSurveyorRepository.save(govtESurveyor);
		
	}
	
	
	
}
