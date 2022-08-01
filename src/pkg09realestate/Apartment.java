package pkg09realestate;

/**
 * @author Aleksandar.Zizovic
 */
public class Apartment extends RealEstate{

	private double basementArea;
	private double terraceArea;
	
	public Apartment() {
	}
	
	public Apartment(String address, int zone, double area, Owner owner, double basementArea, double terraceArea) {
		super(address, zone, area, owner);
		this.basementArea = basementArea;
		this.terraceArea = terraceArea;
	}
	
	public double getBasementArea() {
		return basementArea;
	}
	
	public void setBasementArea(double basementArea) {
		this.basementArea = basementArea;
	}
	
	public double getTerraceArea() {
		return terraceArea;
	}
	
	public void setTerraceArea(double terraceArea) {
		this.terraceArea = terraceArea;
	}

	@Override
	public double getPrice() {
		return (getArea() + (basementArea + terraceArea) * 0.33) * getSquareFootagePrice() ;
	}

	@Override
	public String toString() {
		return new StringBuilder(super.toString())
				.append(", basement square footage: ").append(basementArea)
				.append(", terrace square footage: ").append(terraceArea).toString();
	}	
}
