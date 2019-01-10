package com.mb11.application.daoImpl.user;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mb11.application.dao.user.UserInvitePlatformLinkDAO;
import com.mb11.application.model.user.UserInvitePlatformLink;


@Transactional
@Repository
public class UserInvitePlatformLinkDaoImpl implements UserInvitePlatformLinkDAO {

	@PersistenceContext	
	private EntityManager entityManager;


	@SuppressWarnings("unchecked")
	@Override
	public List<UserInvitePlatformLink> getAllUserInvitePlatformLink() {
	
		String hql = "FROM UserInvitePlatformLink as usr ORDER BY usr.id";
		return (List<UserInvitePlatformLink>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public UserInvitePlatformLink getUserInvitePlatformLinkById(Long id) {
	
		return entityManager.find(UserInvitePlatformLink.class, id);
	}

	@Override
	public void addUserInvitePlatformLink(UserInvitePlatformLink userInvitePlatformLink) {
	
		entityManager.persist(userInvitePlatformLink);

	}

	@Override
	public void updateUserInvitePlatformLink(UserInvitePlatformLink userInvitePlatformLink) {
		UserInvitePlatformLink uipl=getUserInvitePlatformLinkById(userInvitePlatformLink.getID());
		
		entityManager.flush();
	}

	@Override
	public void deleteUserInvitePlatformLink(Long id) {
	
		entityManager.remove(getUserInvitePlatformLinkById(id));
	}

}
