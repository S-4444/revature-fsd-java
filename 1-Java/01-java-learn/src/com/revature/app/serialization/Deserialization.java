package com.revature.app.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Deserialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\persons.ser");
		ObjectIutputStream objectOutputStream= new ObjectInputStream(fileOutputStream);
		
		List <Person> personList = (ArrayList) objectIutputStream.readObject();
		
		personList.forEach(System.out::println);
		
		objectIutputStream.close();
		fileIutputStream.close();
	}

}
