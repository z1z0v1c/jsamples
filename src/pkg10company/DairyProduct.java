package pkg10company;

/**
 * @author Aleksandar.Zizovic
 */
public class DairyProduct extends Product {

	private String milkOrigin;
	private static final double VAT = 1.2;

	DairyProduct() {
	}

	DairyProduct(String name, double price, String bestBefore, String milkOrigin) {
		super(name, price, bestBefore);
		this.milkOrigin = milkOrigin;
	}

	public String getMilkOrigin() {
		return milkOrigin;
	}

	public void setMilkOrigin(String milkOrigin) {
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
