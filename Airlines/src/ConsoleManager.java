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
		addCustomer.add();
		while(true) {
			System.out.println("What do you want to do? (enter S to show customer list, enter C to change km flown, A to add new Customer)");
			
			switch(scanner.nextLine()) {
				case "S":
					System.out.println(iRegister.getCustomerList());
					break;
				case "C":
					setKilometersFlown.changeKilometersFlown(iRegister);
					break;
				case "A":
					addCustomer.add();
					break;
			}
		}
	}
}
