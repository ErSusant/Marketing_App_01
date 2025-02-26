package com.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name="Registrtions")
public class Registration {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="FullName",length=100)
	private String name;
	
	@Column (name="Email",length=150)
	private String email;
	
	@Column(name="Mobile",length=11)
	private long mobile;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
}
