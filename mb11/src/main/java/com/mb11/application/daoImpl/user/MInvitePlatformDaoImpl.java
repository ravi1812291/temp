package com.mb11.application.daoImpl.user;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mb11.application.dao.user.MInvitePlatformDAO;
import com.mb11.application.model.user.MInvitePlatform;


@Transactional
@Repository
public class MInvitePlatformDaoImpl implements MInvitePlatformDAO {

	@PersistenceContext	
	private EntityManager entityManager;


	@SuppressWarnings("unchecked")
	@Override
	public List<MInvitePlatform> getAllMInvitePlatform() {
		
		String hql = "FROM MInvitePlatform mInvite ORDER BY mInvite.id";
		return (List<MInvitePlatform>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public MInvitePlatform getMInvitePlatformById(Long id) {
		
		return entityManager.find(MInvitePlatform.class, id);
	}

	@Override
	public void addMInvitePlatform(MInvitePlatform mInvitePlatform) {
		
		entityManager.persist(mInvitePlatform);

	}

	@Override
	public void updateMInvitePlatform(MInvitePlatform mInvitePlatform) {
		
		MInvitePlatform min=getMInvitePlatformById(mInvitePlatform.getID());
		
		entityManager.flush();
		
	}

	@Override
	public void deleteMInvitePlatform(Long id) {
		
		entityManager.remove(getMInvitePlatformById(id));
	}

}
