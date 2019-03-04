import java.util.Scanner;

/**
 * @author dpMelian
 */

public class AddCustomer {
	Scanner scanner = new Scanner(System.in);
	IRegister iRegister;
	
	public AddCustomer(IRegister iRegister) {
		this.iRegister = iRegister;
	}
	public void add() {
		
		System.out.println("***Registrate new customer***");
		System.out.print("First name: ");
		String firstName = scanner.nextLine();
		
		System.out.print("Surname: ");
		String surname = scanner.nextLine();
		
		System.out.print("ID number: ");
		String idNumber = scanner.nextLine();
		
		System.out.print("Kilometers flown: ");
		int kilometersFlown = scanner.nextInt();
		
		iRegister.add(new PremiumCustomer(firstName, surname, idNumber, kilometersFlown));
		System.out.println("Client registered");
	}
}
