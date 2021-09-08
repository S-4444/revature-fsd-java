package com.revature.app.varargs;

public class VarArgsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		System.out.println(add(1,2,3,4,5,6,7,8));
	  // var args can be defined using...(3 dots) operator
	  // var args should be the last
	}
	
	public static int add(int ... numbers) {
		int total = 0; 
		for(int number : numbers) {
			System.out.println();
			total+=number;
		}
		
		return total ;
	}

}
