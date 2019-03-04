import java.util.LinkedList;

/**
 * @author dpMelian
 */

public interface IRegister {
	LinkedList<ICustomer> getCustomerList();
	void add(ICustomer customer);
}
