package com.bixterprise.pmes.models;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;


//@Entity
//@Table(name="employees")
public class Employe {
	
//	@Id
//	@GeneratedValue
	Long id;

//	@Column(name="name")
	private String name;
	
//	@Column(name="surname")
	private String surname;
	
//	@Column(name="function")
	private String function;

	public Employe() {}
	
	public Employe(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", surname=" + surname + ", function=" + function + "]";
	}
	 
	
}
