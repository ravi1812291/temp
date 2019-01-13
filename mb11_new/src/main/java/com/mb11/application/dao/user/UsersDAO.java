package com.mb11.application.dao.user;

import java.util.List;


import com.mb11.application.model.user.Users;



// TODO: Auto-generated Javadoc
/**
 * The Interface UsersDAO.
 */
public interface UsersDAO {
	
	/**
	 * Gets the all users.
	 *
	 * @return the all users
	 */
	List<Users> getAllUsers();
	
	/**
	 * Gets the users by id.
	 *
	 * @param id the id
	 * @return the users by id
	 */
	Users getUsersById(Long id);
	
	/**
	 * Adds the users.
	 *
	 * @param users the users
	 */
	void addUsers(Users users);
	
	/**
	 * Update users.
	 *
	 * @param users the users
	 */
	void updateUsers(Users users);
	
	/**
	 * Delete users.
	 *
	 * @param id the id
	 */
	void deleteUsers(Long id);
	
	

}
