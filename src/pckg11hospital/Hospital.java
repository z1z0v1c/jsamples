package pckg11hospital;

import java.util.List;

/**
 * @author Aleksandar Zizovic
 */
public class Hospital {
    private final String name;
    private final Staff executive;
    private final List<OtherStaff> staffList;
    private final List<Doctor> doctors;
    private final List<Nurse> nurses;

    public Hospital(
            String name,
            Staff executive,
            List<OtherStaff> staffList,
            List<Doctor> doctors,
            List<Nurse> nurses
    ) {
        this.name = name;
        this.executive = executive;
        this.staffList = staffList;
        this.doctors = doctors;
        this.nurses = nurses;
    }

    public String getName() {
        return name;
    }

    public List<OtherStaff> getStaffList() {
        return staffList;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public List<Nurse> getNurses() {
        return nurses;
    }

    @Override
    public String toString() {
        return new StringBuilder(this.getClass().getSimpleName())
                .append(" - Name: ").append(this.name)
                .append("; Executive: ").append(this.executive)
                .append("; Staff list: ").append(this.staffList)
                .append("; Doctors: ").append(this.doctors)
                .append("; Nurses: ").append(this.nurses)
                .toString();
    }
}
