package pckg10company;

/**
 * @author Aleksandar.Zizovic
 */
public class Juice extends Product{
	 
	private String composition;
	private static final double VAT = 1.2;

	Juice(String name, double price, String bestBefore, String composition) {
		super(name, price, bestBefore);
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
