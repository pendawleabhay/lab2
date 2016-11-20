 package edu.sjsu.cmpe275.lab2.dao;

import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.sjsu.cmpe275.lab2.entities.Address;
import edu.sjsu.cmpe275.lab2.entities.User;

@Repository
public class UserDao {

	@PersistenceContext
	private EntityManager entitymanager;
	
	 @Transactional
	public User createUser(Map<String, String> queryMap)
	{
		//create address
		Address address = new Address();
		address.setCity(queryMap.get("city"));
		address.setState(queryMap.get("state"));
		address.setStreet(queryMap.get("street"));
		address.setZip(queryMap.get("zip"));
		
		
		//create user
		User user = new User();
		if(queryMap.containsKey("userId"))
		{
			int userId = Integer.parseInt(queryMap.get("userId"));
			user.setUserId(userId);
		}
		user.setFirstname(queryMap.get("firstname"));
		user.setLastname(queryMap.get("lastname"));
		user.setTitle(queryMap.get("title"));		
		user.setAddress(address);
		
		//store user in db
		entitymanager.merge(user);
		
		return user;
	}
	 
	 public User getUser(int userId)
	 {
		 User user = entitymanager.find(User.class, userId);
		return user; 
	 }
}
