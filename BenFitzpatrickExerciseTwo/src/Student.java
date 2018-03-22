import java.util.Scanner;

public class Student {
	
	public int TicketPrice = 8;
	public int TotalC=0;
	public int Number=0;
	private Scanner userInput;

	public int getNumberOfTickets() {
		userInput = new Scanner(System.in);
		System.out.println(" How many Student tickets do you require?");
		int numTickets = userInput.nextInt();
		userInput.nextLine();
		Number= numTickets;
		System.out.println("Total Number of Student Tickets is :" + numTickets);
		
		return numTickets;
	}

}