package com.revature.app.collection;

public class Person implements Comparable<Person> { /*if we dont use the generics "Person"
	                                                then in line no. 30 shoud be there and 
	                                                line 29 replace "Person person" to 
	                                                "Object o" that means Object Custing 
	                                                we have to do */
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person person) {
		     // Person otherPerson = (Person) o; //this is object custing.
	          System.out.println(this.name + " " +person.name);
		//return this.name.compareTo(otherPerson.name);   //return 0;
		      return age- person.age;
	}

//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		return super.equals(obj);
//	}

}