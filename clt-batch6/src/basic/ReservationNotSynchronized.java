package basic;

class Reserve implements Runnable {
	int available = 5;
	int wanted;
	Reserve (int i) {
		wanted = i;
	}

	public void run() {
		System.out.println("Available berths:" + available);
		if (available>=wanted) {
			// get the passenger name
			String name = Thread.currentThread().getName();
			//alot the berth for him
			System.out.println("Successful" + wanted + "Berths reserved for "  +name);
			try {
				Thread.sleep(2000); // wait for printing the ticket
				available = available-wanted;   //update the no. of available berths
				}
		
		catch(InterruptedException ie) {
			
		}
		} // end of if
		else
			System.out.println("Sorry no berths available");
		
		} // end of run
} // end of class

public class ReservationNotSynchronized {

	public static void main(String[] args) {
		Reserve r = new Reserve(3); 
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		t1.setName("Razli");
		t2.setName("Sulianto");
		t3.setName("Karthik");
		t1.start();
		t2.start();
		t3.start();
		
	}

}
