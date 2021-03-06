package com.mb11.application.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;
import com.mb11.application.model.user.Users;
import com.mb11.application.service.user.UsersService;

// TODO: Auto-generated Javadoc
/**
 * The Class UsersController.
 */
@Controller
@RequestMapping("api")
public class UsersController {
	
	/** The users service. */
	@Autowired
	private UsersService usersService;
	
	/**
	 * Gets the users by id.
	 *
	 * @param id the id
	 * @return the users by id
	 */
	@GetMapping("users/{id}")
	public ResponseEntity<Users> getUsersById(@PathVariable("id") Long id) {
		Users users = usersService.getUsersById(id);
		return new ResponseEntity<Users>(users, HttpStatus.OK);
	}
	
	/**
	 * Gets the all users.
	 *
	 * @return the all users
	 */
	@GetMapping("users")
	public ResponseEntity<List<Users>> getAllUsers() {
		List<Users> list = usersService.getAllUsers();
		return new ResponseEntity<List<Users>>(list, HttpStatus.OK);
	}
	
	/**
	 * Adds the users.
	 *
	 * @param users the users
	 * @param builder the builder
	 * @return the response entity
	 */
	@PostMapping("users")
	public ResponseEntity<Void> addUsers(@RequestBody Users users, UriComponentsBuilder builder) {
        boolean flag = usersService.addUsers(users);
        if (flag == false) {
        	return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/users/{id}").buildAndExpand(users.getID()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
	/**
	 * Update users.
	 *
	 * @param users the users
	 * @return the response entity
	 */
	@PutMapping("users")
	public ResponseEntity<Users> updateUsers(@RequestBody Users users) {
		usersService.updateUsers(users);
		return new ResponseEntity<Users>(users, HttpStatus.OK);
	}
	
	
	/**
	 * Delete users.
	 *
	 * @param id the id
	 * @return the response entity
	 */
	@DeleteMapping("users/{id}")
	public ResponseEntity<Void> deleteUsers(@PathVariable("id") Long id) {
		usersService.deleteUsers(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	

}
