import java.util.HashMap;
import java.util.Scanner;

/**
 * @author dpMelian
 */

public class Register implements IRegister {
	Scanner scanner = new Scanner(System.in);
	HashMap<Integer, ICustomer> customerHashMap = new HashMap<Integer, ICustomer>();
	
	@Override
	public void add(ICustomer customer) {
		Integer integer = new Integer(customer.getIdNumber());
		this.customerHashMap.put(integer, customer);
		System.out.println("Customer registered");
	}
	
	@Override
	public HashMap<Integer, ICustomer> getCustomerList() {
		return customerHashMap;
	}
	
	@Override
	public void setKilometersFlown(int kilometersFlown) {
		System.out.println("Enter customer's ID number: ");
		int id = scanner.nextInt();
		Integer integer = new Integer(id);
		
		customerHashMap.get(integer).setKilometersFlown(kilometersFlown);
			
		System.out.println("Kilometers flown were successfully changed.");
	}
}
