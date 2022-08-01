package pkg11hospital;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a program that describes the following scenario:
 *
 * The company owns a number of private hospitals. Each hospital has its own employees. Employees can be:
 * - Doctors
 * - Staff
 * - Nurses
 * The hospital contains information about the name, director and number of employees. The data stored about the doctor are:
 * - College
 * - Name
 * - Surname
 * - Address
 * - Phone
 * - Date of Birth
 * We keep the same things about the person, except for the college information. There is also a shift for nurses. Company
 * contains a toString() method that prints out how many hospitals and doctors, nurses, and staff each have.
 * 
 * @author Aleksandar.Zizovic
 */
public class Main {

	public static void main(String[] args) {

		OtherStaff otherStuff = new OtherStaff("Petar", "Petrovic", "Zahumska 6", "011222333", "1.5.1968");
		Nurse nurse = new Nurse("Ivana", "Ivanovic", "Igmanska 12", "011333444", "7.3.1983", 1);
		Doctor doctor = new Doctor("Dejan", "Jovanovic", "Dimitrija Tucovica 56", "011000111", "28.10.1971", "Medicinski fakultet");
		
		List<Doctor> listOfDoctors = new ArrayList<>();
		listOfDoctors.add(doctor);
		
		List<Nurse> listOfNurses = new ArrayList<>();
		listOfNurses.add(nurse);
		listOfNurses.add(nurse);
		
		List<OtherStaff> listOfOtherStuff = new ArrayList<>();
		listOfOtherStuff.add(otherStuff);
		listOfOtherStuff.add(otherStuff);
		listOfOtherStuff.add(otherStuff);
	
		Hospital hospital = new Hospital();
		hospital.setName("Bolnica Zvezdara");
		hospital.setExecutive(doctor);
		hospital.setDoctorList(listOfDoctors);
		hospital.setNurseList(listOfNurses);
		hospital.setStaffList(listOfOtherStuff);
		
		List<Hospital> listOfHospitals = new ArrayList<>();
		listOfHospitals.add(hospital);
		listOfHospitals.add(hospital);
		listOfHospitals.add(hospital);
		
		Company company = new Company(listOfHospitals);
		
		System.out.println(company.toString());		
	}
}
