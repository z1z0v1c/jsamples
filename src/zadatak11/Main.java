
package zadatak11;

import java.util.ArrayList;

/**
 * Napisati program koji opisuje sledeci scenario:
 * 
 * Firma posedujeniz privatnih bolnica. Svaka bolnica ima svoje zaposlene. Zaposleni mogu biti:
 * 		- Lekari
 * 		- Osoblje
 * 		- Medicinske sestre
 * Bolnica sadrzi informacije o nazivu, direktoru i broju zaposlenih. Podaci koji se cuvaju o lekaru su :
 * 		- Fakultet
 * 		- Ime
 * 		- Prezime
 * 		- Adresa
 * 		- Telefon
 * 		- Datum rodjenja
 * O osobllju cuvamo iste stvari, osim informacije o fakultetu. Za medicinske sestre jos i smenu. Firma
 * sadrzi metodu toString() koja ispisuje koliko poseduje bolnica i lekara, medicinskih sestara i osoblja
 * ponaosob.
 * 
 * @author Aleksandar.Zizovic
 *
 */
public class Main {

	public static void main(String[] args) {

		OstaloOsoblje zaposleni = new OstaloOsoblje("Petar", "Petrovic", "Zahumska 6", "011222333", "1.5.1968");
		MedicinskaSestra sestra = new MedicinskaSestra("Ivana", "Ivanovic", "Igmanska 12", "011333444", "7.3.1983", 1);
		Lekar lekar = new Lekar("Dejan", "Jovanovic", "Dimitrija Tucovica 56", "011000111", "28.10.1971", "Medicinski fakultet");
		
		ArrayList<Lekar> listaLekara = new ArrayList<>();
		listaLekara.add(lekar);
		
		ArrayList<MedicinskaSestra> listaSestara = new ArrayList<>();
		listaSestara.add(sestra);
		listaSestara.add(sestra);
		
		ArrayList<OstaloOsoblje> listaOsoblja = new ArrayList<>();
		listaOsoblja.add(zaposleni);
		listaOsoblja.add(zaposleni);
		listaOsoblja.add(zaposleni);
	
		Bolnica bolnica = new Bolnica();
		bolnica.setNaziv("Bolnica Zvezdara");
		bolnica.setDirektor(lekar);
		bolnica.setListaLekara(listaLekara);
		bolnica.setListaSestara(listaSestara);
		bolnica.setListaOsoblja(listaOsoblja);
		
		ArrayList<Bolnica> listaBolnica = new ArrayList<>();
		listaBolnica.add(bolnica);
		listaBolnica.add(bolnica);
		listaBolnica.add(bolnica);
		
		
		Firma firma = new Firma(listaBolnica);
		
		System.out.println(firma.toString());
		
		
	}

}
