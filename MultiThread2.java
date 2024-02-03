package MultiThreadPrograms;

class MultiThread3 implements Runnable{
	Thread MultiThread; // New Thread Creation.
	/*
	 * A thread is a thread of execution in a program. The java virtual Machine allows 
	 * an application to have multiple threads of execution running concurrently.
	 */
	
	private String multiname;
	/*
	 * At the time of thread creation,
	 * we may define a thread multiname
	 * using constructor.
	 */
	MultiThread3(String name){
		multiname = name;
	}
	
	@Override
	public void run() {
		System.out.println("Thread running : " + multiname);
		for(int i=0;i<4;i++) {
			System.out.println("Value " + i +" "+ multiname);
			
			try {
				if(multiname.equals("multi1")) {
					Thread.sleep(1000);
				}
				if(multiname.equals("multi2")) {
					Thread.sleep(3000);
				}
			} catch (InterruptedException e) {
				System.out.println("thread has been interrupted");
			}
		}
	}
	
	public void start() {
		System.out.println("Thread started: "+this.multiname);
		if(MultiThread == null) {
			MultiThread = new Thread(this, multiname);
			MultiThread.start();
		}
	}
}

public class MultiThread2 {

	public static void main(String[] args) {
		//we are creating an object of class MultiThread named threadmulti1
		MultiThread3 threadmulti1 = new MultiThread3("Multi-1");
		/*
		 * After execition of this line 
		 * threadmulti1.multiname = "multi-1";
		 */
		threadmulti1.start();
		// we are creating an object of class MultiThread named threadmulti2
		MultiThread3 threadmulti2 = new MultiThread3("Multi-2");
		/*
		 * After execition of this line 
		 * threadmulti2.multiname = "multi-2";
		 */
		threadmulti2.start();
		
		MultiThread3 threadmulti3 = new MultiThread3("Multi-3");
		threadmulti3.start();
	}

}



































