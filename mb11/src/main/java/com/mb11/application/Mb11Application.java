package com.mb11.application;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mb11.application.daoImpl.cricapidata.MTeamDaoImpl;
import com.mb11.application.daoImpl.cricapidata.SeriesDaoImpl;
import com.mb11.application.model.cricapidata.MTeam;
import com.mb11.application.model.cricapidata.Series;
import com.mb11.application.model.cricapidata.Sporttype;

// TODO: Auto-generated Javadoc
/**
 * The Class Mb11Application.
 */
@SpringBootApplication
public class Mb11Application implements CommandLineRunner {

	/** The srm. */
	@Autowired
	private SeriesDaoImpl srm;
	
	
	/** The mdi. */
	@Autowired
	private MTeamDaoImpl mdi;
	
	/** The logger. */
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(Mb11Application.class, args);
		

	
	}

	/* (non-Javadoc)
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 */
	@Override
	public void run(String... args) throws Exception {
		
		
		//srm.getSeriesWrtStartAndEndDate(new Date(), new Date());
		
		//mdi.addMTeam(new MTeam("Myteam1",Sporttype.Football));
		
		//logger.info("Full MTeam -> {}", mdi.getAllMTeam());
/*		
logger.info("Full Series -> {}", srm.getAllSeries());
//	srm.addSeries(new Series("test11","test111",new Date(),new Date(),11));
		
Series sr=new Series();
sr.setID(1);

//srm.updateSeries(sr);

srm.deleteSeries(2l);
	*/			

	}

}

