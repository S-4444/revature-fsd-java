package com.revature.app.stream;

import java.util.function.Consumer; // inbuild interface

public class LamdaDemo {

	public static void main(String[] args) {
		
		// Lambda Expression is a shorter from of function
     // (parameter) -> (function -body)
		// lamda Expression introduced in JDK 8.0
		// Consumer<Object> consumer = name -> System.out.println(name);
		CustomFuncinalInterface<Object> customInterface = (name1, name2) -> System.out.println(name1 );
        customInterface.accept("hello" ,  "world");
	}
	public void print( String name) {
		System.out.println(name);
	}

}

// for lamda expression dont need to access modifier and return type