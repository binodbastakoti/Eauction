package com.mum.waa.project.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Category implements Serializable{

	@Id
	private String id;
	private String name;
	
	public Category()
	{
		
	}
	
	public Category(String id, String name)
	{
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
