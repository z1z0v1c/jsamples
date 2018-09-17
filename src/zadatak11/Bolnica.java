
package zadatak11;

import java.util.List;

/**
 * @author Aleksandar.Zizovic
 *
 */

public class Bolnica {

	private String naziv;
	private Zaposleni direktor;
	private List<OstaloOsoblje> listaOsoblja;
	private List<Lekar> listaLekara;
	private List<MedicinskaSestra> listaSestara;
	
	Bolnica() {
	}

	Bolnica(String naziv, Zaposleni direktor, List<OstaloOsoblje> listaOsoblja,
			List<Lekar> listaLekara, List<MedicinskaSestra> listaSestara) {
		this.naziv = naziv;
		this.direktor = direktor;
		this.listaOsoblja = listaOsoblja;
		this.listaLekara = listaLekara;
		this.listaSestara = listaSestara;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Zaposleni getDirektor() {
		return direktor;
	}

	public void setDirektor(Zaposleni direktor) {
		this.direktor = direktor;
	}

	public List<OstaloOsoblje> getListaOsoblja() {
		return listaOsoblja;
	}

	public void setListaOsoblja(List<OstaloOsoblje> listaOsoblja) {
		this.listaOsoblja = listaOsoblja;
	}

	public List<Lekar> getListaLekara() {
		return listaLekara;
	}

	public void setListaLekara(List<Lekar> listaLekara) {
		this.listaLekara = listaLekara;
	}

	public List<MedicinskaSestra> getListaSestara() {
		return listaSestara;
	}

	public void setListaSestara(List<MedicinskaSestra> listaSestara) {
		this.listaSestara = listaSestara;
	}	
}
