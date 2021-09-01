package week1;

import java.util.Scanner;
public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your bill value : ");
        float billValue = sc.nextFloat();
        System.out.println("Enter discount in percent : ");
        float discount= sc.nextFloat();
        float discountValue = billValue * (discount/100);
        System.out.println("your Discount value is : " + discountValue);
        
        
        
	}

}
