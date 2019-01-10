package com.mb11.application.dao.cricapidata;

import java.util.List;

import com.mb11.application.model.cricapidata.TeamPlayers;

public interface TeamPlayersDAO {
	
List<TeamPlayers> getAllTeamPlayers();
	
TeamPlayers getTeamPlayersById(Long id);
	
	void addTeamPlayers(TeamPlayers teamPlayers);
	
	void updateTeamPlayers(TeamPlayers teamPlayers);
	
	void deleteTeamPlayers(Long id);

}
