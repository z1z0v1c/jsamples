package pckg08geometricfigure;

public class Square extends GeometricFigure {
    private final double sideA;

    public Square(String color, boolean filled, double sideA) {
        super(color, filled);
        this.sideA = sideA;
    }

    public double getSideA() {
        return this.sideA;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.sideA;
    }

    @Override
    public double getArea() {
        return this.sideA * this.sideA;
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
