/**
 * @author dpMelian
 */

public class PremiumCustomer implements ICustomer {
	private final String firstName;
	private final String surname;
	private final String idNumber;
	private int kilometersFlown;
	
	public PremiumCustomer(String firstName, String surname, String idNumber, int kilometersFlown) {
		if(firstName.isEmpty() || surname.isEmpty() || idNumber.isEmpty()) {
			throw new IllegalArgumentException("One or more fields are empty.");
		}
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
	@Override
	public String toString() {
		return "PremiumCustomer [firstName=" + firstName + ", surname=" + surname + ", idNumber=" + idNumber
				+ ", kilometersFlown=" + kilometersFlown + "]";
	}
}
