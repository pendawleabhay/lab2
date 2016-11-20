package edu.sjsu.cmpe275.lab2.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="phone")
public class Phone
{
	 @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     @Column(name = "phoneId")
	private int phoneId;

	@Column(name = "number")	 
	private String number;
	
	@Column(name = "description")	 	
	private String description;
	
	@Embedded
    private Address address;
	
    public int getPhoneId()
	{
		return phoneId;
	}

	public void setPhoneId(int phoneId)
	{
		this.phoneId = phoneId;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	private List<User> users = new ArrayList<User>();

	public List<User> getUserList()
	{
		return users;
	}

	public void setUserList(List<User> userList)
	{
		this.users = userList;
	}

	public Address getAddress()
	{
		return address;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}

	public String getNumber()
	{
		return number;
	}

	public void setNumber(String number)
	{
		this.number = number;
	}
	
}
