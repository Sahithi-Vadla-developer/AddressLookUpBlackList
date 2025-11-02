package com.Address.Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Address.Model.Address;

@Service
public class AddressServiceImpl  implements AddressService{

	@Override
	public List<Address> getAddressByPostCode(String postcode) {
		
		return Arrays.asList(
				new Address("123WOLk","HYD",postcode),
				new Address("52PRTP","CHENNAI",postcode),
				new Address("48WrGlYD","HYD",postcode),
				new Address("36WOLk","PUNE",postcode),
				new Address("85WOLk","HYD",postcode));
				
	}                  

	

	
	

}
