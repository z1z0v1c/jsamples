package zadatak8;

public class NejednakostranicniTrougao extends Trougao{

	private double stranicaB;
	private double stranicaC;

	

	public NejednakostranicniTrougao() {
		super();
	}


	public NejednakostranicniTrougao(double stranicaA, double stranicaB, double stranicaC) {
		super(stranicaA);
		this.stranicaB = stranicaB;
		this.stranicaC = stranicaC;
	}
	
	public NejednakostranicniTrougao(String boja, boolean ispunjen, double stranicaA, double stranicaB, double stranicaC) {
		super(boja, ispunjen, stranicaA);
		this.stranicaB = stranicaB;
		this.stranicaC = stranicaC;
	}

	public double getStranicaB() {
		return stranicaB;
	}

	public void setStranicaB(double stranicaB) {
		this.stranicaB = stranicaB;
	}


	public double getStranicaC() {
		return stranicaC;
	}


	public void setStranicaC(double stranicaC) {
		this.stranicaC = stranicaC;
	}
	@Override
	public double obim() {
		return getStranicaA() + stranicaB + stranicaC;
	}

	@Override
	public double povrsina() {
		double p = (getStranicaA() + stranicaB + stranicaC)/2;
		return Math.sqrt(p * ( p - getStranicaA()) * (p - stranicaB) * (p - stranicaC));
	}

	@Override
	public String toString() {
		return new StringBuilder("NEJEDNAKOSTRANICNI TROUGAO - stranica a: ").append(getStranicaA()).append("; stranica b: ").append(getStranicaB()).append("; stranica C: ").append(getStranicaC()).append("; obim: ").append(obim()).append("; povrsina: ").append(povrsina()).append(".").toString();
	}


}
