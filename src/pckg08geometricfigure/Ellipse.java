package pckg08geometricfigure;

public class Ellipse extends Circle {
    private final double radius2;

    public Ellipse(String color, boolean filled, double radius, double radius2) {
        super(color, filled, radius);
        this.radius2 = radius2;
    }

    @Override
    public double getPerimeter() {
        return getRadius() * Math.PI * (9 - Math.sqrt(35) / 2);
    }

    @Override
    public double area() {
        return getRadius() * radius2 * Math.PI;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Ellipse - radius 1: ").append(getRadius())
                .append("; radius 2: ").append(radius2)
                .append("; perimeter: ").append(getPerimeter())
                .append("; area: ").append(area()).append(".")
                .toString();
    }
}
