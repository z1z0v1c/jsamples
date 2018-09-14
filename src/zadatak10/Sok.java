
package zadatak10;

/**
 * @author Aleksandar.Zizovic
 *
 */

public class Sok extends Proizvod{
	 
	private String sastav;
	private static final double PDV = 1.2;
	
	public Sok() {
	}

	public Sok(String imeProizvoda, double cenaProizvoda, String rokTrajanja, String sastav) {
		super(imeProizvoda, cenaProizvoda, rokTrajanja);
		this.sastav = sastav;
	}

	public String getSastav() {
		return sastav;
	}

	public void setSastav(String sastav) {
		this.sastav = sastav;
	}

	@Override
	public double getUkupnaCenaProizvoda() {
		return this.getCenaProizvoda() * PDV;
	}
	
	@Override
	public String toString() {
		return new StringBuilder(super.toString()).append(", sastav: ").append(sastav).append(". UKUPNA CENA PROIZVODA: ").append(getUkupnaCenaProizvoda()).toString();
	}	
}
