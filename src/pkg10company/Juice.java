package pkg10company;

/**
 * @author Aleksandar.Zizovic
 *
 */

public class Juice extends Product{
	 
	private String composition;
	private static final double VAT = 1.2;
	
	Juice() {
	}

	Juice(String name, double price, String bestBefore, String composition) {
		super(name, price, bestBefore);
		this.composition = composition;
	}

	public String getComposition() {
		return composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	@Override
	public double getTotalProductPrice() {
		return this.getPrice() * VAT;
	}
	
	@Override
	public String toString() {
		return new StringBuilder(super.toString())
				.append(", composition: ").append(composition)
				.append(TOTAL_PRODUCT_PRICE).append(getTotalProductPrice())
				.toString();
	}	
}
