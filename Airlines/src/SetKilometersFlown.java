import java.util.Scanner;

/**
 * @author dpMelian
 */

public class SetKilometersFlown {
	Scanner scanner = new Scanner(System.in);
	
	public SetKilometersFlown() {
		
	}
	public void changeKilometersFlown(IRegister iRegister) {
		System.out.println("Enter customer's ID number: ");
		String id = scanner.nextLine();
		
		System.out.println("Enter new kilometers flown: ");
		int kms = scanner.nextInt();
		
		for(ICustomer i : iRegister.getCustomerList()) {
			if(i.getIdNumber().equals(id)) {
				i.setKilometersFlown(kms);
				System.out.println("Kilometers flown were successfully changed.");
			}
		}
	}
}
