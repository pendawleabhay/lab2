package edu.sjsu.cmpe275.lab2.entities;

import javax.persistence.*;

@Embeddable //@Access(AccessType.FIELD)
public class Address
{
	/*@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "addressId")
	private int addressId;*/
	
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
