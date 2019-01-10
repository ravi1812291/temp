package com.mb11.application.dao.cricapidata;

import java.util.List;

import com.mb11.application.model.cricapidata.MatchTeamLink;

public interface MatchTeamLinkDAO {
	
    List<MatchTeamLink> getAllMatchTeamLink();
	
	MatchTeamLink getMatchTeamLinkById(Long id);
	
	void addMatchTeamLink(MatchTeamLink matchTeamLink);
	
	void updateMatchTeamLink(MatchTeamLink matchTeamLink);
	
	void deleteMatchTeamLink(Long id);


}
