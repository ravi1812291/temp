package com.mb11.application.daoImpl.cricapidata;

import static org.junit.Assert.*;

import java.util.Date;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mb11.application.model.cricapidata.Series;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SeriesDaoImplTest {

	@Autowired
	SeriesDaoImpl sr;
	
	@Autowired
	EntityManager em;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Test
	public void getAllSeries()
	{
		logger.info("Full Series -> {}", sr.getAllSeries());
		
	}
/*	
	
	@Test
	public void addSeries()
	{
		sr.addSeries(new Series("test1","test1",new Date(),new Date(),11));
	}
	
	@Test
	public void getSeriesWrtStartAndEndDate() {
		
		sr.getSeriesWrtStartAndEndDate(new Date(), new Date());
	}
	
	@Test
	public void removeSeries() {
		
		sr.deleteSeries(1L);
	}
	*/
	
	
	

}
