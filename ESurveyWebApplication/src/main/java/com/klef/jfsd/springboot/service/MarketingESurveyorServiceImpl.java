package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Customer;
import com.klef.jfsd.springboot.model.MarketingESurveyor;
import com.klef.jfsd.springboot.repository.CustomerRepository;
import com.klef.jfsd.springboot.repository.MarketingESurveyorRepository;

@Service
public class MarketingESurveyorServiceImpl implements MarketingESurveyorService{

	@Autowired
	private MarketingESurveyorRepository marketingeSurveyorRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public MarketingESurveyor addGovtESurveyor(MarketingESurveyor marketingESurveyor) {

		return marketingeSurveyorRepository.save(marketingESurveyor);
	}

	@Override
	public List<MarketingESurveyor> viewallMarketingSurveyors() {

		return (List<MarketingESurveyor>) marketingeSurveyorRepository.findAll();
	}

	@Override
	public List<Customer> viewallCustomerSurveyors() {

		return (List<Customer>) customerRepository.findAll();
	}

}
