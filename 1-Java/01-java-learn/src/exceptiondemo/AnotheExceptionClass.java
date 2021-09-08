package exceptiondemo;

public class AnotheExceptionClass {

	public static void main(String[] args) {


		ExceptionDemo demo = new ExceptionDemo();
		try {
			demo.methodThrowingException(-10);
		}catch (CustomException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
