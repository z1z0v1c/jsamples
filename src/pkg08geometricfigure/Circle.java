package pkg08geometricfigure;

public class Circle extends GeometricFigure {

	private double radius;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double perimeter() {
		return 2 * radius * Math.PI;
	}

	@Override
	public double area() {
		return radius * radius * Math.PI;
	}

	@Override
	public String toString() {
		return new StringBuilder("CIRCLE - radius: ").append(radius).append("; obim: ").append(perimeter())
				.append("; povrsina: ").append(area()).append(".").toString();
	}
}
