import java.util.Scanner;
public class eligibilityForVote {

	public static void main(String[] args) {
	 System.out.println("Enter your age : ");
	 Scanner sc = new Scanner(System.in);
	 int age = sc.nextInt();
	 if(age >= 18) {
		 System.out.println(" You are eligible for vote ");
	 }
	 else {
		 System.out.println("Sorry you are not eligible ");
	 }
	sc.close();
	}

}
