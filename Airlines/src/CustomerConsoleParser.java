import java.util.Scanner;

public class CustomerConsoleParser {
	private static Scanner scanner = new Scanner(System.in);
	
	public static ICustomer parsePremiumCustomer() {
		System.out.print("First name: ");
		String firstName = scanner.nextLine();
		
		System.out.print("Surname: ");
		String surname = scanner.nextLine();
		
		System.out.print("ID number: ");
		int idNumber = scanner.nextInt();
		
		System.out.print("Kilometers flown: ");
		int kilometersFlown = scanner.nextInt();
		scanner.nextLine();
		
		return new PremiumCustomer(firstName, surname, idNumber, kilometersFlown);		
	}
}
