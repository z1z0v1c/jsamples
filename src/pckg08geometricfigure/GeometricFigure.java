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

    public abstract double getArea();

    @Override
    public String toString() {
        return new StringBuilder(this.getClass().getSimpleName())
                .append(": Color = ").append(this.color)
                .append("; Is filled = ").append(this.isFilled)
                .toString();
    }
}
