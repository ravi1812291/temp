package com.mb11.application.dao.user;

import java.util.List;

import com.mb11.application.model.user.Address;



public interface AddressDAO {
	
List<Address> getAllAddress();
	
	Address getAddressById(Long id);
	
	void addAddress(Address address);
	
	void updateAddress(Address address);
	
	void deleteAddress(Long id);

}
