package com.gibic.stock.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "usersdb")
@Access(AccessType.FIELD)
public class User extends ParentEntity{

	private static final long serialVersionUID = 2907062981094681205L;
	
	@Column(name="", nullable=false, length=255)
	private String firstName;
	
	@Column(name="", nullable=true, length=255)
	private String secondName;
	
	@Column(name="", nullable=false, length=255)
	private String firstSurname;
	
	@Column(name="", nullable=true, length=255)	
	private String secondSurname;
	
	@Column(name="", nullable=false, length=150)
	private String	emailAddres;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getFirstSurname() {
		return firstSurname;
	}
	public void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}
	public String getSecondSurname() {
		return secondSurname;
	}
	public void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}
	public String getEmailAddres() {
		return emailAddres;
	}
	public void setEmailAddres(String emailAddres) {
		this.emailAddres = emailAddres;
	}
	
}
