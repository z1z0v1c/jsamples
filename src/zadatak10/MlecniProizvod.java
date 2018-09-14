
package zadatak10;

/**
 * @author Aleksandar.Zizovic
 *
 */

public class MlecniProizvod extends Proizvod {

	private String porekloMleka;
	private static final double PDV = 1.2;

	public MlecniProizvod() {
	}

	public MlecniProizvod(String imeProizvoda, double cenaProizvoda, String rokTrajanja, String porekloMleka) {
		super(imeProizvoda, cenaProizvoda, rokTrajanja);
		this.porekloMleka = porekloMleka;
	}

	public String getPorekloMleka() {
		return porekloMleka;
	}

	public void setPorekloMleka(String porekloMleka) {
		this.porekloMleka = porekloMleka;
	}
	
	@Override
	public double getUkupnaCenaProizvoda() {
		return this.getCenaProizvoda() * PDV;
	}

	@Override
	public String toString() {
		return new StringBuilder(super.toString()).append(", poreklo mleka: ").append(porekloMleka).append(". UKUPNA CENA PROIZVODA: ").append(getUkupnaCenaProizvoda()).toString();
	}	
}
