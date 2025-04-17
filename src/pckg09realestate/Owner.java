package pckg09realestate;

/**
 * @author Aleksandar Zizovic
 */
public class Owner {
    private static final String REGEX1 = "^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$";
    private static final String REGEX2 = "[0-9]+";
    private static final String WRONG_ENTRY_NAME = "Wrong entry! You have not entered the correct first and last name!";
    private static final String WRONG_ENTRY_ID = "Wrong entry! You have not entered the correct ID!";
    private static final String WRONG_ENTRY_IDENTITY_CARD_ID =
            "Wrong entry! You have not entered the ID card number correctly!";

    private String id;
    private String firstAndLastName;
    private String identityCardNumber;

    public Owner(String firstAndLastName, String id, String identityCardNumber) throws IllegalArgumentException {
        if (firstAndLastName.matches(REGEX1)) {
            this.firstAndLastName = firstAndLastName;
        } else {
            throw new IllegalArgumentException(WRONG_ENTRY_NAME);
        }

        if (id.matches(REGEX2) && id.length() == 13) {
            this.id = id;
        } else {
            throw new IllegalArgumentException(WRONG_ENTRY_ID);
        }

        if (identityCardNumber.matches("[0-9]+") && identityCardNumber.length() == 9) {
            this.identityCardNumber = identityCardNumber;
        } else {
            throw new IllegalArgumentException(WRONG_ENTRY_IDENTITY_CARD_ID);
        }
    }

    public void setFirstAndLastName(String firstAndLastName) throws IllegalArgumentException {
        if (firstAndLastName.matches(REGEX1)) {
            this.firstAndLastName = firstAndLastName;
        } else {
            throw new IllegalArgumentException(WRONG_ENTRY_NAME);
        }
    }

    public void setId(String id) throws IllegalArgumentException {
        if (id.matches(REGEX2) && id.length() == 13) {
            this.id = id;
        } else {
            throw new IllegalArgumentException(WRONG_ENTRY_ID);
        }
    }

    public void setIdentityCardNumber(String identityCardNumber) throws IllegalArgumentException {
        if (identityCardNumber.matches(REGEX2) && identityCardNumber.length() == 9) {
            this.identityCardNumber = identityCardNumber;
        } else {
            throw new IllegalArgumentException(WRONG_ENTRY_IDENTITY_CARD_ID);
        }
    }

    @Override
    public String toString() {
        return new StringBuilder(this.getClass().getSimpleName())
                .append(":\n\t\tFirst and last name: ").append(this.firstAndLastName)
                .append(",\n\t\tId: ").append(this.id)
                .append(",\n\t\tIdentity card number=").append(this.identityCardNumber)
                .toString();
    }
}
