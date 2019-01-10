package com.mb11.application.daoImpl.cricapidata;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mb11.application.dao.cricapidata.MatchDAO;
import com.mb11.application.model.cricapidata.Match;


@Transactional
@Repository
public class MatchDaoImpl implements MatchDAO {

	@PersistenceContext	
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Match> getAllMatch() {
	
		String hql = "FROM Match as match ORDER BY match.id";
		return (List<Match>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public Match getMatchById(Long id) {
	
		return entityManager.find(Match.class, id);
	}

	@Override
	public void addMatch(Match match) {
	
		entityManager.persist(match);

	}

	@Override
	public void updateMatch(Match match) {
	
		Match mt=getMatchById(match.getID());
		
		entityManager.flush();
	

	}

	@Override
	public void deleteMatch(Long id) {
	
		entityManager.remove(getMatchById(id));

	}

}
