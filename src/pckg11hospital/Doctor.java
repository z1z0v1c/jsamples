package pckg11hospital;

/**
 * @author Aleksandar Zizovic
 */
public class Doctor extends Staff {
    private final String faculty;

    Doctor(String firstName,
           String lastName,
           String address,
           String telephone,
           String birthday,
           String faculty
    ) {
        super(firstName, lastName, address, telephone, birthday);
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return new StringBuilder(this.getClass().getSimpleName()).append(super.toString())
                .append(", Faculty: ").append(this.faculty).toString();
    }
}
