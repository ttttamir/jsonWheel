package com.xgen.wheel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Person {

	String firstName;
	String secondName;
	String phone;
	int age;

	// 族谱
	Address attr;
	LinkedList<Object> parent;
	

	public Person() {
		super();
	}

	public Person(String firstName, String secondName, String phone, int age) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.phone = phone;
		this.age = age;
	}

	public Person(String firstName, String secondName, String phone, int age, Person[] parents) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.phone = phone;
		this.age = age;
	}

	public Person(String firstName, String secondName, String phone, int age, LinkedList<Object> parent) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.phone = phone;
		this.age = age;
		this.parent = parent;
	}

	public LinkedList<Object> getParent() {
		return parent;
	}

	public void setParent(LinkedList<Object> parent) {
		this.parent = parent;
	}

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAttr() {
		return attr;
	}

	public void setAttr(Address attr) {
		this.attr = attr;
	}



}
