package com.mb11.application.daoImpl.cricapidata;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mb11.application.dao.cricapidata.MatchTeamLinkDAO;
import com.mb11.application.model.cricapidata.MatchTeamLink;


@Transactional
@Repository
public class MatchTeamLinkDaoImpl implements MatchTeamLinkDAO {

	@PersistenceContext	
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<MatchTeamLink> getAllMatchTeamLink() {
		
		String hql = "FROM MatchTeamLink as mtl ORDER BY mtl.id";
		return (List<MatchTeamLink>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public MatchTeamLink getMatchTeamLinkById(Long id) {
		
		return entityManager.find(MatchTeamLink.class, id);
	}

	@Override
	public void addMatchTeamLink(MatchTeamLink matchTeamLink) {
		
		entityManager.persist(matchTeamLink);

	}

	@Override
	public void updateMatchTeamLink(MatchTeamLink matchTeamLink) {
		
		MatchTeamLink mtl=getMatchTeamLinkById(matchTeamLink.getID());
		
		entityManager.flush();
	

	}

	@Override
	public void deleteMatchTeamLink(Long id) {
		entityManager.remove(getMatchTeamLinkById(id));

	}

}
