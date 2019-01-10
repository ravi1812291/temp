package com.mb11.application.daoImpl.cricapidata;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mb11.application.dao.cricapidata.SeriesTeamLinkDAO;
import com.mb11.application.model.cricapidata.Series;
import com.mb11.application.model.cricapidata.SeriesTeamLink;


@Transactional
@Repository
public class SeriesTeamLinkDaoImpl implements SeriesTeamLinkDAO {

	
	@PersistenceContext	
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<SeriesTeamLink> getAllSeriesTeamLink() {
		
		String hql = "FROM SeriesTeamLink as stl ORDER BY stl.id";
		return (List<SeriesTeamLink>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public SeriesTeamLink getSeriesTeamLinkById(Long id) {
		
		return entityManager.find(SeriesTeamLink.class, id);
	}

	@Override
	public void addSeriesTeamLink(SeriesTeamLink seriesTeamLink) {
		entityManager.persist(seriesTeamLink);
		
	}

	@Override
	public void updateSeriesTeamLink(SeriesTeamLink seriesTeamLink) {
		SeriesTeamLink stl=getSeriesTeamLinkById(seriesTeamLink.getID());
		
		entityManager.flush();
	
	}

	@Override
	public void deleteSeriesTeamLink(Long id) {
		
		entityManager.remove(getSeriesTeamLinkById(id));
	}

}
