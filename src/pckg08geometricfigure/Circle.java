package pckg08geometricfigure;

public class Circle extends GeometricFigure {
    private final double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return new StringBuilder(this.getClass().getSimpleName())
                .append(": Radius = ").append(this.radius)
                .append(", Perimeter = ").append(this.getPerimeter())
                .append(", Area = ").append(this.getArea())
                .append(".").toString();
    }
}
