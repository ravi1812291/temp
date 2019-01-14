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

import com.mb11.application.model.cricapidata.TeamPlayers;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TeamPlayerDaoImplTest {

	@Autowired
	TeamPlayersDaoImpl tpi;
	
	@Autowired
	EntityManager em;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Test
	@Transactional
	public void getAllTeamPlayers()
	{
		tpi.getAllTeamPlayers();
	}

//	@Test
//	public void getAllTeamPlayersById()
//	{
//		tpi.getTeamPlayersById(1L);
//	}
//	
//	@Test
//	public void AddTeamPlayers()
//	{
//	 
//		tpi.addTeamPlayers(new TeamPlayers());
//	}
//	
//	@Test
//	public void removeTeamPlayers()
//	{
//	 
//		tpi.deleteTeamPlayers(1L);
//	}
//	
	
   
	
	
	

}
