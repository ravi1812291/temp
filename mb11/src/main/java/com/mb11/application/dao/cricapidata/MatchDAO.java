package com.mb11.application.dao.cricapidata;

import java.util.List;

import com.mb11.application.model.cricapidata.Match;

public interface MatchDAO {
	
List<Match> getAllMatch();
	
	Match getMatchById(Long id);
	
	void addMatch(Match match);
	
	void updateMatch(Match match);
	
	void deleteMatch(Long id);

}
