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

import com.mb11.application.model.cricapidata.PlayerCredit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlayerCreditDaoImplTest {
	
	@Autowired
	PlayerCreditDaoImpl pdi;
	
	@Autowired
	EntityManager em;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
//	@Test
//	public void addPlayerCredit()
//	{
//		pdi.addPlayerCredit(new PlayerCredit());
//	}
//	
	@Test
	@Transactional
	public void getAllPlayerCredit()
	{
		pdi.addPlayerCredit(new PlayerCredit());
	}
//	
//	@Test
//	public void getAllPlayerCreditById()
//	{
//		pdi.getPlayerCreditById(1L);
//	}
//	
//	@Test
//	public void removeAllPlayerCredit()
//	{
//		pdi.deletePlayerCredit(1L);
//	}
	

	

}
