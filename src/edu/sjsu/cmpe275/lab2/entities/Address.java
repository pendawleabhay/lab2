package edu.sjsu.cmpe275.lab2.entities;

import javax.persistence.*;

@Embeddable 
public class Address
{	
	@Column(name = "city")
	private String city;

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}
	
}
