package pckg09realestate;

/**
 * @author Aleksandar Zizovic
 */
public class House extends RealEstate {
    private final double yardArea;

    public House(
            Owner owner,
            String address,
            int zone,
            double area,
            double yardArea
    ) {
        super(owner, address, zone, area);
        this.yardArea = yardArea;
    }

    @Override
    public String toString() {
        return new StringBuilder(super.toString())
                .append(",\n\tYard square footage: ").append(this.yardArea)
                .toString();
    }
}
