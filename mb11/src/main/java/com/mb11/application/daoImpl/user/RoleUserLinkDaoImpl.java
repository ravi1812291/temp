package com.mb11.application.daoImpl.user;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mb11.application.dao.user.RoleUserLinkDAO;
import com.mb11.application.model.user.RoleUserLink;



@Transactional
@Repository
public class RoleUserLinkDaoImpl implements RoleUserLinkDAO {

	@PersistenceContext	
	private EntityManager entityManager;


	@SuppressWarnings("unchecked")
	@Override
	public List<RoleUserLink> getAllRoleUserLink() {
		
		String hql = "FROM RoleUserLink as rolesUserLink ORDER BY rolesUserLink.id";
		return (List<RoleUserLink>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public RoleUserLink getRoleUserLinkById(Long id) {
		

		return entityManager.find(RoleUserLink.class, id);
	}

	@Override
	public void addRoleUserLink(RoleUserLink roleUserLink) {
		entityManager.persist(roleUserLink);

	}

	@Override
	public void updateRoleUserLink(RoleUserLink roleUserLink) {
		
		RoleUserLink rul=getRoleUserLinkById(roleUserLink.getID());
		
		entityManager.flush();
		
	}

	@Override
	public void deleteRoleUserLink(Long id) {
		
		entityManager.remove(getRoleUserLinkById(id));
	}

}
