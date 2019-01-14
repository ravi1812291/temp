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

import com.mb11.application.model.cricapidata.MTeam;
import com.mb11.application.model.cricapidata.Sporttype;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MTeamDaoImplTest {

	@Autowired
	private MTeamDaoImpl mdi;
	
	/** The logger. */
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	
//	@Test
//	@Transactional
//	public void addMTeam()
//	{
//		mdi.addMTeam(new MTeam("Myteam2",Sporttype.Cricket,null));
//	}
	
	
	
//	@Test
//	@Transactional
//	public void getAllMTeam()
//	{
//		mdi.getAllMTeam();
//	}
	
	
//	
//	@Test
//	@Transactional
//	public void getMTeamById()
//	{
//		mdi.getMTeamById(1L);
//	}
//	
//	@Test
//	@Transactional
//	public void updateMTeam()
//	{
//		MTeam mTeam=new MTeam();
//        mTeam.setID(1L);
//		mdi.updateMTeam(mTeam);
//	}
//	
	

}
