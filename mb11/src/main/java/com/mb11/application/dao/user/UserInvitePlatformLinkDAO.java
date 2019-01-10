package com.mb11.application.dao.user;

import java.util.List;

import com.mb11.application.model.user.UserInvitePlatformLink;

public interface UserInvitePlatformLinkDAO {
	
List<UserInvitePlatformLink> getAllUserInvitePlatformLink();
	
	UserInvitePlatformLink getUserInvitePlatformLinkById(Long id);
	
	void addUserInvitePlatformLink(UserInvitePlatformLink userInvitePlatformLink);
	
	void updateUserInvitePlatformLink(UserInvitePlatformLink userInvitePlatformLink);
	
	void deleteUserInvitePlatformLink(Long id);

}
