package pckg08geometricfigure;

public class Rectangle extends Square {

	private double sideB;

	public Rectangle() {
		super();
	}

	public Rectangle(double sideA, double sideB) {
		super(sideA);
		this.sideB = sideB;
	}
	
	public Rectangle(String color, boolean filled, double sideA, double sideB) {
		super(color, filled, sideA);
		this.setSideB(sideB);
	}
	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}
	

	@Override
	public double perimeter() {
		return 2 * (getSideA() + sideB);
	}

	@Override
	public double area() {
		return getSideA() * sideB;
	}

	@Override
	public String toString() {
		return new StringBuilder("RECTANGLE - side a: ").append(getSideA())
			.append("; side b: ").append(getSideB())
			.append("; perimeter: ").append(perimeter())
			.append("; area: ").append(area())
			.append(".").toString();
	}
}
