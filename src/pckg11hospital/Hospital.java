package pckg11hospital;

import java.util.List;

/**
 * @author Aleksandar.Zizovic
 */
public class Hospital {

	private String name;
	private Staff executive;
	private List<OtherStaff> staffList;
	private List<Doctor> doctorList;
	private List<Nurse> nurseList;

	Hospital() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setExecutive(Staff executive) {
		this.executive = executive;
	}

	public List<OtherStaff> getStaffList() {
		return staffList;
	}

	public void setStaffList(List<OtherStaff> staffList) {
		this.staffList = staffList;
	}

	public List<Doctor> getDoctorList() {
		return doctorList;
	}

	public void setDoctorList(List<Doctor> doctorList) {
		this.doctorList = doctorList;
	}

	public List<Nurse> getNurseList() {
		return nurseList;
	}

	public void setNurseList(List<Nurse> nurseList) {
		this.nurseList = nurseList;
	}
}
