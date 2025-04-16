package pckg08geometricfigure;

public class Rectangle extends Square {
    private final double sideB;

    public Rectangle(String color, boolean filled, double sideA, double sideB) {
        super(color, filled, sideA);
        this.sideB = sideB;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public double getPerimeter() {
        return 2 * (getSideA() + sideB);
    }

    @Override
    public double area() {
        return getSideA() * sideB;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Rectangle - side a: ").append(getSideA())
                .append("; side b: ").append(getSideB())
                .append("; perimeter: ").append(this.getPerimeter())
                .append("; area: ").append(area())
                .append(".").toString();
    }
}
