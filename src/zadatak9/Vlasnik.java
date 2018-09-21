
package zadatak9;

/**
 * @author Aleksandar.Zizovic
 *
 */

public class Vlasnik {

	private String imeIPrezime;
	private String jmbg;
	private String brojLicneKarte;
	private static final String REGEX1 = "^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$";
	private static final String REGEX2 = "[0-9]+";
	private static final String POGRESNO_IME = "Pogresan unos! Niste uneli ispravno ime i prezime";
	private static final String POGRESAN_JMBG = "Pogresan unos! Niste uneli ispravno JMBG";
	private static final String POGRESAN_BR_LK = "Pogresan unos! Niste uneli ispravno broj licne karte";

	public Vlasnik() {
	}

	public Vlasnik(String imeIPrezime, String jmbg, String brojLicneKarte) throws IllegalArgumentException {
		if (imeIPrezime.matches(REGEX1))
			this.imeIPrezime = imeIPrezime;
		else
			throw new IllegalArgumentException(POGRESNO_IME);
		if (jmbg.matches(REGEX2) && jmbg.length() == 13)
			this.jmbg = jmbg;
		else
			throw new IllegalArgumentException(POGRESAN_JMBG);
		if (brojLicneKarte.matches(REGEX2) && brojLicneKarte.length() == 9)
			this.brojLicneKarte = brojLicneKarte;
		else
			throw new IllegalArgumentException(POGRESAN_BR_LK);
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		if (imeIPrezime.matches(REGEX1))
			this.imeIPrezime = imeIPrezime;
		else
			throw new IllegalArgumentException(POGRESNO_IME);
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJMBG(String jmbg) {
		if (jmbg.matches(REGEX2) && jmbg.length() == 13)
			this.jmbg = jmbg;
		else
			throw new IllegalArgumentException(POGRESAN_JMBG);
	}

	public String getBrojLicneKarte() {
		return brojLicneKarte;
	}

	public void setBrojLicneKarte(String brojLicneKarte) {
		if (brojLicneKarte.matches(REGEX2) && brojLicneKarte.length() == 9)
			this.brojLicneKarte = brojLicneKarte;
		else
			throw new IllegalArgumentException(POGRESAN_BR_LK);
	}

	@Override
	public String toString() {
		return new StringBuilder("vlasnik - [ime i prezime: ").append(imeIPrezime).append(", JMBG: ").append(jmbg)
				.append(", broj licne karte=").append(brojLicneKarte).append("]").toString();
	}
}
