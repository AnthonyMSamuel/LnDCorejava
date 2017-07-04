package co.techie2techie.lnd.concurrency.basicthread;

public  class MyRunnableThread implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		MyRunnableThread  myRunnableThread = new MyRunnableThread();
		Thread t = new Thread(myRunnableThread);
		t.start();
		for(int i=0; i<100; i++){
			if(i%10==0) System.out.println(Thread.currentThread().getName()+"  "+i);
			
			if(i>49) t.join();
			
		}

	}

	@Override
	public void run() {
		for(int i=0; i<100; i++){
			if(i%10==0) System.out.println(Thread.currentThread().getName()+"  "+i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
