
package zadatak7;

/**
 * Za uneti niz celih brojeva duzine n (koja se takodje unosi), sortirati niz, ispitati da li sadrzi broj x
 * i ispisati prvih 5 clanova niza na standardni izla. Koristiti klasu Arrays.
 * 
 * @author Aleksandar.Zizovic
 */

import java.util.Scanner;
import java.util.Arrays;

public class Niz {

	private static Scanner sc = new Scanner(System.in);
	private static int[] niz;
	private static final String DUZINA_NIZA = "Unesite duzinu niza (najmenje 5): ";
	private static final String POGRESAN_UNOS = "Pogresan unos! Pokusajte ponovo!";
	private static final String POGRESAN_UNOS_DUZINA = "Pogresan unos! Najmanja duzina niza je 5! Pokusajte ponovo! ";
	private static final String TRAZENI_BROJ = "Unesite broj za pretragu: ";
	private static final String PRVIH_PET = "Prvih 5 clanova sortiranog niza su: ";
	private static final String SADRZI = "\nNIZ SADRZI TRAZENI BROJ\n";
	private static final String NE_SADRZI = "\nNIZ NE SADRZI TRAZENI BROJ\n";

	public static void main(String[] args) {

		niz = unosNiza();

		sortiraj(niz);

		brojUNizu(niz);

		ispisi(niz);

		sc.close();
	}

	// validacija unosa broja
	private static int unosBroja() {
		while (!sc.hasNextInt()) {
			System.out.println(POGRESAN_UNOS);
			sc.next();
		}
		return sc.nextInt();
	}

	//unos duzine i clanova niza
	private static int[] unosNiza() {
		System.out.println(DUZINA_NIZA);
		int duzinaNiza = 0;

		do {
			duzinaNiza = unosBroja();
			if (duzinaNiza < 5)
				System.out.println(POGRESAN_UNOS_DUZINA);
		} while (duzinaNiza < 5);
		int[] niz = new int[duzinaNiza];

		for (int i = 0; i < duzinaNiza; i++) {
			System.out.println(new StringBuilder("Unesite ").append(i + 1).append(". clan niza: "));
			niz[i] = unosBroja();
		}
		return niz;
	}

	//sortiranje niza
	private static void sortiraj(int[] niz) {
		Arrays.sort(niz);
	}

	//pretraga zadatog broja u nizu
	private static void brojUNizu(int[] niz) {
		System.out.println(TRAZENI_BROJ);
		int trazeniBroj = unosBroja();
		boolean nadjen = false;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] == trazeniBroj) {
				nadjen = true;
				break;
			}
		}

		if (nadjen)
			System.out.println(SADRZI);
		else
			System.out.println(NE_SADRZI);
	}

	//ispisivanje prvih 5 clanova niza
	private static void ispisi(int[] niz) {
		System.out.println(PRVIH_PET);
		for (int i = 0; i < 5; i++) {
			System.out.print(niz[i] + " ");
		}
	}
}
