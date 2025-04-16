package pckg11hospital;

/**
 * @author Aleksandar.Zizovic
 */
public abstract class Staff {
    private final String firstName;
    private final String lastName;
    private final String address;
    private final String telephone;
    private final String birthday;

    Staff(
            String firstName,
            String lastName,
            String address,
            String telephone,
            String birthday
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.telephone = telephone;
        this.birthday = birthday;
    }


    @Override
    public String toString() {
        return "Staff{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
