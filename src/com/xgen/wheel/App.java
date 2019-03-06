package com.xgen.wheel;

import java.util.LinkedList;

public class App {
	public static void main(String[] args) {
		
		Person mom = new Person("cc","dd","138",30);
//		Person[] parents = new Person[1];
//		parents[0] = mom;
		
		LinkedList<Object> parent = new LinkedList<>();
		parent.add(mom);
		
		Person person = new Person("aa","bb","131",18,parent);
		person.setAttr(new Address("湖南省"));
		
		
		Person2 person2 = new Person2("Tom","138");
		
//		People parents = new People();
//		parents.add(e)
		
//		Person[] people = new Person[4];
//		Person[] people2 = new Person[2];
//		Person person1 = new Person("1","1","131",18);
//		Person person2 = new Person("2","2","138",20);
//		Person person3 = new Person("3","3","176",25);
//		Person person4 = new Person("5","5","189",23);
//		Person person6 = new Person("6","6","189",23);
//		people[0] = person1;
//		people[1] = person2;
//		people[2] = person3;
//		people2[0] = person4;
//		people2[1] = person6;
//		Person person5 = new Person("4","4","188",22,people2);
//		people[3] = person5;
//		
		Change c = new Change();
		c.toGson(person);
		
		
		
		
		
	}
}
