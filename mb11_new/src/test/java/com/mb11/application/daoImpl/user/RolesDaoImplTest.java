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

import com.mb11.application.model.user.Roles;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RolesDaoImplTest {

	@Autowired
	private RolesDaoImpl rdi;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
//	@Test
//	@Transactional
//	public void addRoles()
//	{
//		rdi.addRoles(new Roles());
//	}
//	
//	@Test
//	@Transactional
//	public void getAllRoles()
//	{
//		rdi.getAllRoles();
//	}
//	
//
//	@Test
//	@Transactional
//	public void getRolesById()
//	{
//		rdi.getRolesById(1L);
//	}
//	
//
//	@Test
//	@Transactional
//	public void updateRoles()
//	{
//		rdi.updateRoles(new Roles());
//	}
//	
//	@Test
//	@Transactional
//	public void removeRoles()
//	{
//		rdi.deleteRoles(1l);
//	}
	
	

}
