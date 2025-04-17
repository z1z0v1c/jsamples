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
        return this.sideB;
    }

    public double getSideC() {
        return this.sideC;
    }

    @Override
    public double getPerimeter() {
        return getSideA() + this.sideB + this.sideC;
    }

    @Override
    public double getArea() {
        double p = (getSideA() + this.sideB + this.sideC) / 2;

        return Math.sqrt(p * (p - getSideA()) * (p - this.sideB) * (p - this.sideC));
    }

    @Override
    public String toString() {
        return new StringBuilder(this.getClass().getSimpleName())
                .append(": Side A = ").append(this.getSideA())
                .append("; Side B = ").append(this.getSideB())
                .append("; Side C = ").append(this.getSideC())
                .append("; Perimeter = ").append(this.getPerimeter())
                .append("; Area = ").append(this.getArea())
                .append(".").toString();
    }
}
