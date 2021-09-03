package com.revature.learnstatic;

public class AnotherClass {

	public static void main(String[] args) {
		
		System.out.println(staticDemo.age);
		staticDemo.age=25;
		System.out.println(staticDemo.age);
		
		staticDemo staticDemo1 = new staticDemo();
		System.out.println(staticDemo1.age);
		
		staticDemo.staticMethod(); //  we can directly call this method as it is a static method 
		
		

	}

}
