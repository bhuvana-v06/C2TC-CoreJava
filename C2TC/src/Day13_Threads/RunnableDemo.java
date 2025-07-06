
package Day13_Threads;

public class RunnableDemo {
	public static void main(String[] args) {
		UsingRunnable obj = new UsingRunnable(5,10,"hello");
		
		Runnable runnable = new Runnable() {
			public void run() {
				System.out.println("running task from anonymous class");
				
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		
		runnable=new Runnable() {
			public void run() {
				try {
					for(int i=1;i<=4;i++) {
						System.out.println(" Child thread task3:"+i);
						Thread.sleep(1500);
					}
				}
				catch(InterruptedException e)
				{
					System.out.println("error");
				}
			}
		};
		
		
		
		
		
		thread = new Thread(runnable);
		thread.start();
		
		
		
	}

}
