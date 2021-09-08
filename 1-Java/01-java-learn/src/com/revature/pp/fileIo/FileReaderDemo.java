package com.revature.pp.fileIo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws FileNotFoundException , IOException {
		// TODO Auto-generated method stub

		FileReader reader = new FileReader("D:\\Filereader_Demo.txt");
		FileWriter writer = new FileWriter("D:\\Filereader_demo_Copy.txt");
		
	  /*  int character = reader.read(); // when the reader will read all the element then it will give -1 as a o/p.
		System.out.println((char) character);
		reader.close();
		
		character = reader.read();
		System.out.println((char) character);
		reader.close();
		
		character = reader.read();
		System.out.println((char) character);
		reader.close();
		
		character = reader.read();
		System.out.println((char) character);
		reader.close();  */
		int character = reader.read();
		while (character != -1) {
			System.out.print((char) character);
		     
			writer.write(character);
			character = reader.read();
			
		}
      	writer.close();
		reader.close();
	}

}
