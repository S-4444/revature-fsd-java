
public class Avarage_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	int[] scroes = new int[5];
//	scroes[0]=48;
//	scroes[0]=55;
//	scroes[0]=92;
//	scroes[0]=78;
//	scroes[0]=64;
//	
   int [] scores = {48,55,92,78,64};
   System.out.println(scores[0]);
   System.out.println(scores[1]);
   float sc=scores.length;
   int sum=0;
   for(float i:scores) {
	   sum+=i;
   }
    float avg= sum/sc;
   
   System.out.println("avarage is : "+ avg);
	}

}
