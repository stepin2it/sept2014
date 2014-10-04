package com.example.j2eedemo.dao;



import com.example.j2eedemo.commons.dao.GenericDao;
import com.example.j2eedemo.entities.UserEntity;

/**
 * Data access object interface to work with User entity database operations.
 * 
 */
public interface UserDao extends GenericDao<UserEntity, Long> {

	/**
	 * Queries database for user name availability
	 * 
	 * @param userName
	 * @return true if available
	 */
	boolean checkAvailable(String userName);
	
	/**
	 * Queries user by username
	 * 
	 * @param userName
	 * @return User entity
	 */
	UserEntity loadUserByUserName(String userName);
}
