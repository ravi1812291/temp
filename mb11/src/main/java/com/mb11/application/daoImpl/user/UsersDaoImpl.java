package com.mb11.application.daoImpl.user;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.mb11.application.dao.user.UsersDAO;
import com.mb11.application.model.user.Address;
import com.mb11.application.model.user.Users;

// TODO: Auto-generated Javadoc
/**
 * The Class UsersDaoImpl.
 */
@Transactional
@Repository
public class UsersDaoImpl implements UsersDAO {
	
	/** The entity manager. */
	@PersistenceContext	
	private EntityManager entityManager;


	/* (non-Javadoc)
	 * @see com.mb11.application.dao.user.UsersDAO#getAllUsers()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Users> getAllUsers() {
		
		String hql = "FROM Users as usr ORDER BY usr.id";
		return (List<Users>) entityManager.createQuery(hql).getResultList();
	}

	/* (non-Javadoc)
	 * @see com.mb11.application.dao.user.UsersDAO#getUsersById(java.lang.Long)
	 */
	@Override
	public Users getUsersById(Long id) {
		
		return entityManager.find(Users.class, id);
	}

	/* (non-Javadoc)
	 * @see com.mb11.application.dao.user.UsersDAO#addUsers(com.mb11.application.model.user.Users)
	 */
	@Override
	public void addUsers(Users users) {
		
		
		
		entityManager.persist(users);
		
	}

	/* (non-Javadoc)
	 * @see com.mb11.application.dao.user.UsersDAO#updateUsers(com.mb11.application.model.user.Users)
	 */
	@Override
	public void updateUsers(Users users) {
		Users usr = getUsersById(users.getID());
	//	usr.setFirstname(users.getFirstname());
		
		entityManager.flush();
		
		
	}

	/* (non-Javadoc)
	 * @see com.mb11.application.dao.user.UsersDAO#deleteUsers(java.lang.Long)
	 */
	@Override
	public void deleteUsers(Long id) {
		entityManager.remove(getUsersById(id));
		
	}

}
