package pkg08geometricfigure;

public class InequilateralTriangle extends Triangle {

	private double sideB;
	private double sideC;

	public InequilateralTriangle() {
		super();
	}

	public InequilateralTriangle(double sideA, double sideB, double sideC) {
		super(sideA);
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public InequilateralTriangle(String color, boolean filled, double sideA, double sideB, double sideC) {
		super(color, filled, sideA);
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	@Override
	public double perimeter() {
		return getSideA() + sideB + sideC;
	}

	@Override
	public double area() {
		double p = (getSideA() + sideB + sideC) / 2;
		return Math.sqrt(p * (p - getSideA()) * (p - sideB) * (p - sideC));
	}

	@Override
	public String toString() {
		return new StringBuilder("INEQUILATERAL TRIANGLE - side a: ").append(getSideA())
				.append("; side b: ").append(getSideB())
				.append("; side c: ").append(getSideC())
				.append("; perimeter: ").append(perimeter())
				.append("; perimeter: ").append(area())
				.append(".").toString();
	}
}
