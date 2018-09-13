/**
 * 
 */
package zadatak11;

import java.util.ArrayList;

/**
 * @author Aleksandar.Zizovic
 *
 */
public class Firma {

	private ArrayList<Bolnica> listaBolnica;

	public Firma() {
		super();
	}

	public Firma(ArrayList<Bolnica> listaBolnica) {
		super();
		this.listaBolnica = listaBolnica;
	}

	public ArrayList<Bolnica> getListaBolnica() {
		return listaBolnica;
	}

	public void setListaBolnica(ArrayList<Bolnica> listaBolnica) {
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
		
		return new StringBuilder("Broj bolnica: ").append(listaBolnica.size()).append("; broj lekara: ").append(brojLekara).append("; broj medicinskih sestara: ").append(brojSestara).append("; broj ostalog osoblja: ").append(brojOsoblja).append(".").toString();
	}
	
	
	
	
}
