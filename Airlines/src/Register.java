import java.util.ArrayList;

/**
 * @author dpMelian
 */

public class Register implements IRegister {
	ArrayList<ICustomer> customerArrayList;
	
	public Register() {
		customerArrayList = new ArrayList<ICustomer>();
	}
	public ArrayList<ICustomer> getCustomerList() {
		return customerArrayList;
	}
	public void add(ICustomer customer) {
		this.customerArrayList.add(customer);
	}
}
