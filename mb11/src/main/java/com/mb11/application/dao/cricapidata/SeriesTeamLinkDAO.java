package com.mb11.application.dao.cricapidata;

import java.util.List;

import com.mb11.application.model.cricapidata.SeriesTeamLink;



public interface SeriesTeamLinkDAO {
	
List<SeriesTeamLink> getAllSeriesTeamLink();
	
SeriesTeamLink getSeriesTeamLinkById(Long id);
	
	void addSeriesTeamLink(SeriesTeamLink seriesTeamLink);
	
	void updateSeriesTeamLink(SeriesTeamLink seriesTeamLink);
	
	void deleteSeriesTeamLink(Long id);

}
