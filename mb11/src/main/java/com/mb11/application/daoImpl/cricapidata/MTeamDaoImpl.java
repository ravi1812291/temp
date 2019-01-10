package com.mb11.application.daoImpl.cricapidata;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mb11.application.dao.cricapidata.MTeamDAO;
import com.mb11.application.model.cricapidata.MTeam;

@Transactional
@Repository
public class MTeamDaoImpl implements MTeamDAO {
    
	@PersistenceContext	
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<MTeam> getAllMTeam() {
		
		String hql = "FROM MTeam as mteam ORDER BY mteam.id";
		return (List<MTeam>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public MTeam getMTeamById(Long id) {
		
		return entityManager.find(MTeam.class, id);
	}

	@Override
	public void addMTeam(MTeam mTeam) {
		
		entityManager.persist(mTeam);
	}

	@Override
	public void updateMTeam(MTeam mTeam) {
		MTeam mt=getMTeamById(mTeam.getID());
		mt.setSporttype(mTeam.getSporttype());
		mt.setTeamname(mTeam.getTeamname());
		entityManager.flush();
	
		
	}

	@Override
	public void deleteMTeam(Long id) {
		
		entityManager.remove(getMTeamById(id));
		
	}

}
