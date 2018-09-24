
package zadatak5;

import java.util.Random;

/**
 * Uraditi modifikaciju domaceg iz predhodne nedelje. Vrteti se u petlji dok ne pogodimo broj, 
 * ili budemo barem blizu (razlika manja od 5). Taj deo sa proverom pogodtka izdvojiti u zasebnu
 * metodu, kojoj se kao argument prosledjuje broj koji tipujemo, a povratna vrednost metode je 
 * 0 - ako smo pogodili, 1 - ako smo bili blizu,2 - ako smo promasili. Na osnovu toga ostajemo
 * ili izlazimo iz petlje i zavrsavamo program sa odgovarajucom porukom.
 * 
 * @author Aleksandar.Zizovic
 */

import java.util.Scanner;

public class PogodiBroj2 {
	
	private static Scanner sc = new Scanner(System.in);
	private static final String UNOS = "Unesite broj od 1 do 50: ";
	private static final String ZADATI_BR = "Zadati broj je: %d.";
	private static final String POGRESAN_UNOS = "Pogresan unos! Pokusajte ponovo!";
	private static final String POGRESAN_UNOS_BR = "Uneta vrednost nije broj! Pokusajte ponovo!";
	private static final String POGODAK = "Neverovatno!Pogodili ste tacan broj! Odigrajte Loto!!!";
	private static final String BLIZU = "Dobar pokusaj, bili ste jako blizu!";
	private static final String PROMASAJ = "Vise srece sledeci put...";
	private static final String NASTAVAK = "Da li zelite da nastavite?";
	private static final String KRAJ = "Kraj programa!";

	public static void main(String[] args) {
		
		while (true) {
			int unetiBroj = unosBroja();
			int provera = proveraPogotka(unetiBroj);
			if (provera == 2)
				continue;
			
			//izlaz iz programa
			System.out.println(NASTAVAK);
			if (!izlaz().equalsIgnoreCase("da")) {
				System.out.println(KRAJ);
				break;
			}
		}
		sc.close();
	}

	private static int proveraPogotka(int unetiBroj) {		
		//generisanje i prikaz random broja
		Random random = new Random();
		int randomBroj = random.nextInt(50) + 1;
		System.out.println(String.format(ZADATI_BR, randomBroj));

		//provera, prikaz i vracanje rezultata
		if (randomBroj == unetiBroj) {
			System.out.println(POGODAK);
			return 0;
		} else if (5 >= Math.abs(unetiBroj - randomBroj)) {
			System.out.println(BLIZU);
			return 1;
		} else {
			System.out.println(PROMASAJ);
			return 2;
		}
	}

	//validacija unosa broja
	private static int unosBroja() {		
		int unetiBroj;
		do {
			System.out.println(UNOS);
			while (!sc.hasNextInt()) {
				System.out.println(POGRESAN_UNOS_BR);
				sc.next();
			}
			unetiBroj = sc.nextInt();
		} while (0 >= unetiBroj || 50 < unetiBroj);
		return unetiBroj;
	}
	
	//validacija odgovora pri izlazu iz programa
	private static String izlaz() {
		String s = sc.next();
		while (!(s.equalsIgnoreCase("da") || s.equalsIgnoreCase("ne"))) {
			System.out.println(POGRESAN_UNOS);
			 s = sc.next();
		}
		return s;	 		
	}
}
