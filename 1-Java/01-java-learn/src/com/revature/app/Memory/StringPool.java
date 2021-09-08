package com.revature.app.Memory;

public class StringPool {

	public static void main(String[] args) {
		
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String ("Hello");
        String str4 = new String ("Hello");
        
        String str5= str4; 
        
        System.out.println("str1 == str2 " + (str1 == str2));
        System.out.println("str1 == str3 " + (str1 == str3));
        System.out.println("str2 == str3 " + (str2 == str3));
        System.out.println("str4 == str3 " + (str4 == str3));
        System.out.println("str4 == str5 " + (str4 == str5));
	}

}
