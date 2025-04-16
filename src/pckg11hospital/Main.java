package pckg11hospital;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a program that describes the following scenario:
 * <p>
 * The company owns a number of private hospitals. Each hospital has its own employees. Employees can be:
 * - Doctors
 * - Staff
 * - Nurses
 * <p>
 * The hospital contains information about the name, director and number of employees.
 * The data stored about the doctor are:
 * - College
 * - Name
 * - Surname
 * - Address
 * - Phone
 * - Date of Birth
 * <p>
 * We keep the same things about the person, except for the college information. There is also a shift for nurses.
 * Company contains a toString() method that prints out how many hospitals and doctors, nurses, and staff each have.
 *
 * @author Aleksandar Zizovic
 */
public class Main {
    public static void main(String[] args) {
        OtherStaff otherStuff = new OtherStaff(
                "Petar",
                "Petrovic",
                "Zahumska 6",
                "011222333",
                "1.5.1968"
        );

        Nurse nurse = new Nurse(
                "Ivana",
                "Ivanovic",
                "Igmanska 12",
                "011333444",
                "7.3.1983",
                1
        );

        Doctor doctor = new Doctor(
                "Dejan",
                "Jovanovic",
                "Dimitrija Tucovica 56",
                "011000111",
                "28.10.1971",
                "Medicinski fakultet"
        );

        List<Doctor> doctors = new ArrayList<>();
        doctors.add(doctor);

        List<Nurse> nurses = new ArrayList<>();
        nurses.add(nurse);
        nurses.add(nurse);

        List<OtherStaff> staffList = new ArrayList<>();
        staffList.add(otherStuff);
        staffList.add(otherStuff);
        staffList.add(otherStuff);

        Hospital hospital = new Hospital("Medic", doctor, staffList, doctors, nurses);

        List<Hospital> listOfHospitals = new ArrayList<>();
        listOfHospitals.add(hospital);
        listOfHospitals.add(hospital);
        listOfHospitals.add(hospital);

        Company company = new Company(listOfHospitals);

        System.out.println(company);
    }
}
