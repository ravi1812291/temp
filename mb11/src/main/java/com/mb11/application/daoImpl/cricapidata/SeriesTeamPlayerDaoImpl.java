package com.mb11.application.daoImpl.cricapidata;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mb11.application.dao.cricapidata.SeriesTeamPlayerDAO;
import com.mb11.application.model.cricapidata.Series;
import com.mb11.application.model.cricapidata.SeriesTeamPlayer;


@Transactional
@Repository
public class SeriesTeamPlayerDaoImpl implements SeriesTeamPlayerDAO {

	
	@PersistenceContext	
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<SeriesTeamPlayer> getAllSeriesTeamPlayer() {
		
		String hql = "FROM SeriesTeamPlayer as ser ORDER BY ser.id";
		return (List<SeriesTeamPlayer>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public SeriesTeamPlayer getSeriesTeamPlayerById(Long id) {
		
		return entityManager.find(SeriesTeamPlayer.class, id);
	}

	@Override
	public void addSeriesTeamPlayer(SeriesTeamPlayer seriesTeamPlayer) {
		
		entityManager.persist(seriesTeamPlayer);
	}

	@Override
	public void updateSeriesTeamPlayer(SeriesTeamPlayer seriesTeamPlayer) {
		SeriesTeamPlayer stp=getSeriesTeamPlayerById(seriesTeamPlayer.getID());
		
		entityManager.flush();
	}

	@Override
	public void deleteSeriesTeamPlayer(Long id) {
		
		entityManager.remove(getSeriesTeamPlayerById(id));
	}

}
