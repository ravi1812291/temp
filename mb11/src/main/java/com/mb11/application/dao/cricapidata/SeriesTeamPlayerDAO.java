package com.mb11.application.dao.cricapidata;

import java.util.List;

import com.mb11.application.model.cricapidata.SeriesTeamPlayer;


public interface SeriesTeamPlayerDAO {
	
List<SeriesTeamPlayer> getAllSeriesTeamPlayer();
	
	SeriesTeamPlayer getSeriesTeamPlayerById(Long id);
	
	void addSeriesTeamPlayer(SeriesTeamPlayer seriesTeamPlayer);
	
	void updateSeriesTeamPlayer(SeriesTeamPlayer seriesTeamPlayer);
	
	void deleteSeriesTeamPlayer(Long id);

}
