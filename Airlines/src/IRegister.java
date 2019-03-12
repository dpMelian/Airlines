import java.util.ArrayList;

/**
 * @author dpMelian
 */

public interface IRegister {
	ArrayList<ICustomer> getCustomerList();
	void add(ICustomer customer);
}
