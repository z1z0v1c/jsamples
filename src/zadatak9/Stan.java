/**
 * 
 */
package zadatak9;

/**
 * @author Aleksandar.Zizovic
 *
 */
public class Stan extends Nekretnina{

	private double povrsinaPodruma;
	private double povrsinaTerase;
	
	public Stan() {
		super();
	}
	
	public Stan(String adresa, int zona, double kvadratura, Vlasnik vlasnik, double povrsinaPodruma, double povrsinaTerase) {
		super(adresa, zona, kvadratura, vlasnik);
		this.povrsinaPodruma = povrsinaPodruma;
		this.povrsinaTerase = povrsinaTerase;
	}
	
	public double getPovrsinaPodruma() {
		return povrsinaPodruma;
	}
	
	public void setPovrsinaPodruma(double povrsinaPodruma) {
		this.povrsinaPodruma = povrsinaPodruma;
	}
	
	public double getPovrsinaTerase() {
		return povrsinaTerase;
	}
	
	public void setPovrsinaTerase(double povrsinaTerase) {
		this.povrsinaTerase = povrsinaTerase;
	}

	@Override
	public double getCena() {
		return (getKvadratura() + (povrsinaPodruma + povrsinaTerase) * 0.33) * getCenaKvadrata() ;
	}

	@Override
	public String toString() {
		return new StringBuilder(super.toString()).append(", povrsina podruma: ").append(povrsinaPodruma).append(", povrsina terase: ").append(povrsinaTerase).toString();
	}
	
	
}
