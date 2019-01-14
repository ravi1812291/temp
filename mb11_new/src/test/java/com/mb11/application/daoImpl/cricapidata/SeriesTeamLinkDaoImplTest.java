package com.mb11.application.daoImpl.cricapidata;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;




@RunWith(SpringRunner.class)
@SpringBootTest
public class SeriesTeamLinkDaoImplTest {

	@Autowired
	SeriesTeamLinkDaoImpl sri;
	
	@Autowired
	EntityManager em;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Test
	@Transactional
	public void getAllSeriesTeamLink()
	{
		sri.getAllSeriesTeamLink();
	}
//	
//	@Test
//	public void getAllSeriesTeamLinkById()
//	{
//		sri.getSeriesTeamLinkById(1L);
//	}
	
	
	

}
