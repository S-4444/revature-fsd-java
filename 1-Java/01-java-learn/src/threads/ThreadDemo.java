package threads;

public class ThreadDemo extends Thread{
	
	public void run() {
		System.out.println("threads " + getName());
	}

}
