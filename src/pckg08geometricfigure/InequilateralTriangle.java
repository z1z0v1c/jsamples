package pckg08geometricfigure;

public class InequilateralTriangle extends Triangle {
    private final double sideB;
    private final double sideC;

    public InequilateralTriangle(
            String color,
            boolean filled,
            double sideA,
            double sideB,
            double sideC
    ) {
        super(color, filled, sideA);
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    @Override
    public double getPerimeter() {
        return getSideA() + sideB + sideC;
    }

    @Override
    public double area() {
        double p = (getSideA() + sideB + sideC) / 2;

        return Math.sqrt(p * (p - getSideA()) * (p - sideB) * (p - sideC));
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Inequilateral triangle - side a: ").append(getSideA())
                .append("; side b: ").append(getSideB())
                .append("; side c: ").append(getSideC())
                .append("; perimeter: ").append(getPerimeter())
                .append("; perimeter: ").append(area())
                .append(".").toString();
    }
}
