package edu.sjsu.cmpe275.lab2.controllers;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import edu.sjsu.cmpe275.lab2.dao.PhoneDao;
import edu.sjsu.cmpe275.lab2.entities.Phone;

@Controller
@RequestMapping(value = "/phone")
public class PhoneController
{
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
	@RequestMapping(value="")
	public ModelAndView userForm()
	{
		
		ModelAndView model = new ModelAndView("Phone/PhoneForm");
		return model;
	}
	
	@RequestMapping(value = "/phoneId")
	public ModelAndView createPhone(@RequestParam Map<String, String> queryMap, @RequestParam("users[]") int[] userIds)
	{
		PhoneDao dao = context.getBean(PhoneDao.class);
		Phone phone = dao.createPhone(queryMap, userIds);
		ModelAndView model = new ModelAndView("Phone/PhoneSuccess"); 
		model.addObject(phone);
		return model;
	}
}
