package com.mb11.application.daoImpl.user;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.mb11.application.dao.user.UsersDAO;
import com.mb11.application.model.user.Users;

@Transactional
@Repository
public class UsersDaoImpl implements UsersDAO {
	
	@PersistenceContext	
	private EntityManager entityManager;


	@SuppressWarnings("unchecked")
	@Override
	public List<Users> getAllUsers() {
		
		String hql = "FROM Users as usr ORDER BY usr.id";
		return (List<Users>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public Users getUsersById(Long id) {
		
		return entityManager.find(Users.class, id);
	}

	@Override
	public void addUsers(Users users) {
		entityManager.persist(users);
		
	}

	@Override
	public void updateUsers(Users users) {
		Users usr = getUsersById(users.getID());
	//	usr.setFirstname(users.getFirstname());
		
		entityManager.flush();
		
		
	}

	@Override
	public void deleteUsers(Long id) {
		entityManager.remove(getUsersById(id));
		
	}

}
