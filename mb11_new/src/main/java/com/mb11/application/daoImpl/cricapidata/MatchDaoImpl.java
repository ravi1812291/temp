package com.mb11.application.daoImpl.cricapidata;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mb11.application.dao.cricapidata.MatchDAO;
import com.mb11.application.model.cricapidata.Match;


// TODO: Auto-generated Javadoc
/**
 * The Class MatchDaoImpl.
 */
@Transactional
@Repository
public class MatchDaoImpl implements MatchDAO {

	/** The entity manager. */
	@PersistenceContext	
	private EntityManager entityManager;

	/* (non-Javadoc)
	 * @see com.mb11.application.dao.cricapidata.MatchDAO#getAllMatch()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Match> getAllMatch() {
	
		String hql = "FROM Match as match ORDER BY match.id";
		return (List<Match>) entityManager.createQuery(hql).getResultList();
	}

	/* (non-Javadoc)
	 * @see com.mb11.application.dao.cricapidata.MatchDAO#getMatchById(java.lang.Long)
	 */
	@Override
	public Match getMatchById(Long id) {
	
		return entityManager.find(Match.class, id);
	}

	/* (non-Javadoc)
	 * @see com.mb11.application.dao.cricapidata.MatchDAO#addMatch(com.mb11.application.model.cricapidata.Match)
	 */
	@Override
	public void addMatch(Match match) {
	
		entityManager.persist(match);

	}

	/* (non-Javadoc)
	 * @see com.mb11.application.dao.cricapidata.MatchDAO#updateMatch(com.mb11.application.model.cricapidata.Match)
	 */
	@Override
	public void updateMatch(Match match) {
	
		Match mt=getMatchById(match.getID());
		
		entityManager.flush();
	

	}

	/* (non-Javadoc)
	 * @see com.mb11.application.dao.cricapidata.MatchDAO#deleteMatch(java.lang.Long)
	 */
	@Override
	public void deleteMatch(Long id) {
	
		entityManager.remove(getMatchById(id));

	}

}
