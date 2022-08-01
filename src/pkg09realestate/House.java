package pkg09realestate;

/**
 * @author Aleksandar.Zizovic
 *
 */

public class House extends RealEstate {

	private double yardArea;

	public House() {
	}

	public House(String address, int zone, double area, Owner vlasnik, double yardArea) {
		super(address, zone, area, vlasnik);
		this.yardArea = yardArea;		
	}

	public double getYardArea() {
		return yardArea;
	}

	public void setYardArea(double yardArea) {
		this.yardArea = yardArea;
	}

	@Override
	public double getPrice() {
		return (getArea() + yardArea * 0.15) * this.getSquareFootagePrice();
	}
	
	@Override
	public String toString() {
		return new StringBuilder(super.toString())
				.append(", yard square footage: ").append(yardArea).toString();
	}	
}
