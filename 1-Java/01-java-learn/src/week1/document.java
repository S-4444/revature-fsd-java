package week1;

public class document {

	public static void main(String[] args) {
		
		String[] documents = {"Driving License", "Passport", "Last 3 months Bank Statement",
				              " Salary Slips of last 3 months","2 Passport Size Photographs"}; 

		for(int document=0 ; document<= documents.length-1 ; document++) {
			System.out.println((document+1) +". "+ documents[document]);
		}
		
	}

}
