
package zadatak10;

import java.util.List;

/**
 * @author Aleksandar.Zizovic
 *
 */

public class Firma {
	
	private double kapital;
	private List<Proizvod> listaProizvoda;
	
	Firma(double kapital, List<Proizvod> listaProizvoda) {
		this.kapital = kapital;
		this.listaProizvoda = listaProizvoda;
	}
	
	void porudzbina() {
		int ukupnaCenaListe = 0;
		for (Proizvod p : this.listaProizvoda) {
			ukupnaCenaListe += p.getUkupnaCenaProizvoda();
		}
		if(this.kapital >= ukupnaCenaListe) {
			System.out.println("Kupljeno");
			this.listaProizvoda.clear();
			this.kapital -= ukupnaCenaListe;
			System.out.println(new StringBuilder("LISTA PROIZVODA: \n").append(this.listaProizvoda).append("\n").toString());
		}else {
			System.out.println("Nema dovoljno sredstava");
			System.out.println(new StringBuilder("LISTA PROIZVODA: \n").append(this.listaProizvoda).append("\n").toString());
		}
	}	
}
