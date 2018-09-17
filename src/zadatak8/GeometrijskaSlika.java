package zadatak8;


public abstract class GeometrijskaSlika {
	
	private String boja;
    private boolean ispunjen;
    
    protected GeometrijskaSlika() {
		super();
	}
	
    protected GeometrijskaSlika(String boja) {
		super();
		this.boja = boja;
	}

	protected GeometrijskaSlika(String boja, boolean ispunjen) {
		super();
		this.boja = boja;
		this.ispunjen = ispunjen;
	}
		
	public abstract double obim();
	
	public abstract double povrsina();

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

	public boolean isIspunjen() {
		return ispunjen;
	}

	public void setIspunjen(boolean ispunjen) {
		this.ispunjen = ispunjen;
	}

	@Override
	public String toString() {
		return new StringBuilder("Obim: ").append(obim()).append("; Povrsina: ").append(povrsina()).toString();
	}
	
	
}
