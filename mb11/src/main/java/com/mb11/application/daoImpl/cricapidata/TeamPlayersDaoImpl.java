package com.mb11.application.daoImpl.cricapidata;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mb11.application.dao.cricapidata.TeamPlayersDAO;
import com.mb11.application.model.cricapidata.Series;
import com.mb11.application.model.cricapidata.TeamPlayers;


@Transactional
@Repository
public class TeamPlayersDaoImpl implements TeamPlayersDAO{

	
	@PersistenceContext	
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<TeamPlayers> getAllTeamPlayers() {
		
		String hql = "FROM TeamPlayers as tp ORDER BY tp.id";
		return (List<TeamPlayers>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public TeamPlayers getTeamPlayersById(Long id) {
		
		return entityManager.find(TeamPlayers.class, id);
	}

	@Override
	public void addTeamPlayers(TeamPlayers teamPlayers) {
		
		entityManager.persist(teamPlayers);
	}

	@Override
	public void updateTeamPlayers(TeamPlayers teamPlayers) {
		TeamPlayers tp=getTeamPlayersById(teamPlayers.getID());
		
		entityManager.flush();
	}

	@Override
	public void deleteTeamPlayers(Long id) {
		entityManager.remove(getTeamPlayersById(id));
		
	}

}
