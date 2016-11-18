package edu.sjsu.cmpe275.lab2.dao;

import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.sjsu.cmpe275.lab2.entities.Address;
import edu.sjsu.cmpe275.lab2.entities.Phone;
import edu.sjsu.cmpe275.lab2.entities.User;

@Repository
public class PhoneDao
{
	@PersistenceContext
	private EntityManager entitymanager;
	
	@Transactional
	public Phone createPhone(Map<String, String> queryMap, int[] userIds)
	{
		//create address
		Address address = new Address();
		address.setCity(queryMap.get("city"));
		
		//create phone
		Phone phone = new Phone();
		phone.setNumber(queryMap.get("number"));
		phone.setAddress(address);
		
		//create user
		//UserDao dao = new UserDao();
		for(int i=0; i<userIds.length; i++)
		{
			ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
			UserDao dao = context1.getBean(UserDao.class);
			User user = dao.getUser(userIds[i]);
			phone.getUserList().add(user);
		}
		
		//store user in db
		entitymanager.merge(phone);
		
		return phone;

	}
}
