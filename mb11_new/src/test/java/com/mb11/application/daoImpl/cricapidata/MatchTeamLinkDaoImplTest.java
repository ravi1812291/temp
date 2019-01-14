package com.mb11.application.daoImpl.cricapidata;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mb11.application.model.cricapidata.MatchTeamLink;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MatchTeamLinkDaoImplTest {

	@Autowired
	MatchTeamLinkDaoImpl mdi;
	
	@Autowired
	EntityManager em;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Test
	@Transactional
	public void getAllMatchTeamLink()
	{
		mdi.getAllMatchTeamLink();
	}
//	
//	@Test
//	@Transactional
//	public void getMatchTeamLinkById()
//	{
//		mdi.getMatchTeamLinkById(1L);
//	}
//	
//	@Test
//	@Transactional
//	public void AddMatchTeamLink()
//	{
//		mdi.addMatchTeamLink(new MatchTeamLink());
//	}
//	
//	@Test
//	@Transactional
//	public void removeMatchTeamLink()
//	{
//		mdi.deleteMatchTeamLink(1L);
//	}
	
	
	
	

}
