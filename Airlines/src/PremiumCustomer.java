/**
 * @author dpMelian
 */

public class PremiumCustomer implements ICustomer {
	private final String firstName;
	private final String surname;
	private final String idNumber;
	private int kilometersFlown;
	
	public PremiumCustomer(String firstName, String surname, String idNumber, int kilometersFlown) {
		this.firstName = firstName;
		this.surname = surname;
		if(idNumber.matches("[0-9]+") && idNumber.length() == 10) {
			this.idNumber = idNumber;
		} else {
			throw new IllegalArgumentException("ID number must be 10 digit long.");
		}
		this.kilometersFlown = kilometersFlown;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getSurname() {
		return surname;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public int getKilometersFlown() {
		return kilometersFlown;
	}
	public void setKilometersFlown(int kilometersFlown) {
		this.kilometersFlown = kilometersFlown;
	}
	public static void main(String[] args) {
		PremiumCustomer premiumCustomer = new PremiumCustomer("Daniel", "Perez", "1234567890", 3600);
		System.out.print("Customer name: ");
		System.out.println(premiumCustomer.getFirstName());
		System.out.print("Customer surname: ");
		System.out.println(premiumCustomer.getSurname());
		System.out.print("Customer ID number: ");
		System.out.println(premiumCustomer.getIdNumber());
		
	}
}
