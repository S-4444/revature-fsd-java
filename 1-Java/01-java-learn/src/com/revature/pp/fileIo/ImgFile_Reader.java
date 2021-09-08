package com.revature.pp.fileIo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImgFile_Reader {

	public static void main(String[] args)   throws FileNotFoundException , IOException{
		// TODO Auto-generated method stub

		FileInputStream reader = new FileInputStream("D:\\img.jpg");
		FileOutputStream writer = new FileOutputStream("D:\\img_copy.jpg");
		
		int character = reader.read();
		
		while(character !=-1) {
			System.out.print((char) character);
			writer.write(character);
         	character = reader.read();
			
		}
		writer.close();
		reader.close();
	}

}
