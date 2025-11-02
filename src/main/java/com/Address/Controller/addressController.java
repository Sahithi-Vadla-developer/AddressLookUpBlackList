package com.Address.Controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Address.Model.Address;
import com.Address.Model.AddressRequest;
import com.Address.Service.AddressService;
import com.Address.Service.BlackListService;

@RestController
public class addressController {
	
	
	private  AddressService addressService ; 
	
	private  BlackListService blackListService;//final 
	@Autowired
	public addressController(AddressService addressService, BlackListService blackListService) {
		
	this.addressService = addressService;
		this.blackListService = blackListService;
	}
	@PostMapping("/lookUp")
	public List<Address> lookUpAddress(@RequestBody AddressRequest adReq){
		String postcode = adReq.getPostcode();
		
		 System.out.println("Postcode: " + postcode + ", filter: " + adReq.isFilteredBlackList());
		 
		if(adReq.isFilteredBlackList() && blackListService.isBlackListed(postcode)) {
		return Collections.emptyList();
	}
		return addressService.getAddressByPostCode(postcode);
		
	

}}
