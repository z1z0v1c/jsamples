package pckg10company;

/**
 * @author Aleksandar.Zizovic
 */
public abstract class Product {
	protected static final String TOTAL_PRODUCT_PRICE = ". TOTAL PRODUCT PRICE: ";

	private String name;
	private final double price;
	private final String bestBefore;

	Product(String name, double price, String bestBefore) {
		super();
		this.name = name;
		this.price = price;
		this.bestBefore = bestBefore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return new StringBuilder("\n").append(this.getClass().getSimpleName())
				.append(" - product name: ").append(name)
				.append(", product price: ").append(price)
				.append(", best before: ").append(bestBefore)
				.toString();
	}
	
	public abstract double getTotalProductPrice();
}
