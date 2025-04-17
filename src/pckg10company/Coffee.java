package pckg10company;

/**
 * @author Aleksandar Zizovic
 */
public class Coffee extends Product {
    private static final double VAT = 1.08;

    private final boolean isGround;

    Coffee(String name, double price, String bestBefore, boolean isGround) {
        super(name, price, bestBefore);
        this.isGround = isGround;
    }

    @Override
    public double getTotalProductPrice() {
        return this.getPrice() * VAT;
    }

    @Override
    public String toString() {
        return new StringBuilder(super.toString())
                .append("\n\t\tType of coffee: ").append((this.isGround) ? "ground" : "in grain").append("\n\t\t")
                .append(TOTAL_PRODUCT_PRICE).append(this.getTotalProductPrice()).append("\n\t")
                .toString();
    }
}
