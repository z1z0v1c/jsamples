package pkg08geometricfigure;

public class Square extends GeometricFigure {

	private double sideA;

	public Square() {
		super();
	}

	public Square(double sideA) {
		this.sideA = sideA;
	}

	public Square(String color, boolean filled, double sideA) {
		super(color, filled);
		this.sideA = sideA;
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	@Override
	public double perimeter() {
		return 4 * sideA;
	}

	@Override
	public double area() {
		return sideA * sideA;
	}

	@Override
	public String toString() {
		return new StringBuilder("SQUARE - side: ").append(sideA)
				.append("; perimeter: ").append(perimeter())
				.append("; area: ").append(area())
				.append(".").toString();
	}
}
