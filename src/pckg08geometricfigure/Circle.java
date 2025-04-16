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
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return new StringBuilder("Circle - radius: ").append(radius)
                .append("; perimeter: ").append(getPerimeter())
                .append("; area: ").append(area())
                .append(".").toString();
    }
}
