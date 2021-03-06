package com.mb11.application.daoImpl.cricapidata;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mb11.application.dao.cricapidata.SeriesTeamLinkDAO;
import com.mb11.application.model.cricapidata.MTeam;
import com.mb11.application.model.cricapidata.Series;
import com.mb11.application.model.cricapidata.SeriesTeamLink;


// TODO: Auto-generated Javadoc
/**
 * The Class SeriesTeamLinkDaoImpl.
 */
@Transactional
@Repository
public class SeriesTeamLinkDaoImpl implements SeriesTeamLinkDAO {

	
	/** The entity manager. */
	@PersistenceContext	
	private EntityManager entityManager;

	/* (non-Javadoc)
	 * @see com.mb11.application.dao.cricapidata.SeriesTeamLinkDAO#getAllSeriesTeamLink()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<SeriesTeamLink> getAllSeriesTeamLink() {
		
		String hql = "FROM SeriesTeamLink as stl ORDER BY stl.id";
		return (List<SeriesTeamLink>) entityManager.createQuery(hql).getResultList();
	}

	/* (non-Javadoc)
	 * @see com.mb11.application.dao.cricapidata.SeriesTeamLinkDAO#getSeriesTeamLinkById(java.lang.Long)
	 */
	@Override
	public SeriesTeamLink getSeriesTeamLinkById(Long id) {
		
		
		
		return entityManager.find(SeriesTeamLink.class, id);
	}

	/* (non-Javadoc)
	 * @see com.mb11.application.dao.cricapidata.SeriesTeamLinkDAO#addSeriesTeamLink(com.mb11.application.model.cricapidata.SeriesTeamLink)
	 */
	@Override
	public void addSeriesTeamLink(SeriesTeamLink seriesTeamLink) {
		
		List<MTeam> m=seriesTeamLink.getmTeam();
		entityManager.persist(m);
		
		List<Series> s=seriesTeamLink.getSeries();
		entityManager.persist(s);
		
		SeriesTeamLink seriesTeamLink1=new SeriesTeamLink(m,s);
		
		
		entityManager.persist(seriesTeamLink1);
		
	}

	/* (non-Javadoc)
	 * @see com.mb11.application.dao.cricapidata.SeriesTeamLinkDAO#updateSeriesTeamLink(com.mb11.application.model.cricapidata.SeriesTeamLink)
	 */
	@Override
	public void updateSeriesTeamLink(SeriesTeamLink seriesTeamLink) {
		SeriesTeamLink stl=getSeriesTeamLinkById(seriesTeamLink.getID());
		
		entityManager.flush();
	
	}

	/* (non-Javadoc)
	 * @see com.mb11.application.dao.cricapidata.SeriesTeamLinkDAO#deleteSeriesTeamLink(java.lang.Long)
	 */
	@Override
	public void deleteSeriesTeamLink(Long id) {
		
		entityManager.remove(getSeriesTeamLinkById(id));
	}

}
