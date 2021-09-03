
public class TVSchedule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		System.out.println("Using while loop");
		Line_printer.printLine();
		int date=2;
		while(date<=31) {
			System.out.println(date);
			date = date + 3;
		}
		
		System.out.println("using do. while loop :");
		date =2;
		do {
			System.out.println(date);
			date = date+3;
		}while(date<=31);
		
		System.out.println("Using for loop  ");
		for (int i=2 ; i<=31 ; i=i+3) {
			System.out.println(i);
		}
	}

}
