package pckg11hospital;

/**
 * @author Aleksandar.Zizovic
 */
public abstract class Staff {

	private String firstName;
	private String lastName;
	private String address;
	private String telephone;
	private String birthday;
	
	Staff() {
	}

	Staff(String firstName, String lastName, String address, String telephone, String birthday) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.telephone = telephone;
		this.birthday = birthday;
	}

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getBirthday() {
		return birthday;
	}


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}	
}
