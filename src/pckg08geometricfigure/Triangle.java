package pckg08geometricfigure;

public class Triangle extends GeometricFigure {
    private final double sideA;

    public Triangle(String color, boolean filled, double sideA) {
        super(color, filled);
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    @Override
    public double getPerimeter() {
        return 3 * sideA;
    }

    @Override
    public double area() {
        return (sideA * sideA * Math.sqrt(3)) / 4;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Equilateral triangle - side: ").append(sideA)
                .append("; perimeter: ").append(getPerimeter())
                .append("; area: ").append(area())
                .append(".").toString();
    }
}
