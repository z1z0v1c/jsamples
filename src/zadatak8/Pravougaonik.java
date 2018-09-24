package zadatak8;

public class Pravougaonik extends Kvadrat {

	private double stranicaB;

	public Pravougaonik() {
		super();
	}

	public Pravougaonik(double stranicaA, double stranicaB) {
		super(stranicaA);
		this.stranicaB = stranicaB;
	}
	
	public Pravougaonik(String boja, boolean ispunjen, double stranicaA, double stranicaB) {
		super(boja, ispunjen, stranicaA);
		this.setStranicaB(stranicaB);
	}
	public double getStranicaB() {
		return stranicaB;
	}

	public void setStranicaB(double stranicaB) {
		this.stranicaB = stranicaB;
	}
	

	@Override
	public double obim() {
		return 2 * (getStranicaA() + stranicaB);
	}

	@Override
	public double povrsina() {
		return getStranicaA() * stranicaB;
	}

	@Override
	public String toString() {
		return new StringBuilder("PRAVOUGAONIK - stranica a: ").append(getStranicaA()).append("; stranica b: ").append(getStranicaB()).append("; obim: ").append(obim()).append("; povrsina: ").append(povrsina()).append(".").toString();
	}


}
