package week1;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
	   System.out.println("Enter your name : ");
       Scanner sc= new Scanner(System.in);
       String name= sc.nextLine();
       int valu = name.length();
       if(valu >= 2 && valu<= 6) {
    	   System.out.println("This is a valid short name");
       }
       else {
    	   System.out.println("This is not a valid short name");
       }
       }

}
