
package zadatak10;

/**
 * @author Aleksandar.Zizovic
 *
 */
public class Kafa extends Proizvod {
	
	private boolean samlevena;
	private static final double PDV = 1.08;

	public Kafa() {
	}

	public Kafa(String imeProizvoda, double cenaProizvoda, String rokTrajanja, boolean samlevena) {
		super(imeProizvoda, cenaProizvoda, rokTrajanja);
		this.samlevena = samlevena;
	}

	public boolean isSamlevena() {
		return samlevena;
	}

	public void setSamlevena(boolean samlevena) {
		this.samlevena = samlevena;
	}

	@Override
	public double getUkupnaCenaProizvoda() {
		return this.getCenaProizvoda() * PDV;
	}

	@Override
	public String toString() {
		return new StringBuilder(super.toString()).append(", tip kafe: ").append((samlevena) ? "samlevena" : "u zrnu").append(". UKUPNA CENA PROIZVODA: ").append(getUkupnaCenaProizvoda()).toString();
	}
}
