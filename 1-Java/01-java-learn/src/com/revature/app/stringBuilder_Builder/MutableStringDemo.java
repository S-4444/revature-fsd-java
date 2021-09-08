package com.revature.app.stringBuilder_Builder;

public class MutableStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer buffer = new StringBuffer("12345");
		System.out.println(buffer);
		buffer.reverse();
		System.out.println(buffer);
		
		StringBuilder builder = new StringBuilder("Morning");
		System.out.println(builder);
		builder.reverse();
		
		System.out.println(builder);
		
		
	}

}
