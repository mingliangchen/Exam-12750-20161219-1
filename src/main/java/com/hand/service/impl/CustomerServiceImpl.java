package com.hand.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.dao.CustomerDao;
import com.hand.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerDao customerDao;
	@Override
	public boolean login(String first_name) {
		int i=customerDao.SelectByName(first_name);
		if(i==0){
			return false;			
		}
		return true;
	}

}
