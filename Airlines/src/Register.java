import java.util.LinkedList;

/**
 * @author dpMelian
 */

public class Register implements IRegister {
	LinkedList<ICustomer> customerLinkedList;
	
	public Register() {
		customerLinkedList = new LinkedList<ICustomer>();
	}
	public LinkedList<ICustomer> getCustomerList() {
		return this.customerLinkedList;
	}
	public void add(ICustomer customer) {
		this.customerLinkedList.add(customer);
	}
}
