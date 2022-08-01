package pkg10company;

/**
 * @author Aleksandar.Zizovic
 */
public abstract class Product {

	private String name;
	private double price;
	private String bestBefore;
	
	protected static final String TOTAL_PRODUCT_PRICE = ". TOTAL PRODUCT PRICE: ";
	
	Product() {
	}

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

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBestBefore() {
		return bestBefore;
	}

	public void setBestBefore(String bestBefore) {
		this.bestBefore = bestBefore;
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
