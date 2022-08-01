package pkg11hospital;

/**
 * @author Aleksandar.Zizovic
 */
public class Nurse extends Staff{

	private int shift;

	Nurse() {
	}

	Nurse(String firstName, String lastName, String address, String telephone, String birthday, int shift) {
		super(firstName, lastName, address, telephone, birthday);
		this.shift = shift;
	}

	public int getShift() {
		return shift;
	}

	public void setShift(int shift) {
		this.shift = shift;
	}	
}
