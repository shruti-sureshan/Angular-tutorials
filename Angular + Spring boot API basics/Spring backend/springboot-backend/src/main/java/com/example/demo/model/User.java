package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
	
	@Column(name="fname")
private String fname;
	
	@Column(name="grade")
private String grade;
	
private String email;


public User() {}

public User(String fname, String grade, String email) {
	super();
	this.fname = fname;
	this.grade = grade;
	this.email = email;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
