package basic;

import java.util.Scanner;

class Reserved implements Runnable {
	static int availableTickets=5;
	
	synchronized void bookTicket(String name, int wantedTickets) {
		
		System.out.println("Available Tickets:" + availableTickets);
		
		if (availableTickets>=wantedTickets) {
			
			System.out.println("Booking Successful" + name + ":" + availableTickets);
		}
		
		else{
			System.out.println("Booking UnSuccessful. Try again");
		} // end if
	} // end bookTicket
	
	class TicketBookingThread extends Thread{

		//Declare variables
	    Reserved rev;
	    String name;
	    
	    TicketBooking(TicketCounter t,String name)
	    {
	        rev = t;
	        name = pname;
	       
	        start(); //Begin the execution of the thread
	    }

	    public void run()
	    {
	        rev.bookTicket(name);
	    }
	}


public class ReservationSynchronized {

	public void main(String[] args) {
		
		  Reserved rev = new Reserved();
		    
		    int ticketForSulianto, ticketForRazli, ticketForKarthik;
		    
		    System.out.println("Welcome to the Ticket Reservation System");
		    System.out.println("Please indicate the number of tickets for the following people\n");
		    
		    System.out.print("How many tickets does Sulianto wants?");
		    Scanner sc = new Scanner(System.in);
		    ticketForSulianto = sc.nextInt();
		    System.out.println("");
		    
		    System.out.print("How many tickets does Razli wants?");
		    sc = new Scanner(System.in);
		    ticketForRazli = sc.nextInt();
		    System.out.println("");
		    
		    System.out.print("How many tickets does Karthik wants?");
		    sc = new Scanner(System.in);
		    ticketForKarthik = sc.nextInt();
		    System.out.println("");
		    
		    TicketBooking th1 = new TicketBooking(rev,"Sulianto",ticketForSulianto);
		    TicketBooking th2 = new TicketBooking(rev,"Razli",ticketForRazli);
		    TicketBooking th3 = new TicketBooking(rev,"Karthik",ticketForKarthik);

}}


@Override
public void run() {
	// TODO Auto-generated method stub
	
}