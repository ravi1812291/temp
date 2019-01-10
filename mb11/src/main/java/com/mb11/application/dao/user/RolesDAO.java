package com.mb11.application.dao.user;

import java.util.List;

import com.mb11.application.model.user.Roles;

public interface RolesDAO {
	
List<Roles> getAllRoles();
	
	Roles getRolesById(Long id);
	
	void addRoles(Roles roles);
	
	void updateRoles(Roles roles);
	
	void deleteRoles(Long id);

}
