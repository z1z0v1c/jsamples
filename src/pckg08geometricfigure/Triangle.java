package pckg08geometricfigure;

public class Triangle extends GeometricFigure {

	private double sideA;

	public Triangle(String color, boolean filled, double sideA) {
		super(color, filled);
		this.sideA = sideA;
	}

	public double getSideA() {
		return sideA;
	}

	@Override
	public double perimeter() {
		return 3 * sideA;
	}

	@Override
	public double area() {
		return (sideA * sideA * Math.sqrt(3)) / 4;
	}

	@Override
	public String toString() {
		return new StringBuilder("EQUILATERAL TRIANGLE - side: ").append(sideA).append("; perimeter: ")
				.append(perimeter()).append("; area: ").append(area()).append(".").toString();
	}
}
