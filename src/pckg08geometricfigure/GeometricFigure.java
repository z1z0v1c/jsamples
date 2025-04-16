package pckg08geometricfigure;

public abstract class GeometricFigure {
    private final String color;
    private final boolean isFilled;

    protected GeometricFigure(String color, boolean isFilled) {
        super();
        this.color = color;
        this.isFilled = isFilled;
    }

    public abstract double getPerimeter();

    public abstract double area();

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Color: ").append(color)
                .append("; Is filled: ").append(isFilled)
                .append("; Perimeter: ").append(getPerimeter())
                .append("; Area: ").append(area()).toString();
    }
}
