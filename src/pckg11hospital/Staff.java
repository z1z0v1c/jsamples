package pckg11hospital;

/**
 * @author Aleksandar Zizovic
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
        return new StringBuilder(getClass().getSimpleName())
                .append(": ").append(this.firstName)
                .append(" ").append(this.lastName)
                .append(", ").append(this.address)
                .append(", ").append(this.telephone)
                .append(", ").append(this.birthday)
                .toString();
    }
}
