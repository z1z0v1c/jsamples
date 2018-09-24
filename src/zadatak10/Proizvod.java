
package zadatak10;

/**
 * @author Aleksandar.Zizovic
 *
 */

public abstract class Proizvod {

	private String imeProizvoda;
	private double cenaProizvoda;
	private String rokTrajanja;
	
	
	Proizvod() {
	}

	Proizvod(String imeProizvoda, double cenaProizvoda, String rokTrajanja) {
		super();
		this.imeProizvoda = imeProizvoda;
		this.cenaProizvoda = cenaProizvoda;
		this.rokTrajanja = rokTrajanja;
	}

	public String getImeProizvoda() {
		return imeProizvoda;
	}

	public void setImeProizvoda(String imeProizvoda) {
		this.imeProizvoda = imeProizvoda;
	}

	public double getCenaProizvoda() {
		return cenaProizvoda;
	}

	public void setCenaProizvoda(double cenaProizvoda) {
		this.cenaProizvoda = cenaProizvoda;
	}

	public String getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(String rokTrajanja) {
		this.rokTrajanja = rokTrajanja;
	}

	@Override
	public String toString() {
		return new StringBuilder("\n").append(this.getClass().getSimpleName()).append(" - ime proizvoda: ").append(imeProizvoda).append(", cena proizvoda: ").append(cenaProizvoda).append(", rok trajanja: ").append(rokTrajanja).toString();
	}
	
	public abstract double getUkupnaCenaProizvoda();
}
