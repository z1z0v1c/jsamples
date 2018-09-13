
package zadatak11;

/**
 * @author Aleksandar.Zizovic
 *
 */
public class MedicinskaSestra extends Zaposleni{

	private int smena;

	public MedicinskaSestra() {
		super();
	}

	public MedicinskaSestra(String ime, String prezime, String adresa, String telefon, String datumRodjenja, int smena) {
		super(ime, prezime, adresa, telefon, datumRodjenja);
		this.smena = smena;
	}

	public int getSmena() {
		return smena;
	}

	public void setSmena(int smena) {
		this.smena = smena;
	}
	
	
	
}
