package pkg09realestate;

/**
 * @author Aleksandar.Zizovic
 */
public abstract class RealEstate {

	private String address;
	private int zone;
	private double area;
	private Owner owner;
	
	private static final String WRONG_ENTRY_ZONE = "Wrong entry! You have not entered the correct zone number!";
	private static final String WRONG_ENTRY_AREA = "Wrong entry! You have not entered the correct square footage!";

	protected RealEstate() {
	}

	protected RealEstate(String address, int zone, double area, Owner owner) {
		this.address = address;
		if (zone > 0 && zone < 5) {
			this.zone = zone;
		}else {
			throw new IllegalArgumentException(WRONG_ENTRY_ZONE);
		}
		
		if (area > 0.0) {
			this.area = area;
		} else {
			throw new IllegalArgumentException(WRONG_ENTRY_AREA);
		}
		
		this.owner = owner;
	}

	public String getAdresa() {
		return address;
	}

	public void setAdresa(String adresa) {
		this.address = adresa;
	}

	public int getZona() {
		return zone;
	}

	public void setZona(int zona) {
		if (zona > 0 && zona < 5) {
			this.zone = zona;
		} else {
			throw new IllegalArgumentException(WRONG_ENTRY_ZONE);
		}
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		if (area > 0.0) {
			this.area = area;
		} else {
			throw new IllegalArgumentException(WRONG_ENTRY_AREA);
		}
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return new StringBuilder(this.getClass().getSimpleName())
			.append(" - address: ").append(address)
			.append(", zone: ").append(zone)
			.append(", square footage: ").append(area)
			.append(" ").append(owner.toString()).toString();
	}

	public abstract double getPrice();

	public double getSquareFootagePrice() {
		switch (this.zone) {
		case 1:
			return 3000;
		case 2:
			return 2000;
		case 3:
			return 1000;
		default:
			return 500;
		}
	}
}
