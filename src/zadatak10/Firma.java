
package zadatak10;

import java.util.ArrayList;

/**
 * @author Aleksandar.Zizovic
 *
 */

public class Firma {
	
	private double kapital;
	private ArrayList<Proizvod> listaProizvoda;
	
	public Firma(double kapital, ArrayList<Proizvod> listaProizvoda) {
		this.kapital = kapital;
		this.listaProizvoda = listaProizvoda;
	}
	
	public void porudzbina() {
		int ukupnaCenaListe = 0;
		for (Proizvod p : this.listaProizvoda) {
			ukupnaCenaListe += p.getUkupnaCenaProizvoda();
		}
		if(this.kapital >= ukupnaCenaListe) {
			System.out.println("Kupljeno");
			this.listaProizvoda.clear();
			this.kapital -= ukupnaCenaListe;
			System.out.println(new StringBuilder("Lista proizvoda: ").append(this.listaProizvoda));
		}else {
			System.out.println("Nema dovoljno sredstava");
			System.out.println(new StringBuilder("Lista proizvoda: ").append(this.listaProizvoda));
		}
	}	
}
