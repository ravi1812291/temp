package com.mb11.application.dao.user;

import java.util.List;

import com.mb11.application.model.user.MInvitePlatform;

public interface MInvitePlatformDAO {
	
List<MInvitePlatform> getAllMInvitePlatform();
	
	MInvitePlatform getMInvitePlatformById(Long id);
	
	void addMInvitePlatform(MInvitePlatform mInvitePlatform);
	
	void updateMInvitePlatform(MInvitePlatform mInvitePlatform);
	
	void deleteMInvitePlatform(Long id);

}
