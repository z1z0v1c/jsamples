package pckg09realestate;

/**
 * @author Aleksandar Zizovic
 */
public class Apartment extends RealEstate {
    private final double basementArea;
    private final double terraceArea;

    public Apartment(
            Owner owner,
            String address,
            int zone,
            double area,
            double basementArea,
            double terraceArea
    ) {
        super(owner, address, zone, area);
        this.basementArea = basementArea;
        this.terraceArea = terraceArea;
    }

    @Override
    public String toString() {
        return new StringBuilder(super.toString())
                .append(", basement square footage: ").append(this.basementArea)
                .append(", terrace square footage: ").append(this.terraceArea)
                .toString();
    }
}
