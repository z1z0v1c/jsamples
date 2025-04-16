package pckg09realestate;

/**
 * @author Aleksandar Zizovic
 */
public abstract class RealEstate {
    private final Owner owner;
    private final String address;
    private final int zone;
    private final double area;

    private static final String WRONG_ENTRY_ZONE = "Wrong entry! You have not entered the correct zone number!";
    private static final String WRONG_ENTRY_AREA = "Wrong entry! You have not entered the correct square footage!";

    protected RealEstate(Owner owner, String address, int zone, double area) {
        this.owner = owner;
        this.address = address;

        if (zone > 0 && zone < 5) {
            this.zone = zone;
        } else {
            throw new IllegalArgumentException(WRONG_ENTRY_ZONE);
        }

        if (area > 0.0) {
            this.area = area;
        } else {
            throw new IllegalArgumentException(WRONG_ENTRY_AREA);
        }
    }

    public double getArea() {
        return this.area;
    }

    public abstract double getPrice();

    public double getSquareFootagePrice() {
        return switch (this.zone) {
            case 1 -> 3000;
            case 2 -> 2000;
            case 3 -> 1000;
            default -> 500;
        };
    }

    @Override
    public String toString() {
        return new StringBuilder(this.getClass().getSimpleName())
                .append(" - address: ").append(this.address)
                .append(", zone: ").append(this.zone)
                .append(", square footage: ").append(this.area)
                .append(" ").append(this.owner.toString())
                .toString();
    }
}
