package com.Address.Service;



import java.util.List;

import com.Address.Model.Address;



public interface AddressService {// creating an interface 
	                               //adding method here ,that we will override in implementation class getAddress
	
	List<Address> getAddressByPostCode(String postcode);
	
	
	
	
	
	
	
	
	
	

}
