package pckg08geometricfigure;

/**
 * @author Aleksandar Zizovic
 */
public class Rectangle extends Square {
    private final double sideB;

    public Rectangle(String color, boolean filled, double sideA, double sideB) {
        super(color, filled, sideA);
        this.sideB = sideB;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.getSideA() + this.sideB);
    }

    @Override
    public double getArea() {
        return this.getSideA() * this.sideB;
    }

    @Override
    public String toString() {
        return new StringBuilder(this.getClass().getSimpleName())
                .append(": Side A = ").append(this.getSideA())
                .append("; Side B = ").append(this.sideB)
                .append("; Perimeter = ").append(this.getPerimeter())
                .append("; Area = ").append(this.getArea())
                .append(".").toString();
    }
}
