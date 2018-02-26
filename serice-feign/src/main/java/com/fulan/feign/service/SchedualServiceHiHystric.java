package com.fulan.feign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHiService {

	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry "+name;
	}

}
