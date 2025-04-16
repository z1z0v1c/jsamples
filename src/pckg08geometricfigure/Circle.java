package pckg08geometricfigure;

public class Circle extends GeometricFigure {
	private final double radius;

	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
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
