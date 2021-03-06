package com.restapi.pkg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
@Table  
public class Employee {

	
	    @Id
	    @GeneratedValue
	    @Column(name = "employee_id", unique = true, nullable = false)
	    private Long id;
	    
	    @Column(name="first_name")
	    private String firstName;
	     
	    @Column(name="last_name")
	    private String lastName;

	    
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}



		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Employee(Long id, String firstName, String lastName) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
		}
	    
	    
	    
	  
	
}
