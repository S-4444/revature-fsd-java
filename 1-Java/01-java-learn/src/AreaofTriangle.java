import java.util.Scanner;
public class AreaofTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the Length :");
		int length=sc.nextInt();
		System.out.println("Enter the breath :");
		int breath=sc.nextInt();
        int areaOfRectangle= length*breath;
        System.out.println("Area of the rectangle is :" + areaOfRectangle);
        sc.close();
	}

}
