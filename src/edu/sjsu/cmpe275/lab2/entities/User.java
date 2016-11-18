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
		  
		  @Embedded
		  private Address address;
		  
		    private List<Phone> phones = new ArrayList<Phone>();
		
		  public List<Phone> getPhoneList()
			{
				return phones;
			}
			
			public void setPhoneList(List<Phone> phoneList)
			{
				this.phones = phoneList;
			}
		  
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
		      
   
}