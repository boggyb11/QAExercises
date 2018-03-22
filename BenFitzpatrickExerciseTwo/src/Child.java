import java.util.Scanner;

public class Child {
	
	public int TicketPrice = 8;
	public int TotalD=0;
	public int Number=0;
	private Scanner userInput;

	public int getNumberOfTickets() {
		userInput = new Scanner(System.in);
		System.out.println(" How many Child tickets do you require?");
		int numTickets = userInput.nextInt();
		userInput.nextLine();
		Number= numTickets;
		System.out.println("Total Number of Child Tickets is :" + numTickets);
		
		return numTickets;
	}



}