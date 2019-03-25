import java.util.HashMap;

/**
 * @author dpMelian
 */

public interface IRegister {
	HashMap<Integer, ICustomer> getCustomerList();
	void add(ICustomer customer);
	void setKilometersFlown(int kilometersFlown);
}
