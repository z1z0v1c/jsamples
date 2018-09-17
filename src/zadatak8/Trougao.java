package zadatak8;

public class Trougao extends GeometrijskaSlika{

private double stranicaA;
	
	public Trougao() {
		super();
	}

	public Trougao(double stranicaA) {
		this.stranicaA = stranicaA;
	}

	public Trougao(String boja, boolean ispunjen, double stranicaA) {
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
		return 3 *stranicaA;
	}

	@Override
	public double povrsina() {
		return (stranicaA * stranicaA * Math.sqrt(3)) / 4;
	}

	@Override
	public String toString() {
		return new StringBuilder("JEDNAKOSTRANICNI TROUGAO - stranica: ").append(stranicaA).append("; obim: ").append(obim()).append("; povrsina: ").append(povrsina()).append(".").toString();
	}
}
