package com.mb11.application;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mb11.application.daoImpl.cricapidata.SeriesDaoImpl;
import com.mb11.application.model.cricapidata.Series;

public class Test {

	
	
	
	
	public static void main(String[] args) {
		
		SeriesDaoImpl sr=new SeriesDaoImpl();
		List<Series> srs=sr.getAllSeries();
		System.out.println(srs.get(0));
		
	
	}

}
