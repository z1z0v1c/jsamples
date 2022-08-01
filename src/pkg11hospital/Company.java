package pkg11hospital;

import java.util.List;

/**
 * @author Aleksandar.Zizovic
 *
 */

public class Company {
	
	private static final String NUMBER_OF_HOSPITALS= "Number of hospitals: ";
	private static final String NUMBER_OF_DOCTORS= "\nNumber of doctors: ";
	private static final String NUMBER_OF_NURSES= "\nNumber of Nurses: ";
	private static final String NUMBER_OF_OTHER_STUFF= "\nNumber of other stuff: ";


	private List<Hospital> hospitalList;

	Company() {
	}

	Company(List<Hospital> hospitalList) {
		this.hospitalList = hospitalList;
	}

	public List<Hospital> getHospitalList() {
		return hospitalList;
	}

	public void setHospitalList(List<Hospital> hospitalList) {
		this.hospitalList = hospitalList;
	}

	@Override
	public String toString() {
		int numberOfDoctors = 0;
		int numberOfNurses = 0;
		int numberOfStuff = 0;
		
		for(Hospital b : hospitalList) {
			numberOfDoctors += b.getDoctorList().size();
			numberOfNurses += b.getNurseList().size();
			numberOfStuff += b.getStaffList().size();
		}
		
		return new StringBuilder(NUMBER_OF_HOSPITALS).append(hospitalList.size())
			.append(NUMBER_OF_DOCTORS).append(numberOfDoctors)
			.append(NUMBER_OF_NURSES).append(numberOfNurses)
			.append(NUMBER_OF_OTHER_STUFF).append(numberOfStuff)
			.toString();
	}
}
