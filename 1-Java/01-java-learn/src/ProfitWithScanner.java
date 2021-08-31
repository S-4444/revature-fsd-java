import java.util.*;
public class ProfitWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		  System.out.println("Enter the bying Price :");
  
	     int byingprice=scanner.nextInt();
	     System.out.println("Enter the bying Price :");
	     int sellingprice= scanner.nextInt();
	     int profit= sellingprice-byingprice;
	     System.out.println("Profit :" + profit);
	     scanner.close();
	}

}
