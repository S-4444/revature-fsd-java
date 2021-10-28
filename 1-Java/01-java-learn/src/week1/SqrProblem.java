package week1;

import java.util.ArrayList;
import java.util.Scanner;

public class SqrProblem {

	public static void main(String[] args) {

		System.out.println("Enter your number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sqr = number * number;
		int num = 1;
		String str = Integer.toString(number);
		int n = str.length();
		System.out.println(n);
		for (int i = n; i > 0; i--) {
			num = num * 10;
		}
		int right = sqr % num;

		int left = sqr / num;

		int sum = left + right;
		System.out.println(sum);
		if (sum == number) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
	}

}
