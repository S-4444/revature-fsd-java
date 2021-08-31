import java.util.Scanner;

public class MobileMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Menu");
         System.out.println("====");
         System.out.println("1. Balance Enquiry");
         System.out.println("2. Recharge");
         System.out.println("3. Change caller tune");
         
         Scanner sc = new Scanner(System.in);
         System.out.println("Choose an Option");
         int option = sc.nextInt();
         
//         if(option==1) {
//        	  System.out.println("Balance Enquiry");
//         }
//         else if(option==2) {
//        	 System.out.println("2. Recharge");
//         }
//         else if(option==3) {
//        	  System.out.println("3. Change caller tune");
//         }
         
         switch (option) {
         case 1:
        	 System.out.println("Balance Enquiry");
        	 break;
         case 2:
        	 System.out.println("2. Recharge");
        	 break;
         case 3:
        	 System.out.println("3. Change caller tune");
        	 break;
         }
    }

}
