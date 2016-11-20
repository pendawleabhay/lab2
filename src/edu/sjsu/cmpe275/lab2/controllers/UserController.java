package edu.sjsu.cmpe275.lab2.controllers;

import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import edu.sjsu.cmpe275.lab2.dao.PhoneDao;
import edu.sjsu.cmpe275.lab2.dao.UserDao;
import edu.sjsu.cmpe275.lab2.entities.Address;
import edu.sjsu.cmpe275.lab2.entities.Phone;
import edu.sjsu.cmpe275.lab2.entities.User;

@Controller
@RequestMapping(value = "/user")
public class UserController 
{
	
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
	@RequestMapping(value="")
	public ModelAndView userForm()
	{
		
		ModelAndView model = new ModelAndView("User/UserForm");
		return model;
	}

	@RequestMapping(value = "/userId"  /*, method = RequestMethod.POST*/)
	public ModelAndView createUser(  @RequestParam Map<String, String> queryMap)
	{
			
		UserDao dao = context.getBean(UserDao.class);
		User user = dao.createUser(queryMap);
		ModelAndView model = new ModelAndView("User/UserSuccess"); 
		model.addObject(user);
		return model;
	}
	
	@RequestMapping(value = "/{userId}")
	public ModelAndView getUser(@PathVariable("userId") int userId)
	{
		UserDao dao = context.getBean(UserDao.class);
		User user = dao.getUser(userId);
		ModelAndView model = new ModelAndView("User/UserDetail"); 
		model.addObject(user);
		return model;
	}
	
}