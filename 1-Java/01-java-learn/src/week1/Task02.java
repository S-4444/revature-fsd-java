package week1;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		
//		celsius to  Fahrenheit conversion
		
		
        System.out.println("Enter your Celsius Scal value : "); 
		Scanner sc = new Scanner(System.in);
		float celsius = sc.nextFloat();
		float Fahrenheit = (celsius *(9/5.0f))+32;
		
		System.out.println(Fahrenheit);
		
		
	}

}
