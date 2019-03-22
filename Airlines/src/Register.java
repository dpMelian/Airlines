import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author dpMelian
 */

public class Register implements IRegister {
	Scanner scanner = new Scanner(System.in);
	ArrayList<ICustomer> customerArrayList = new ArrayList<ICustomer>();
	
	@Override
	public void add(ICustomer customer) {
		this.customerArrayList.add(customer);
		System.out.println("Customer registered");
	}
	
	@Override
	public ArrayList<ICustomer> getCustomerList() {
		return customerArrayList;
	}
	
	@Override
	public void setKilometersFlown(int kilometersFlown) {
		System.out.println("Enter customer's ID number: ");
		String id = scanner.nextLine();
		
		for(ICustomer i : this.customerArrayList) {
			if(i.getIdNumber().equals(id)) {
				i.setKilometersFlown(kilometersFlown);
				System.out.println("Kilometers flown were successfully changed.");
			}
		}
	}
}
