package zadatak8;

public class Krug extends GeometrijskaSlika {
	
	private double poluprecnik;
		

	public Krug() {
		super();
	}

	public Krug(double poluprecnik) {
		this.poluprecnik = poluprecnik;
	}

	public Krug(String boja, boolean ispunjen, double poluprecnik) {
		super(boja, ispunjen);
		this.poluprecnik = poluprecnik;
	}

	public double getPoluprecnik() {
		return poluprecnik;
	}

	public void setPoluprecnik(double poluprecnik) {
		this.poluprecnik = poluprecnik;
	}

	@Override
	public double obim() {
		return 2 * poluprecnik * Math.PI;
	}

	@Override
	public double povrsina() {
		return poluprecnik * poluprecnik * Math.PI;
	}

	@Override
	public String toString() {
		return new StringBuilder("KRUG - poluprecnik: ").append(poluprecnik).append("; obim: ").append(obim()).append("; povrsina: ").append(povrsina()).append(".").toString();
	}
	
	
}
