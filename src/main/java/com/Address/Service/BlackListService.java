package com.Address.Service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;
@Service
public class BlackListService {

	
	public final Set<String> blackListPostCode=new HashSet<>();
	
	public BlackListService() {  
	
	
	blackListPostCode.add("ABC209");
	blackListPostCode.add("XYZ013"); //blacklisted-postcodes
	blackListPostCode.add("STV102");
	}
	public boolean isBlackListed(String postcode) {
		return blackListPostCode.stream().anyMatch(postcode::startsWith);
	}
	
}
