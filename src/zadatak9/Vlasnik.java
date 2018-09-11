/**
 * 
 */
package zadatak9;

/**
 * @author Aleksandar.Zizovic
 *
 */
public class Vlasnik {

	private String imeIPrezime;
	private String JMBG;
	private String brojLicneKarte;

	public Vlasnik() {
		super();
	}

	public Vlasnik(String imeIPrezime, String JMBG, String brojLicneKarte) {
		super();
		if (imeIPrezime.matches("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$"))
			this.imeIPrezime = imeIPrezime;
		else
			this.imeIPrezime = "NN";
		if (JMBG.matches("[0-9]+") && JMBG.length() == 13)
			this.JMBG = JMBG;
		else
			this.JMBG = "0000000000000";
		if (brojLicneKarte.matches("[0-9]+") && JMBG.length() == 9)
			this.brojLicneKarte = brojLicneKarte;
		else
			this.brojLicneKarte = "000000000";
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		if (imeIPrezime.matches("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$"))
			this.imeIPrezime = imeIPrezime;
		else
			this.imeIPrezime = "NN";
	}

	public String getJMBG() {
		return JMBG;
	}

	public void setJMBG(String JMBG) {
		if (JMBG.matches("[0-9]+") && JMBG.length() == 13)
			this.JMBG = JMBG;
		else
			this.JMBG = "0000000000000";
	}

	public String getBrojLicneKarte() {
		return brojLicneKarte;
	}

	public void setBrojLicneKarte(String brojLicneKarte) {
		if (brojLicneKarte.matches("[0-9]+") && JMBG.length() == 9)
			this.brojLicneKarte = brojLicneKarte;
		else
			this.brojLicneKarte = "000000000";
	}

	@Override
	public String toString() {
		return new StringBuilder("vlasnik - [ime i prezime: ").append(imeIPrezime).append(", JMBG: ").append(JMBG).append(", broj licne karte=").append(brojLicneKarte).append("]").toString();
	}

}
