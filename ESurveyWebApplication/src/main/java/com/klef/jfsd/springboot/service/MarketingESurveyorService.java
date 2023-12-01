package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Customer;
import com.klef.jfsd.springboot.model.MarketingESurveyor;

public interface MarketingESurveyorService {
	public MarketingESurveyor addGovtESurveyor(MarketingESurveyor marketingESurveyor);
	public List<MarketingESurveyor> viewallMarketingSurveyors();
	public List<Customer> viewallCustomerSurveyors();
}
