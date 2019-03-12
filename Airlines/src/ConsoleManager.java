import java.util.Scanner;

/**
 * @author dpMelian
 */

public class ConsoleManager {
	Scanner scanner = new Scanner(System.in);
	
	public ConsoleManager() {
		IRegister iRegister = new Register();
		AddCustomer addCustomer = new AddCustomer(iRegister);
		SetKilometersFlown setKilometersFlown = new SetKilometersFlown();
		while(true) {
			System.out.println("What do you want to do? (enter S to show customer list,"
					+ " enter C to change km flown, A to add new customer)");
			
			switch(scanner.next()) {
				case "S":
					System.out.println(iRegister.getCustomerList());
					break;
				case "C":
					setKilometersFlown.changeKilometersFlown(iRegister);
					break;
				case "A":
					System.out.println("***Registrate new customer***");
					addCustomer.add();
					break;
			}
		}
	}
}
