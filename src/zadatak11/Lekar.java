
package zadatak11;

/**
 * @author Aleksandar.Zizovic
 *
 */

public class Lekar extends Zaposleni{

	private String fakultet;

	Lekar() {
	}

	Lekar(String ime, String prezime, String adresa, String telefon, String datumRodjenja, String fakultet) {
		super(ime, prezime, adresa, telefon, datumRodjenja);
		this.fakultet = fakultet;
	}

	public String getFakultet() {
		return fakultet;
	}

	public void setFakultet(String fakultet) {
		this.fakultet = fakultet;
	}		
}
