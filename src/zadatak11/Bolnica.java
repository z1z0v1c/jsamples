
package zadatak11;

import java.util.ArrayList;

/**
 * @author Aleksandar.Zizovic
 *
 */

public class Bolnica {

	private String naziv;
	private Zaposleni direktor;
	private ArrayList<OstaloOsoblje> listaOsoblja;
	private ArrayList<Lekar> listaLekara;
	private ArrayList<MedicinskaSestra> listaSestara;
	
	public Bolnica() {
	}

	public Bolnica(String naziv, Zaposleni direktor, ArrayList<OstaloOsoblje> listaOsoblja,
			ArrayList<Lekar> listaLekara, ArrayList<MedicinskaSestra> listaSestara) {
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

	public ArrayList<OstaloOsoblje> getListaOsoblja() {
		return listaOsoblja;
	}

	public void setListaOsoblja(ArrayList<OstaloOsoblje> listaOsoblja) {
		this.listaOsoblja = listaOsoblja;
	}

	public ArrayList<Lekar> getListaLekara() {
		return listaLekara;
	}

	public void setListaLekara(ArrayList<Lekar> listaLekara) {
		this.listaLekara = listaLekara;
	}

	public ArrayList<MedicinskaSestra> getListaSestara() {
		return listaSestara;
	}

	public void setListaSestara(ArrayList<MedicinskaSestra> listaSestara) {
		this.listaSestara = listaSestara;
	}	
}
