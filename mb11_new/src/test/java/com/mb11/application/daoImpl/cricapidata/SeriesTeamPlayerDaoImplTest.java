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

import com.mb11.application.model.cricapidata.SeriesTeamPlayer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SeriesTeamPlayerDaoImplTest {

	@Autowired
	SeriesTeamPlayerDaoImpl sri;
	
	@Autowired
	EntityManager em;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Test
	@Transactional
	public void getSeriesTeamPlayer()
	{
		sri.getAllSeriesTeamPlayer();
	}
//	
//	@Test
//	public void getSeriesTeamPlayerById()
//	{
//		sri.getSeriesTeamPlayerById(1L);
//	}
//	
//	@Test
//	public void addSeriesTeamPlayer()
//	{
//		sri.addSeriesTeamPlayer(new SeriesTeamPlayer());
//	}
//	
//	@Test
//	public void removeSeriesTeamPlayer()
//	{
//		sri.deleteSeriesTeamPlayer(1L);
//	}
	
	
	
	
	
	
	
	
	
	
}
