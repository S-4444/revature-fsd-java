package threads;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread mainThread = Thread.currentThread(); // currentThread is a static method in Thread class 
		
		ThreadDemo thread = new ThreadDemo();
		thread.start(); /* we can call the run method replacing the start method but then 
		                   it will acts as a normal flow of code  a*/ 
		System.out.println(" main threads " + mainThread.getName());
		
		// for using Runnable interface implements 
		ThredDemo_Runnable runnable = new ThredDemo_Runnable();
		Thread threadRunnable = new Thread(runnable);
		
		threadRunnable.start();
		System.out.println("Main " + mainThread.getName());
	}

}
