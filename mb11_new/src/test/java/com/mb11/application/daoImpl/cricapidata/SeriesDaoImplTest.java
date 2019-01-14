package com.mb11.application.daoImpl.cricapidata;

import static org.junit.Assert.*;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

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
	
	
	
	
//	@Test
//	@Transactional
//	public void addSeries()
//	{
//		sr.addSeries(new Series("test8","test8",new Date(),new Date(),12));
//	}
	
	@Test
	@Transactional
	public void getAllSeries()
	{
		logger.info("Full Series -> {}", sr.getAllSeries());
		
	}
//	
//	
//	 
//	@Test
//	@Transactional
//	public void getSeriesWrtStartAndEndDate() {
//		
//		sr.getSeriesWrtStartAndEndDate(new Date(), new Date());
//	}
	
//
//	@Test
//	@Transactional
//	public void removeSeries() {
//		
//		sr.deleteSeries(1L);
//	}   
//	
//	
//	@Test
//	@Transactional
//	public void updateSeries()
//	{
//		Series series=new Series();
//		series.setID(5L);
//		sr.updateSeries(series);
//	}
	
	
	
	

}
