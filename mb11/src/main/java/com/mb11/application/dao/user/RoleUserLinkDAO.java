package com.mb11.application.dao.user;

import java.util.List;

import com.mb11.application.model.user.RoleUserLink;

public interface RoleUserLinkDAO {
	
List<RoleUserLink> getAllRoleUserLink();
	
	RoleUserLink getRoleUserLinkById(Long id);
	
	void addRoleUserLink(RoleUserLink roleUserLink);
	
	void updateRoleUserLink(RoleUserLink roleUserLink);
	
	void deleteRoleUserLink(Long id);

}
