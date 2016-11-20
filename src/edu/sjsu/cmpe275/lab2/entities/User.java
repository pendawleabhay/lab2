package edu.sjsu.cmpe275.lab2.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
	
		  @Id
		  @GeneratedValue(strategy=GenerationType.IDENTITY)
		  @Column(name = "userId")
		  private int userId;
		
		@Column(name = "firstname")
		  private String firstname;
		
		@Column(name = "lastname")
		private String lastname;
		
		@Column(name = "title")
		private String title;
		  
		  @Embedded
		  private Address address;
		  
		  @JoinTable(name="phone_user", joinColumns = { @JoinColumn(name = "users_userId", referencedColumnName = "userId")},
			        inverseJoinColumns = { @JoinColumn(name = "Phone_phoneId", referencedColumnName = "phoneId") } )
		  @ManyToMany
		    private List<Phone> phones = new ArrayList<Phone>();
		
		  
			public int getUserId()
			{
				return userId;
			}

			public void setUserId(int userId)
			{
				this.userId = userId;
			}

			public Address getAddress()
			{
				return address;
			}
		
			public void setAddress(Address address)
			{
				this.address = address;
			}
		
			public String getFirstname() {
				return firstname;
			}
		
			public void setFirstname(String firstname) {
				this.firstname = firstname;
			}

			public String getLastname()
			{
				return lastname;
			}

			public void setLastname(String lastname)
			{
				this.lastname = lastname;
			}

			public String getTitle()
			{
				return title;
			}

			public void setTitle(String title)
			{
				this.title = title;
			}

			public List<Phone> getPhones()
			{
				return phones;
			}

			public void setPhones(List<Phone> phones)
			{
				this.phones = phones;
			}
		      
			
   
}