
package zadatak11;

import java.util.List;

/**
 * @author Aleksandar.Zizovic
 *
 */

public class Firma {

	private List<Bolnica> listaBolnica;

	Firma() {
	}

	Firma(List<Bolnica> listaBolnica) {
		this.listaBolnica = listaBolnica;
	}

	public List<Bolnica> getListaBolnica() {
		return listaBolnica;
	}

	public void setListaBolnica(List<Bolnica> listaBolnica) {
		this.listaBolnica = listaBolnica;
	}

	@Override
	public String toString() {
		int brojLekara = 0;
		int brojSestara = 0;
		int brojOsoblja = 0;
		
		for(Bolnica b : listaBolnica) {
			brojLekara += b.getListaLekara().size();
			brojSestara += b.getListaSestara().size();
			brojOsoblja += b.getListaOsoblja().size();
		}
		
		return new StringBuilder("Broj bolnica: ").append(listaBolnica.size()).append("\nBroj lekara: ").append(brojLekara).append("\nBroj medicinskih sestara: ").append(brojSestara).append("\nBroj ostalog osoblja: ").append(brojOsoblja).toString();
	}
}
