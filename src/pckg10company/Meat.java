package pckg10company;

/**
 * @author Aleksandar Zizovic
 */
public class Meat extends Product {
    private static final double VAT = 1.08;

    private final String animalOrigin;

    Meat(String name, double price, String bestBefore, String animalOrigin) {
        super(name, price, bestBefore);
        this.animalOrigin = animalOrigin;
    }

    @Override
    public double getTotalProductPrice() {
        return this.getPrice() * VAT;
    }

    @Override
    public String toString() {
        return new StringBuilder(super.toString())
                .append(", animal origin: ").append(animalOrigin)
                .append(TOTAL_PRODUCT_PRICE).append(getTotalProductPrice())
                .toString();
    }
}
