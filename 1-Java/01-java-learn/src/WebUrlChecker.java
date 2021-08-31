import java.util.Scanner;
public class WebUrlChecker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Website URL : ");
		String url = sc.nextLine();
		
		if (url.startsWith("http://") || url.startsWith("https://")){
			System.out.println("This is  a valid Web Url ");
		}
		
		else {
			System.out.println("Not a valid URL");
		}

	}

}
