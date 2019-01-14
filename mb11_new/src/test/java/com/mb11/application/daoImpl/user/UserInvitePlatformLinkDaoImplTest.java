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

import com.mb11.application.model.user.UserInvitePlatformLink;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInvitePlatformLinkDaoImplTest {

	@Autowired
	private UserInvitePlatformLinkDaoImpl mi;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
//	@Test
//	@Transactional
//	public void addUserInvitePlatformLink()
//	{
//		mi.addUserInvitePlatformLink(new UserInvitePlatformLink());
//	}
//	
//	@Test
//	@Transactional
//	public void updateUserInvitePlatformLink()
//	{
//		mi.updateUserInvitePlatformLink(new UserInvitePlatformLink());
//	}
//	
//	@Test
//	@Transactional
//	public void getAllUserInvitePlatformLink()
//	{
//		mi.getAllUserInvitePlatformLink();
//	}
//	
//	@Test
//	@Transactional
//	public void getUserInvitePlatformLinkById()
//	{
//		mi.getUserInvitePlatformLinkById(1L);
//	}
//	
//	@Test
//	@Transactional
//	public void removeUserInvitePlatformLink()
//	{
//		mi.deleteUserInvitePlatformLink(1l);
//	}
	

}
