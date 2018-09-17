package zadatak8;

public class Kvadrat extends GeometrijskaSlika{

	private double stranicaA;
	
	public Kvadrat() {
		super();
	}

	public Kvadrat(double stranicaA) {
		this.stranicaA = stranicaA;
	}

	public Kvadrat(String boja, boolean ispunjen, double stranicaA) {
		super(boja, ispunjen);
		this.stranicaA = stranicaA;
	}

	public double getStranicaA() {
		return stranicaA;
	}

	public void setStranicaA(double stranicaA) {
		this.stranicaA = stranicaA;
	}

	@Override
	public double obim() {
		return 4 *stranicaA;
	}

	@Override
	public double povrsina() {
		return stranicaA * stranicaA;
	}

	@Override
	public String toString() {
		return new StringBuilder("KVADRAT - stranica: ").append(stranicaA).append("; obim: ").append(obim()).append("; povrsina: ").append(povrsina()).append(".").toString();
	}
	
}
