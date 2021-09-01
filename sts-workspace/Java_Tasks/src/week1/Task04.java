package week1;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
         
		System.out.println("Enter time in hh:ss:mm format = "); 
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		System.out.println("Minute is : "+ time.charAt(3)+time.charAt(4));
		
		
		
	}

}
