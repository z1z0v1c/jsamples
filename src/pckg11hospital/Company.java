package pckg11hospital;

import java.util.List;

/**
 * @author Aleksandar Zizovic
 */
public class Company {
    private static final String NUMBER_OF_HOSPITALS = "Number of hospitals: ";
    private static final String NUMBER_OF_DOCTORS = "\nNumber of doctors: ";
    private static final String NUMBER_OF_NURSES = "\nNumber of Nurses: ";
    private static final String NUMBER_OF_OTHER_STUFF = "\nNumber of other stuff: ";

    private final List<Hospital> hospitals;

    Company(List<Hospital> hospitals) {
        this.hospitals = hospitals;
    }

    @Override
    public String toString() {
        int numberOfDoctors = 0;
        int numberOfNurses = 0;
        int numberOfStuff = 0;

        for (Hospital b : hospitals) {
            numberOfDoctors += b.getDoctors().size();
            numberOfNurses += b.getNurses().size();
            numberOfStuff += b.getStaffList().size();
        }

        return new StringBuilder()
                .append(NUMBER_OF_HOSPITALS).append(this.hospitals.size())
                .append(NUMBER_OF_DOCTORS).append(numberOfDoctors)
                .append(NUMBER_OF_NURSES).append(numberOfNurses)
                .append(NUMBER_OF_OTHER_STUFF).append(numberOfStuff)
                .toString();
    }
}
