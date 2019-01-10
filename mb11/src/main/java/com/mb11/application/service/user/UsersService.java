package com.mb11.application.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mb11.application.daoImpl.user.UsersDaoImpl;
import com.mb11.application.model.user.Users;

@Service
public class UsersService {
	
	@Autowired
	private UsersDaoImpl usersDao;
	
	public Users getUsersById(Long id) {
		Users obj = usersDao.getUsersById(id);
		return obj;
	}	
	
	public List<Users> getAllUsers(){
		return usersDao.getAllUsers();
	}
	
	public synchronized boolean addUsers(Users usr){
	       
		usersDao.addUsers(usr);
	    	   return true;	       
		}
	
	public void updateUsers(Users usr) {
		usersDao.updateUsers(usr);
	}
	
	
	public void deleteUsers(Long id) {
		usersDao.deleteUsers(id);
	}
	
	
	
	
	

}
