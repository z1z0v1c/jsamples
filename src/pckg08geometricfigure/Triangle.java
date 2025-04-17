package pckg08geometricfigure;

/**
 * @author Aleksandar Zizovic
 */
public class Triangle extends GeometricFigure {
    private final double sideA;

    public Triangle(String color, boolean filled, double sideA) {
        super(color, filled);
        this.sideA = sideA;
    }

    public double getSideA() {
        return this.sideA;
    }

    @Override
    public double getPerimeter() {
        return 3 * this.sideA;
    }

    @Override
    public double getArea() {
        return (this.sideA * this.sideA * Math.sqrt(3)) / 4;
    }

    @Override
    public String toString() {
        return new StringBuilder(this.getClass().getSimpleName())
                .append(": Side = ").append(this.sideA)
                .append("; Perimeter = ").append(this.getPerimeter())
                .append("; Area = ").append(this.getArea())
                .append(".").toString();
    }
}
