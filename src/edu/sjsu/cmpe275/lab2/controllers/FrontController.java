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

import edu.sjsu.cmpe275.lab2.dao.UserDao;
import edu.sjsu.cmpe275.lab2.entities.Address;
import edu.sjsu.cmpe275.lab2.entities.User;

@Controller
public class FrontController {
	
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

	@RequestMapping(value="/")
	public ModelAndView homePage() {
		ModelAndView model = new ModelAndView("index");
		return model;
	}
	
	@RequestMapping(value = "submitUserForm")
	public ModelAndView submitUserForm(@RequestParam Map<String, String> queryMap ){
			
		UserDao dao = context.getBean(UserDao.class);
		User user = dao.createUser(queryMap);
		ModelAndView model = new ModelAndView("UserSuccess"); 
		model.addObject(user);
		return model;
	}
}