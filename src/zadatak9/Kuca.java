
package zadatak9;

/**
 * @author Aleksandar.Zizovic
 *
 */

public class Kuca extends Nekretnina {

	private double povrsinaOkucnice;

	public Kuca() {
	}

	public Kuca(String adresa, int zona, double kvadratura, Vlasnik vlasnik, double povrsinaOkucnice) {
		super(adresa, zona, kvadratura, vlasnik);
		this.povrsinaOkucnice = povrsinaOkucnice;		
	}

	public double getPovrsinaOkucnice() {
		return povrsinaOkucnice;
	}

	public void setPovrsinaOkucnice(double povrsinaOkucnice) {
		this.povrsinaOkucnice = povrsinaOkucnice;
	}

	@Override
	public double getCena() {
		return (getKvadratura() + povrsinaOkucnice * 0.15) * this.getCenaKvadrata();
	}
	
	@Override
	public String toString() {
		return new StringBuilder(super.toString()).append(", povrsina okucnice: ").append(povrsinaOkucnice).toString();
	}	
}
