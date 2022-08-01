package pkg10company;

/**
 * @author Aleksandar.Zizovic
 */
public class Meat extends Product{

	private String animalОrigin;
	private static final double VAT = 1.08;

	Meat() {
	}

	Meat(String name, double price, String bestBefore, String animalОrigin) {
		super(name, price, bestBefore);
		this.animalОrigin = animalОrigin;
	}

	public String getAnimalОrigin() {
		return animalОrigin;
	}

	public void setAnimalОrigin(String animalОrigin) {
		this.animalОrigin = animalОrigin;
	}

	@Override
	public String toString() {
		return new StringBuilder(super.toString())
			.append(", animal origin: ").append(animalОrigin)
			.append(TOTAL_PRODUCT_PRICE).append(getTotalProductPrice())
			.toString();
	}

	@Override
	public double getTotalProductPrice() {
		return this.getPrice() * VAT;
	}
}
