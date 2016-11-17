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
		
		//create user
		User user = new User();
		user.setFirstname(queryMap.get("firstname"));
		user.setAddress(address);
		
		//store user in db
		entitymanager.merge(user);
		
		return user;
	}
}
