package pckg10company;

/**
 * @author Aleksandar Zizovic
 */
public class DairyProduct extends Product {
    private final String milkOrigin;
    private static final double VAT = 1.2;

    DairyProduct(String name, double price, String bestBefore, String milkOrigin) {
        super(name, price, bestBefore);
        this.milkOrigin = milkOrigin;
    }

    @Override
    public double getTotalProductPrice() {
        return this.getPrice() * VAT;
    }

    @Override
    public String toString() {
        return new StringBuilder(super.toString())
                .append(", milk origin: ").append(milkOrigin)
                .append(". total product price: ").append(getTotalProductPrice())
                .toString();
    }
}
