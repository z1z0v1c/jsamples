package pckg08geometricfigure;

public abstract class GeometricFigure {
	
	private String color;
    private boolean filled;
    
    protected GeometricFigure() {
		super();
	}
	
    protected GeometricFigure(String color) {
		super();
		this.color = color;
	}

	protected GeometricFigure(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}
		
	public abstract double perimeter();
	
	public abstract double area();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	@Override
	public String toString() {
		return new StringBuilder("Perimeter: ").append(perimeter())
				.append("; Area: ").append(area()).toString();
	}
}
