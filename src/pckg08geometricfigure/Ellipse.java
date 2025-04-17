package pckg08geometricfigure;

public class Ellipse extends Circle {
    private final double radiusB;

    public Ellipse(String color, boolean filled, double radius, double radiusB) {
        super(color, filled, radius);
        this.radiusB = radiusB;
    }

    @Override
    public double getPerimeter() {
        return this.getRadius() * Math.PI * (9 - Math.sqrt(35) / 2);
    }

    @Override
    public double getArea() {
        return this.getRadius() * this.radiusB * Math.PI;
    }

    @Override
    public String toString() {
        return new StringBuilder(this.getClass().getSimpleName())
                .append(": Radius A = ").append(this.getRadius())
                .append(", Radius B = ").append(this.radiusB)
                .append(", Perimeter = ").append(this.getPerimeter())
                .append(", Area = ").append(this.getArea()).append(".")
                .toString();
    }
}
