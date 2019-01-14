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

import com.mb11.application.model.user.MInvitePlatform;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MInvitePlatformDaoImplTest {

	@Autowired
	private MInvitePlatformDaoImpl mi;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
//	@Test
//	@Transactional
//	public void addMInvitePlatform()
//	{
//		mi.addMInvitePlatform(new MInvitePlatform());
//	}
//	
//	@Test
//	@Transactional
//	public void getAllMInvitePlatform()
//	{
//		mi.getAllMInvitePlatform();
//	}
//	
//
//	@Test
//	@Transactional
//	public void getMInvitePlatformById()
//	{
//		mi.getMInvitePlatformById(1L);
//	}
//	
//	@Test
//	@Transactional
//	public void updateMInvitePlatform()
//	{
//		mi.updateMInvitePlatform(new MInvitePlatform());
//	}
//	
//	@Test
//	@Transactional
//	public void removeMInvitePlatform()
//	{
//		mi.deleteMInvitePlatform(1l);
//	}
//	
//	
//	
	

}
