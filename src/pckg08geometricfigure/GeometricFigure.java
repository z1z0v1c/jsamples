package pckg08geometricfigure;

public abstract class GeometricFigure {
	
	private String color;
    private boolean filled;
    
    protected GeometricFigure() {
		super();
	}

	protected GeometricFigure(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}
		
	public abstract double perimeter();
	
	public abstract double area();

	@Override
	public String toString() {
		return new StringBuilder("Perimeter: ").append(perimeter())
				.append("; Area: ").append(area()).toString();
	}
}
