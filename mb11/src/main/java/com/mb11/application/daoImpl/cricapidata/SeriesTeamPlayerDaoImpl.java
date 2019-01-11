package com.mb11.application.daoImpl.cricapidata;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mb11.application.dao.cricapidata.SeriesTeamPlayerDAO;
import com.mb11.application.model.cricapidata.Series;
import com.mb11.application.model.cricapidata.SeriesTeamPlayer;


// TODO: Auto-generated Javadoc
/**
 * The Class SeriesTeamPlayerDaoImpl.
 */
@Transactional
@Repository
public class SeriesTeamPlayerDaoImpl implements SeriesTeamPlayerDAO {

	
	/** The entity manager. */
	@PersistenceContext	
	private EntityManager entityManager;

	/* (non-Javadoc)
	 * @see com.mb11.application.dao.cricapidata.SeriesTeamPlayerDAO#getAllSeriesTeamPlayer()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<SeriesTeamPlayer> getAllSeriesTeamPlayer() {
		
		String hql = "FROM SeriesTeamPlayer as ser ORDER BY ser.id";
		return (List<SeriesTeamPlayer>) entityManager.createQuery(hql).getResultList();
	}

	/* (non-Javadoc)
	 * @see com.mb11.application.dao.cricapidata.SeriesTeamPlayerDAO#getSeriesTeamPlayerById(java.lang.Long)
	 */
	@Override
	public SeriesTeamPlayer getSeriesTeamPlayerById(Long id) {
		
		return entityManager.find(SeriesTeamPlayer.class, id);
	}

	/* (non-Javadoc)
	 * @see com.mb11.application.dao.cricapidata.SeriesTeamPlayerDAO#addSeriesTeamPlayer(com.mb11.application.model.cricapidata.SeriesTeamPlayer)
	 */
	@Override
	public void addSeriesTeamPlayer(SeriesTeamPlayer seriesTeamPlayer) {
		
		entityManager.persist(seriesTeamPlayer);
	}

	/* (non-Javadoc)
	 * @see com.mb11.application.dao.cricapidata.SeriesTeamPlayerDAO#updateSeriesTeamPlayer(com.mb11.application.model.cricapidata.SeriesTeamPlayer)
	 */
	@Override
	public void updateSeriesTeamPlayer(SeriesTeamPlayer seriesTeamPlayer) {
		SeriesTeamPlayer stp=getSeriesTeamPlayerById(seriesTeamPlayer.getID());
		
		entityManager.flush();
	}

	/* (non-Javadoc)
	 * @see com.mb11.application.dao.cricapidata.SeriesTeamPlayerDAO#deleteSeriesTeamPlayer(java.lang.Long)
	 */
	@Override
	public void deleteSeriesTeamPlayer(Long id) {
		
		entityManager.remove(getSeriesTeamPlayerById(id));
	}

}
