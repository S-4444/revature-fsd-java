
public class AccountManeger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String accountNumber= "01302343794";
         double balance = 5000.0;
         
         System.out.println("Account Statement of : "+ accountNumber);
         System.out.println("Initial Balance : "+ balance);
         
         System.out.println("\n-------------------------");
         System.out.println("Type Transaction Balance ");
         System.out.println("-------------------------");
	
//         char type='W'	;
//         double transaction=2000.0;
//         balance= balance- transaction;
//	     System.out.printf("  %c %11.2f %8.2f\n" , type , transaction, balance);
//	
//	      type='D'	;
//          transaction=20000.0;
//         balance= balance+ transaction;
//	     System.out.printf("  %c %11.2f %8.2f\n" , type , transaction, balance);
//	
//	     type='D'	;
//         transaction=500.0;
//        balance= balance+ transaction;
//	     System.out.printf("  %c %11.2f %8.2f\n" , type , transaction, balance);
//	
//	     type='W'	;
//         transaction=15500.0;
//        balance= balance- transaction;
//	     System.out.printf("  %c %11.2f %8.2f\n" , type , transaction, balance);
//	
//	     type='W'	;
//         transaction=10000.0;
//        balance= balance- transaction;
//	     System.out.printf("  %c %11.2f %8.2f\n" , type , transaction, balance);
          balance= calculateBalance('W' ,2000.00,balance );
          balance= calculateBalance('D' ,20000.00,balance );
          balance= calculateBalance('D' ,500.00,balance );
          balance= calculateBalance('W' ,15500.00,balance );
          balance= calculateBalance('W' ,10000.00,balance );
	      System.out.println("-------------------------");
	}
	
	public static double calculateBalance(char type , double transaction , double balance ) {
		if (type=='D') {
			balance+=transaction;
		}
		if(type=='W' && balance>transaction) {
			balance-=transaction;
		}
		System.out.printf("  %c %11.2f %8.2f\n" , type , transaction, balance);
	    return balance;
	}

}
