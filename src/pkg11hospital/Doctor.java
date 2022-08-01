package pkg11hospital;

/**
 * @author Aleksandar.Zizovic
 */
public class Doctor extends Staff{

	private String faculty;

	Doctor() {
	}

	Doctor(String firstName, String lastName, String address, String telephone, String birthday, String faculty) {
		super(firstName, lastName, address, telephone, birthday);
		this.faculty = faculty;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}		
}
