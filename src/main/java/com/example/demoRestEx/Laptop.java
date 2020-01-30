package com.example.demoRestEx;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

	int id;
	String name;
	
	
	public Laptop() {
		System.out.println("Laptop-Constructor");
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
	
	
	public void compile() {
		System.out.println("compile");
	}
	
}
