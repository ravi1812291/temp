package com.mb11.application.daoImpl.user;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mb11.application.dao.user.RolesDAO;
import com.mb11.application.model.user.Roles;



@Transactional
@Repository
public class RolesDaoImpl implements RolesDAO {

	
	@PersistenceContext	
	private EntityManager entityManager;


	@SuppressWarnings("unchecked")
	@Override
	public List<Roles> getAllRoles() {
		
		String hql = "FROM Roles as roles ORDER BY roles.id";
		return (List<Roles>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public Roles getRolesById(Long id) {
		
		return entityManager.find(Roles.class, id);
	}
	

	@Override
	public void addRoles(Roles roles) {
		
		entityManager.persist(roles);

	}

	@Override
	public void updateRoles(Roles roles) {
		
		Roles rls=getRolesById(roles.getID());
		
		entityManager.flush();
		
	}

	@Override
	public void deleteRoles(Long id) {
		entityManager.remove(getRolesById(id));

	}

}
