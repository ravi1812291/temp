package com.mb11.application.dao.cricapidata;

import java.util.Date;
import java.util.List;

import com.mb11.application.model.cricapidata.Series;


public interface SeriesDAO {
	
	List<Series> getAllSeries();
	
	Series getSeriesById(Long id);
	
	void addSeries(Series series);
	
	void updateSeries(Series series);
	
	void deleteSeries(Long id);
	
	List<Series> getSeriesWrtStartAndEndDate(Date startSate,Date endDate);

}
