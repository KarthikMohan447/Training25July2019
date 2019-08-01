package basic;

public class ThreadC extends Thread {
	
	@Override
		public void run() {
			for (int i=1; i<=3;i++) {
				try {
					Thread.sleep(10000); // milliseconds
				}
				catch(Exception e) {
					System.out.println(e);
				}
			System.out.println(i);
			System.out.println(currentThread().getName());
			}
	}
	

	public static void main(String[] args) {
		
		ThreadC t1 = new ThreadC();
		ThreadC t2 = new ThreadC();
		ThreadC t3 = new ThreadC();
		ThreadC t4 = new ThreadC();
		ThreadC t5 = new ThreadC();
		
		t1.setName("thead t1");
		t2.setName("thead t2");
		t3.setName("thead t3");
		t4.setName("thead t4");
		t5.setName("thead t5");
		
		t1.start(); // invokes run()
		t2.start(); // invokes run()
		t3.start();
		try {
			t3.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		t4.start();
		
		t5.start();
	}


}