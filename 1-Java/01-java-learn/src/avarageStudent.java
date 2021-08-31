import java.util.Scanner;
public class avarageStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		;
		System.out.println("Enter your score: ");
		Scanner sc= new Scanner(System.in);
		int score= sc.nextInt();
		if(score >= 60 && score <= 70) {
			System.out.println("you are a Avarage Student");
			
		}
		else {
			System.out.println("you are not an Avarage Student");
		}
		sc.close();
	}

}
