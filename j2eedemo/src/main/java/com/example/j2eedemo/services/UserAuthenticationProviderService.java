package com.example.j2eedemo.services;

import com.example.j2eedemo.entities.UserEntity;

/**
 * Provides processing service to set user authentication session
 * 
 */
public interface UserAuthenticationProviderService {

	/**
	 * Process user authentication
	 * 
	 * @param user
	 * @return
	 */
	boolean processUserAuthentication(UserEntity user);
}
