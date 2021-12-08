package com.example.demo.model1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Employee {

	public Employee(@NotBlank(message = "firstname can not be blank") String firstname,
			@NotBlank(message = "lastname can not be blank") String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}

	@Id
	@NotBlank(message = "empid can not be blank")
	private int empid;
	@NotBlank(message = "username can not be blank")
	private String uname;
	@NotBlank(message = "password can not be blank")
	private String pass;
	@NotBlank(message = "firstname can not be blank")
	private String firstname;
	@NotBlank(message = "lastname can not be blank")
	private String lastname;

	private LocalAddress localaddress;
	private PermenentAddress permenentaddress;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public LocalAddress getLocaladdress() {
		return localaddress;
	}

	public void setLocaladdress(LocalAddress localaddress) {
		this.localaddress = localaddress;
	}

	public PermenentAddress getPermenentaddress() {
		return permenentaddress;
	}

	public void setPermenentaddress(PermenentAddress permenentaddress) {
		this.permenentaddress = permenentaddress;
	}

}
