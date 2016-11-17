package edu.sjsu.cmpe275.lab2.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Phone
{
	 @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     @Column(name = "phoneId")
	private int id;
	 
	@Column(name = "number")	 
	private String number;

	public String getNumber()
	{
		return number;
	}

	public void setNumber(String number)
	{
		this.number = number;
	}
	
}
