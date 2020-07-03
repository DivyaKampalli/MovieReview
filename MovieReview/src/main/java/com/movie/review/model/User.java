package com.movie.review.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class User { 
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	
	private String name; 
	
	private String mail;
	
	private boolean status;
	
	@ManyToOne
	@JoinColumn(name="user_role", nullable=false)
	private Roles role;
	
	
	public User() {
		super();
	}
	
	public User(int id, String name, String mail, boolean status, Roles role) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.status = status;
		this.role = role;
	} 
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public Roles getRole() {
		return role;
	}


	public void setRole(Roles role) {
		this.role = role;
	}


	
	
}
