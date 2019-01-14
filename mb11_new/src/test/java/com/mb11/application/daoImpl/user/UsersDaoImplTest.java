package com.mb11.application.daoImpl.user;

import static org.junit.Assert.*;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mb11.application.model.user.Users;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersDaoImplTest {

	@Autowired
	private UsersDaoImpl udi;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
//	@Test
//	@Transactional
//	public void addUsers()
//	{
//		udi.addUsers(new Users());	
//	}
//	
//	@Test
//	@Transactional
//	public void getAllUsers()
//	{
//		udi.getAllUsers();	
//	}
//	
//	@Test
//	@Transactional
//	public void getUsersById()
//	{
//		udi.getUsersById(1L);
//	}
//	
//	@Test
//	@Transactional
//	public void removeUsers()
//	{
//		udi.deleteUsers(1l);
//	}
//	
//	@Test
//	@Transactional
//	public void updateUsers()
//	{
//		udi.updateUsers(new Users());
//	}
//	
	
	
	
	
}
