package com.mb11.application.daoImpl.cricapidata;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mb11.application.dao.cricapidata.SeriesDAO;
import com.mb11.application.model.cricapidata.Series;


@Transactional
@Repository
public class SeriesDaoImpl implements SeriesDAO{
	
	@PersistenceContext	
	private EntityManager entityManager;
	


	@Override
	public List<Series> getAllSeries() {
		
		
		
		return entityManager.createQuery("from Series", 
				Series.class).
				getResultList();
	}

	@Override
	public Series getSeriesById(Long id) {
		
		return entityManager.find(Series.class, id);
	}

	@Override
	public void addSeries(Series series) {
		
		//entityManager.persist(series);
		entityManager.merge(series);
	
		
	}

	@Override
	public void updateSeries(Series series) {
		
		Series sr = getSeriesById(series.getID());
		sr.setSname("xyz");
		
		//usr.setFirstname(Series.getFirstname());
//		artcl.setTitle(article.getTitle());
//		artcl.setCategory(article.getCategory());
		entityManager.flush();
		
	}

	@Override
	public void deleteSeries(Long id) {
		
		entityManager.remove(getSeriesById(id));
	}

}
