package pckg11hospital;

/**
 * @author Aleksandar.Zizovic
 */
public class Nurse extends Staff {
    private final int shift;

    Nurse(
            String firstName,
            String lastName,
            String address,
            String telephone,
            String birthday,
            int shift
    ) {
        super(firstName, lastName, address, telephone, birthday);
        this.shift = shift;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "shift=" + shift +
                "} " + super.toString();
    }
}
