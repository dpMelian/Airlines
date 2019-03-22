import java.util.Scanner;

/**
 * @author dpMelian
 */

public class ConsoleManager {
	Scanner scanner = new Scanner(System.in);
	
	public ConsoleManager() {
		IRegister customersRegister = new Register();
		System.out.println("***Register new customer***");
		customersRegister.add(CustomerConsoleParser.parsePremiumCustomer());
		
		while(true) {
			System.out.println("What do you want to do? (enter S to show customer list,"
					+ " enter C to change km flown, A to add new customer)");
			
			switch(scanner.next()) {
				case "S":
					System.out.println(customersRegister.getCustomerList());
					break;
				case "C":
					System.out.println("Enter new kilometers flown: ");
					int kms = scanner.nextInt();
					customersRegister.setKilometersFlown(kms);
					break;
				case "A":
					System.out.println("***Register new customer***");
					customersRegister.add(CustomerConsoleParser.parsePremiumCustomer());
					break;
			}
		}
	}
}
