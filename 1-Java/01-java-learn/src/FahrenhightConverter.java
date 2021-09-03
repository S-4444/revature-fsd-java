
public class FahrenhightConverter {

	public static void main(String[] args) {
		
     System.out.println("farenheight: " + toFarenheight(12));
		
	}
    public static float toFarenheight(float celsius) {
    	float farenheight =  (celsius *(9/5.0f))+32;
    	return farenheight;
    }
}
