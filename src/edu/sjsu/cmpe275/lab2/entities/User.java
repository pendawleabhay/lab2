package edu.sjsu.cmpe275.lab2.entities;

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