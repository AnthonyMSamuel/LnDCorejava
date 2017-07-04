package co.techie2techie.lnd.concurrency.basicthread;

public class MyFirstThread extends Thread{
	
	int orderValue=0;
	
	public void run(){
		for(int i=0; i<100; i++){
			orderValue +=i;
			if(i%10==0) System.out.println(Thread.currentThread().getName()+"  "+i);
			
			
		}
	}
	
	public static void main(String args[]) throws InterruptedException{
		MyFirstThread myFirstThread = new MyFirstThread();
		myFirstThread.start();
		//myFirstThread.run();
		for(int i=0; i<100; i++){
			if(i%10==0) System.out.println(Thread.currentThread().getName()+"  "+i);
			
		}
		myFirstThread.join();
		System.out.println(myFirstThread.orderValue);
	}

}
