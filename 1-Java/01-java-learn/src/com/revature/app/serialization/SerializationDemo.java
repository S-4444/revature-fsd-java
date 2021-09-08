package com.revature.app.serialization;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class SerializationDemo {

	public static void main(String[] args) throws IOException {
		
		    Person person1 = new Person(  1 ,"John", 15);
			Person person2 = new Person(2 ,"Smith", 25);
			Person person3 = new Person(3 ,"Stella", 32);
			Person person4 = new Person(4 ,"Maria", 42);
			Person person5 = new Person(5 ,"Mark", 13);

			
			List<Person> personList = new ArrayList<Person>();
			personList.add(person1);
			personList.add(person2);
			personList.add(person3);
			personList.add(person4);
			personList.add(person5);
	
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\persons.ser");
		ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
		
		objectOutputStream.writeObject(personList);
		
		objectOutputStream.close();
		fileOutputStream.close();
		
	}

}
