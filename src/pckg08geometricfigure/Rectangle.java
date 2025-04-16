package pckg08geometricfigure;

public class Rectangle extends Square {

	private double sideB;

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
		return "RECTANGLE - side a: " + getSideA() +
                "; side b: " + getSideB() +
                "; perimeter: " + perimeter() +
                "; area: " + area() +
                ".";
	}
}
