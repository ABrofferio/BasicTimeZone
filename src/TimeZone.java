import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZone {

	public static void main(String[] args) {
		
		Long unix = Instant.now().getEpochSecond();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm MM-dd-yyyy");
		
		LocalDateTime psT = LocalDateTime.now();
		LocalDateTime esT = LocalDateTime.now().plusHours(3);
		LocalDateTime lsT = LocalDateTime.now().plusHours(8);
		
		String pst = psT.format(formatter);
		String est = esT.format(formatter);
		String lst = lsT.format(formatter);
		Integer p_office = Integer.parseInt(pst.substring(0, 2));
		Integer n_office = Integer.parseInt(est.substring(0, 2));
		Integer l_office = Integer.parseInt(lst.substring(0, 2));
		
		System.out.println("The current Epoch time is: " + unix);
		System.out.print("The current time in Portland is: " + pst + ". ");
		if (p_office > 8 && p_office < 18) {
			System.out.println("The office is open.");
		} else {
			System.out.println("The office is no longer open.");
		}
		System.out.print("The current time in New York is: " + est + ". ");
		if (n_office > 8 && n_office < 18) {
			System.out.println("The office is open.");
		} else {
			System.out.println("The office is no longer open.");
		}
		System.out.print("The current time in London is: " + lst + ". ");
		if (l_office > 8 && l_office < 18) {
			System.out.println("The office is open.");
		} else {
			System.out.println("The office is no longer open.");
		}
	}
}
