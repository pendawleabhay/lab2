 package edu.sjsu.cmpe275.lab2.dao;

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
	public void createUser(User user)
	{
		/*EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "lab2" );
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );
	      entitymanager.persist(user);
	      entitymanager.getTransaction( ).commit( );
	      entitymanager.close( );
	      emfactory.close( );*/
	     
		 /*Address  address = new Address();
		 address.setCity("pune");
		 user.setAddress(address);*/
		 
		 entitymanager.merge(user);
	}
}
