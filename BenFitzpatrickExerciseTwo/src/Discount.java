import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Discount {

	int Day = 0;
	private Scanner userInput;

	@SuppressWarnings("deprecation")
	public String getDate() throws ParseException {
		userInput = new Scanner(System.in);
		System.out.println(" Please enter date in 'dd MM yyyy' format");
		String userDate = userInput.nextLine();
	
		DateFormat format = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
		Date date = format.parse(userDate);
		System.out.println(date.getDay());
		Day = date.getDay();

		return userDate;
	}
	
	
	
}
