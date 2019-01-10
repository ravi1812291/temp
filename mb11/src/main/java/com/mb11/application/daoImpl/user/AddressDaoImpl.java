package com.mb11.application.daoImpl.user;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mb11.application.dao.user.AddressDAO;
import com.mb11.application.model.user.Address;


@Transactional
@Repository
public class AddressDaoImpl implements AddressDAO {

	@PersistenceContext	
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Address> getAllAddress() {
		String hql = "FROM Address addr usr ORDER BY addr.id";
		return (List<Address>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public Address getAddressById(Long id) {
		
		return entityManager.find(Address.class, id);
	}

	@Override
	public void addAddress(Address address) {
		
		entityManager.persist(address);

	}

	
	@Override
	public void updateAddress(Address address) {
		Address addr=getAddressById(address.getID());
		
		entityManager.flush();
		
	}

	@Override
	public void deleteAddress(Long id) {
		
		entityManager.remove(getAddressById(id));
	}

}
