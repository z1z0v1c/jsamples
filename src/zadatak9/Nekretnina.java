
package zadatak9;

/**
 * @author Aleksandar.Zizovic
 *
 */

public abstract class Nekretnina {

	private String adresa;
	private int zona;
	private double kvadratura;
	private Vlasnik vlasnik;
	private static final String POGRESAN_UNOS_ZONA = "Pogresan unos! Niste uneli ispravan broj zone";
	private static final String POGRESAN_UNOS_KVADRATURA = "Pogresan unos! Niste uneli ispravnu kvadraturu";

	protected Nekretnina() {
	}

	protected Nekretnina(String adresa, int zona, double kvadratura, Vlasnik vlasnik) {
		this.adresa = adresa;
		if (zona > 0 && zona < 5)
			this.zona = zona;
		else
			throw new IllegalArgumentException(POGRESAN_UNOS_ZONA);
		;
		if (kvadratura > 0.0)
			this.kvadratura = kvadratura;
		else
			throw new IllegalArgumentException(POGRESAN_UNOS_KVADRATURA);
		;
		this.vlasnik = vlasnik;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		if (zona > 0 && zona < 5)
			this.zona = zona;
		else
			throw new IllegalArgumentException(POGRESAN_UNOS_ZONA);
		;
	}

	public double getKvadratura() {
		return kvadratura;
	}

	public void setKvadratura(double kvadratura) {
		if (kvadratura > 0.0)
			this.kvadratura = kvadratura;
		else
			throw new IllegalArgumentException(POGRESAN_UNOS_KVADRATURA);
		;
	}

	public Vlasnik getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(Vlasnik vlasnik) {
		this.vlasnik = vlasnik;
	}

	@Override
	public String toString() {
		return new StringBuilder(this.getClass().getSimpleName()).append(" - adresa: ").append(adresa)
				.append(", zona: ").append(zona).append(", kvadratura: ").append(kvadratura).append(" ")
				.append(vlasnik.toString()).toString();
	}

	public abstract double getCena();

	public double getCenaKvadrata() {
		switch (this.zona) {
		case 1:
			return 3000;
		case 2:
			return 2000;
		case 3:
			return 1000;
		default:
			return 500;
		}
	}
}
