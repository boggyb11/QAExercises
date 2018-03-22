import java.text.ParseException;

public class Main {

	public static void main(String[] args) throws ParseException {

		
		
Standard customerStandard = new Standard();
customerStandard.getNumberOfTickets();
int TotalA = 0;
TotalA= customerStandard.Number * 8;
System.out.println("Total Cost of Standard Tickets is : £" + TotalA);

OAP customerOAP = new OAP();
customerOAP.getNumberOfTickets();
int TotalB =0;
TotalB = customerOAP.Number * 6;
System.out.println("Total Cost of Standard Tickets is : £" + TotalB);

Student customerStudent = new Student();
customerStudent.getNumberOfTickets();
int TotalC = 0;
TotalC = customerStudent.Number * 6;
System.out.println("Total Cost of Standard Tickets is : £" + TotalC);

Child customerChild = new Child();
customerChild.getNumberOfTickets();
int TotalD = 0;
TotalD = customerChild.Number * 4;
System.out.println("Total Cost of Standard Tickets is : £" + TotalD);

Discount customerDiscount = new Discount();
customerDiscount.getDate();

if (customerDiscount.Day == 3){
	 //System.out.println("Apply Discount");
	TotalA= customerStandard.Number * 6;
	TotalB = customerOAP.Number * 4;
	TotalC = customerStudent.Number * 4;
	TotalD = customerChild.Number * 2;	
}
else System.out.println("No Discount today");


int Total = TotalA+TotalB+TotalC+TotalD;
System.out.println("The Total Cost for all of your tickets is : £" + Total);

	}

}
