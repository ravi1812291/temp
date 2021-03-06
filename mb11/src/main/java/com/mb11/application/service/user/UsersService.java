package com.mb11.application.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mb11.application.daoImpl.user.UsersDaoImpl;
import com.mb11.application.model.user.Users;

// TODO: Auto-generated Javadoc
/**
 * The Class UsersService.
 */
@Service
public class UsersService {
	
	/** The users dao. */
	@Autowired
	private UsersDaoImpl usersDao;
	
	/**
	 * Gets the users by id.
	 *
	 * @param id the id
	 * @return the users by id
	 */
	public Users getUsersById(Long id) {
		Users obj = usersDao.getUsersById(id);
		return obj;
	}	
	
	/**
	 * Gets the all users.
	 *
	 * @return the all users
	 */
	public List<Users> getAllUsers(){
		return usersDao.getAllUsers();
	}
	
	/**
	 * Adds the users.
	 *
	 * @param usr the usr
	 * @return true, if successful
	 */
	public synchronized boolean addUsers(Users usr){
	       
		usersDao.addUsers(usr);
	    	   return true;	       
		}
	
	/**
	 * Update users.
	 *
	 * @param usr the usr
	 */
	public void updateUsers(Users usr) {
		usersDao.updateUsers(usr);
	}
	
	
	/**
	 * Delete users.
	 *
	 * @param id the id
	 */
	public void deleteUsers(Long id) {
		usersDao.deleteUsers(id);
	}
	
	
	
	
	

}
