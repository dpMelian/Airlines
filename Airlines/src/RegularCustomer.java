/**
 * @author dpMelian
 */

public class RegularCustomer implements ICustomer {
	private final String firstName;
	private final String surname;
	private final int idNumber;
	private int kilometersFlown;
	
	public RegularCustomer(String firstName, String surname, int idNumber, int kilometersFlown) {
		if(firstName.isEmpty() || surname.isEmpty()) {
			throw new IllegalArgumentException("One or more fields are empty.");
		}
		this.firstName = firstName;
		this.surname = surname;
		if(String.valueOf(idNumber).length() == 10) {
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
	public int getIdNumber() {
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
		return "RegularCustomer [firstName=" + firstName + ", surname=" + surname + ", idNumber=" + idNumber
				+ ", kilometersFlown=" + kilometersFlown + "]";
	}
}
