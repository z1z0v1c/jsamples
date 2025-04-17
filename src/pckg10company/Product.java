package pckg10company;

/**
 * @author Aleksandar Zizovic
 */
public abstract class Product {
    protected static final String TOTAL_PRODUCT_PRICE = "Total product price: ";

    private final String name;
    private final double price;
    private final String bestBefore;

    Product(String name, double price, String bestBefore) {
        super();
        this.name = name;
        this.price = price;
        this.bestBefore = bestBefore;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public abstract double getTotalProductPrice();

    @Override
    public String toString() {
        return new StringBuilder(this.getClass().getSimpleName())
                .append(":\n\t\tProduct name: ").append(this.name)
                .append("\n\t\tProduct price: ").append(this.price)
                .append("\n\t\tBest before: ").append(this.bestBefore)
                .toString();
    }
}
