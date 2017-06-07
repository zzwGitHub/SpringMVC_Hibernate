package com.java1234.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class User{

    private long id;  
    private String sex;
    
    @Id
    @GeneratedValue(generator="native")
    @GenericGenerator(name="native", strategy="native")
    @Column(name="userId")
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
    
    
}
