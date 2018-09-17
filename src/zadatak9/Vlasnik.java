
package zadatak9;

/**
 * @author Aleksandar.Zizovic
 *
 */

public class Vlasnik {
	
	private static final String REGEX = "^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$";

	private String imeIPrezime;
	private String jmbg;
	private String brojLicneKarte;
	

	public Vlasnik() {
	}

	public Vlasnik(String imeIPrezime, String jmbg, String brojLicneKarte) {
		super();
		if (imeIPrezime.matches(REGEX))
			this.imeIPrezime = imeIPrezime;
		else
			this.imeIPrezime = "NN";
		if (jmbg.matches("[0-9]+") && jmbg.length() == 13)
			this.jmbg = jmbg;
		else
			this.jmbg = "0000000000000";
		if (brojLicneKarte.matches("[0-9]+") && brojLicneKarte.length() == 9)
			this.brojLicneKarte = brojLicneKarte;
		else
			this.brojLicneKarte = "000000000";
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		if (imeIPrezime.matches(REGEX))
			this.imeIPrezime = imeIPrezime;
		else
			this.imeIPrezime = "NN";
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJMBG(String jmbg) {
		if (jmbg.matches("[0-9]+") && jmbg.length() == 13)
			this.jmbg = jmbg;
		else
			this.jmbg = "0000000000000";
	}

	public String getBrojLicneKarte() {
		return brojLicneKarte;
	}

	public void setBrojLicneKarte(String brojLicneKarte) {
		if (brojLicneKarte.matches("[0-9]+") && brojLicneKarte.length() == 9)
			this.brojLicneKarte = brojLicneKarte;
		else
			this.brojLicneKarte = "000000000";
	}

	@Override
	public String toString() {
		return new StringBuilder("vlasnik - [ime i prezime: ").append(imeIPrezime).append(", JMBG: ").append(jmbg).append(", broj licne karte=").append(brojLicneKarte).append("]").toString();
	}
}
