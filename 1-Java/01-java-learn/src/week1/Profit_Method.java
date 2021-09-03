package week1;

import java.util.Scanner;

public class Profit_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your Bying price :");
		Scanner sc = new Scanner(System.in);
		float byingPrice = sc.nextFloat();
		System.out.println("Enter your seling price :");
		float sellingPrice = sc.nextFloat();
		// System.out.println(profitIs(byingPrice, sellingPrice));
		Profit_Method p = new Profit_Method();
		p.profitIs(byingPrice, sellingPrice);
	}

	public  void profitIs(float byingPrice, float sellingPrice) {
		if (byingPrice > sellingPrice) {
			float losse = byingPrice - sellingPrice;
			System.out.println("you are in a loose of ruppes : " + losse);
			// return losse;
		} else {
			float profit = sellingPrice - byingPrice;
			System.out.println("you are in a profit of ruppes : " + profit);
			// return profit;
		}

	}
}
