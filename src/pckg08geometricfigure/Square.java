package pckg08geometricfigure;

public class Square extends GeometricFigure {
    private final double sideA;

    public Square(String color, boolean filled, double sideA) {
        super(color, filled);
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    @Override
    public double getPerimeter() {
        return 4 * sideA;
    }

    @Override
    public double area() {
        return sideA * sideA;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Square - side: ").append(sideA)
                .append("; perimeter: ").append(getPerimeter())
                .append("; area: ").append(area())
                .append(".").toString();
    }
}
