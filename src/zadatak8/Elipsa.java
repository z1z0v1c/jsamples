package zadatak8;

public class Elipsa extends Krug {

	private double poluprecnik2;

	public Elipsa() {
		super();
	}

	public Elipsa(double poluprecnik, double poluprecnik2) {
		this.setPoluprecnik(poluprecnik);
		this.setPoluprecnik2(poluprecnik2);
	}
	
	public Elipsa(String boja, boolean ispunjen, double poluprecnik, double poluprecnik2) {
		super(boja, ispunjen, poluprecnik);
		this.setPoluprecnik2(poluprecnik2);
	}

		public double getPoluprecnik2() {
		return poluprecnik2;
	}

	public void setPoluprecnik2(double poluprecnik2) {
		this.poluprecnik2 = poluprecnik2;
	}
	
	@Override
	public double obim() {
		return getPoluprecnik() * Math.PI * (9 - Math.sqrt(35)/2);
	}

	@Override
	public double povrsina() {
		return getPoluprecnik() * poluprecnik2 * Math.PI;
	}

	@Override
	public String toString() {
		return new StringBuilder("ELIPSA - poluprecnik 1: ").append(getPoluprecnik()).append("; poluprecnik 2: ").append(poluprecnik2).append("; obim: ").append(obim()).append("; povrsina: ").append(povrsina()).append(".").toString();
	}


	
	
	
}
