package exceptiondemo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;



public class ExceptionDemo {

	public static void main(String[] args) {
		
        Scanner sc= new Scanner(System.in);
       try {
        int age = sc.nextInt();// unchecked exception
        System.out.println(age);
        } catch(InputMismatchException e) {
        	System.out.println("Enter a valid number");
        }
        System.out.println("After catch block");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
        	System.out.println(sdf.parse("01/01/21")); // checked exception
        } catch(ParseException e) {
        	System.out.println("Enter date in dd/mm/yyyy");
        } 
	}
	
	public void methodThrowingException(int age) throws  CustomException {
		
		if(age<0) {
//			CustomException exception = new CustomException
			throw new CustomException(" age can't be nagative");
		}
		System.out.println("Method processing.......");
		
	}
}
