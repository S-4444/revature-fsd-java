
public class Line_printer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       printLine();
       printLine(15);
       printLine(10);
       printLine(25);
       printLine(25 , '&');
       // Method overloading example from println() function
       System.out.println('A');
       System.out.println(1);
       System.out.println(2.05f);
       
	}
    public static void printLine() {
    	System.out.println("----------------------");
    }
    
    // method overloading- pollymorphism.
    public static void printLine(int numberOfCharacters) {
    	for(int i=0; i<numberOfCharacters;i++) {
    		System.out.print("-");
    	}
    	System.out.println("");
    	
    }
    public static void printLine(int numberOfCharacters , char charecter) {
    	for(int i=0; i<numberOfCharacters;i++) {
    		System.out.print("-");
    	}
    	System.out.println("");
    }
}
