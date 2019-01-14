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

import com.mb11.application.model.cricapidata.Match;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MatchDaoImplTest {

	@Autowired
	MatchDaoImpl mdi;
	
	@Autowired
	EntityManager em;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
//	@Test
//	@Transactional
//	public void addMatch()
//	{
//		mdi.addMatch(new Match());
//	}
//	
//	
	@Test
	@Transactional
	public void getAllMatch()
	{
		mdi.getAllMatch();
	}
//	
//	@Test
//	@Transactional
//	public void getAllMatchById()
//	{
//		mdi.getMatchById(1L);
//	}
//	
//	@Test
//	@Transactional
//	public void removeMatch()
//	{
//		mdi.deleteMatch(1L);
//	}
	
	
	
	
	
	

}
