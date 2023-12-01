package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Customer;
import com.klef.jfsd.springboot.model.GovtESurveyor;

public interface GovtESurveyorService {
	public GovtESurveyor addGovtESurveyor(GovtESurveyor govtESurveyor);
	public List<GovtESurveyor> viewallGovtSurveyors();
	public List<Customer> viewallCustomerSurveyors();

}
