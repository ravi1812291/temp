package com.mb11.application.dao.user;

import java.util.List;


import com.mb11.application.model.user.Users;



public interface UsersDAO {
	
	List<Users> getAllUsers();
	
	Users getUsersById(Long id);
	
	void addUsers(Users users);
	
	void updateUsers(Users users);
	
	void deleteUsers(Long id);
	
	

}
