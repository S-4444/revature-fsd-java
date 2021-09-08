
public class Transaction {
       
	public  char type;
	private double amount;
	
	//Constructor . its not has any return type 
	public Transaction(char type , double amount) {
		this.type=type;
		this.amount = amount;
	}
	
	/*instance method becacuse no static and its not possible to call the method using 
	  Transaction.displayTransaction for call the method displayTransaction we have to 
	  creat the object of the Transaction class */
	
	public void displayTransaction(double balance) {
		System.out.printf("  %c %11.2f %8.2f\n" , type , amount, balance);
	   
	}
	public char getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}

//	public static void main (String args[]) {
//		Transaction transaction1 = new Transaction('W',2000);
//		Transaction transaction2 = new Transaction('D',20000);
//		Transaction transaction3 = new Transaction('D',500);
//		Transaction transaction4 = new Transaction('W',15000);
//		Transaction transaction5 = new Transaction('W',10000);
//	    
//	    Transaction[] transactionArray= {transaction1, transaction2,transaction3,transaction4,transaction5};
//	    for (Transaction  transaction : transactionArray) {
//	    	transaction.displayTransaction(5000);
//	    }
//	}

// class a  {
//	
//	public static void main(String args[]) {
//	Transaction T=new Transaction();
//	Transaction.type='C';
//	}
//	}
	  
}	
	 
 