package com.jobiak.empapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobiak.empapi.Mobile;
import com.jobiak.empapi.repository.MobileRepository;

@Service
public class MobileService {

	
	@Autowired
	MobileRepository repo;
	
	public Mobile addMobile(Mobile mobile) {
		
		Mobile ref=new Mobile();
		return ref;
	}
}
