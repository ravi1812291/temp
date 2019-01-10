package com.mb11.application.dao.cricapidata;

import java.util.List;

import com.mb11.application.model.cricapidata.PlayerCredit;

public interface PlayerCreditDAO {
	
List<PlayerCredit> getAllPlayerCredit();
	
	PlayerCredit getPlayerCreditById(Long id);
	
	void addPlayerCredit(PlayerCredit playerCredit);
	
	void updatePlayerCredit(PlayerCredit playerCredit);
	
	void deletePlayerCredit(Long id);

}
