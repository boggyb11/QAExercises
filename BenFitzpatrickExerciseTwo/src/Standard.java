import java.util.Scanner;

public class Standard {
	
	public int TicketPrice = 8;
	public int TotalA=0;
	public int Number;
	private Scanner userInput;


	public int getNumberOfTickets() {
		
		userInput = new Scanner(System.in);
		System.out.println(" How many Standard tickets do you require?");
		int numTickets = userInput.nextInt();
		userInput.nextLine();
		Number= numTickets;
		System.out.println("Total Number of Standard Tickets is :" + numTickets);
		
		return numTickets;
	
	}	
}
