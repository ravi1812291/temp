package com.mb11.application.dao.cricapidata;

import java.util.List;

import com.mb11.application.model.cricapidata.MTeam;



public interface MTeamDAO {
	
	List<MTeam> getAllMTeam();
	
	MTeam getMTeamById(Long id);
	
	void addMTeam(MTeam mTeam);
	
	void updateMTeam(MTeam mTeam);
	
	void deleteMTeam(Long id);

}
