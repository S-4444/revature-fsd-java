package com.revature.app.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ListDemo {

	public static void main(String[] args) {
	 // Integer age = new Integer(10);
	//	int[] a = {};
		
		Integer age = 10;
     ArrayList<Float> arrayList = new ArrayList<Float>();
     //arrayList.add("jhon");
     arrayList.add(1.0f); //autoBoxing is done.
     arrayList.add(1.5f);
     arrayList.add(1.0f);
     arrayList.add(1.3f);
     arrayList.add(1.1f);
     arrayList.add(1.7f);
     arrayList.add(1.9f);
    // String name=(String) arrayList.get(0);
     
    
     System.out.println("by advance for loop");
     for(Float number : arrayList) {
    	 System.out.println(number);
     }
     
     System.out.println("normal for loop ");
     for (int f=0 ; f < arrayList.size(); f++) {
    	 System.out.println(arrayList.get(f));
     }
     System.out.println("\n Sorted");
     Collections.sort(arrayList);
     for (Float number : arrayList) {
    	 System.out.print(number + " , ");
     }
     
	}

}
