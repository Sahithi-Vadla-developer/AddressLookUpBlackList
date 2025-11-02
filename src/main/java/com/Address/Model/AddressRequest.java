package com.Address.Model;

public class AddressRequest {
	
	private String postcode;
	
	private boolean filteredBlackList;
	

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public boolean isFilteredBlackList() {
		return filteredBlackList;
	}

	public void setFilteredBlackList(boolean filteredBlackList) {
		this.filteredBlackList = filteredBlackList;
	}
	

}
