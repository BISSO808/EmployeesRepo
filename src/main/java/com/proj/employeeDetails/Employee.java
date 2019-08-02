package com.proj.employeeDetails;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
//it automatically creates the table in database using these fields
public class Employee{
	private String firstName;
	private String lastName;
	private Date birthDate;
	private String email;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	public Employee() {

	}
	public Employee(String firstName, String lastName, Date birthDate, String email, int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.email = email;
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
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employees [firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + ", Email="
				+ email + ", Id=" + id + "]";
	}
}
