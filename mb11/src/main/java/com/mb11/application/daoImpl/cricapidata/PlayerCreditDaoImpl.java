package com.mb11.application.daoImpl.cricapidata;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mb11.application.dao.cricapidata.PlayerCreditDAO;
import com.mb11.application.model.cricapidata.PlayerCredit;



@Transactional
@Repository
public class PlayerCreditDaoImpl implements PlayerCreditDAO {

	@PersistenceContext	
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<PlayerCredit> getAllPlayerCredit() {
		
		String hql = "FROM PlayerCredit as pc ORDER BY pc.id";
		return (List<PlayerCredit>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public PlayerCredit getPlayerCreditById(Long id) {
		
		return entityManager.find(PlayerCredit.class, id);
	}

	@Override
	public void addPlayerCredit(PlayerCredit playerCredit) {
		
		entityManager.persist(playerCredit);
		
	}

	@Override
	public void updatePlayerCredit(PlayerCredit playerCredit) {
		
		PlayerCredit pc=getPlayerCreditById(playerCredit.getID());
		
		entityManager.flush();
		
		
	}

	@Override
	public void deletePlayerCredit(Long id) {
		
		entityManager.remove(getPlayerCreditById(id));
	}

}
