import java.util.Scanner;

public class OAP {
	
	public int TicketPrice = 8;
	public int TotalB=0;
	public int Number=0;
	private Scanner userInput;

	public int getNumberOfTickets() {
		userInput = new Scanner(System.in);
		System.out.println(" How many OAP tickets do you require?");
		int numTickets = userInput.nextInt();
		userInput.nextLine();
		Number= numTickets;
		System.out.println("Total Number of OAP Tickets is :" + numTickets);
		
		return numTickets;
	}

}
