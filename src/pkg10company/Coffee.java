package pkg10company;

/**
 * @author Aleksandar.Zizovic
 *
 */
public class Coffee extends Product {
	
	private boolean isGround;
	private static final double VAT = 1.08;

	Coffee() {
	}

	Coffee(String name, double price, String bestBefore, boolean isGround) {
		super(name, price, bestBefore);
		this.isGround = isGround;
	}

	public boolean isGround() {
		return isGround;
	}

	public void setSamlevena(boolean isGround) {
		this.isGround = isGround;
	}

	@Override
	public double getTotalProductPrice() {
		return this.getPrice() * VAT;
	}

	@Override
	public String toString() {
		return new StringBuilder(super.toString())
			.append(", type of coffee: ").append((isGround) ? "ground" : "in grain")
			.append(TOTAL_PRODUCT_PRICE).append(getTotalProductPrice()).toString();
	}
}
