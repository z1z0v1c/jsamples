/**
 * 
 */
package zadatak10;

/**
 * @author Aleksandar.Zizovic
 *
 */
public class Kafa extends Proizvod {
	
	private boolean samlevena;

	public Kafa() {
		super();
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
		return this.getCenaProizvoda() * 1.08;
	}

	@Override
	public String toString() {
		return new StringBuilder(super.toString()).append(", samlevena: ").append(samlevena).append(". UKUPNA CENA PROIZVODA: ").append(getUkupnaCenaProizvoda()).toString();
	}
	
	

}
