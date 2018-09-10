package zadatak7;

/*
 * Za uneti niz celih brojeva duzine n (koja se takodje unosi), sortirati niz, ispitati da li sadrzi broj x
 * i ispisati prvih 5 clanova niza na standardni izla. Koristiti klasu Arrays.
 */

/**
 * @author Aleksandar.Zizovic
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Niz {

	private static Scanner sc = new Scanner(System.in);
	private static int duzinaNiza;
	private static int[] niz;
	private static int trazeniBroj;
	private static boolean nadjen;

	public static void main(String[] args) {
		System.out.println("Unesite duzinu niza (najmenje 5): ");
		do {
			duzinaNiza = unosBroja();
			if (duzinaNiza < 5)
				System.out.println("Pogresan unos! Najmanja duzina niza je 5! Pokusajte ponovo! ");
		} while (duzinaNiza < 5);

		niz = new int[duzinaNiza];

		for (int i = 0; i < duzinaNiza; i++) {
			System.out.println(new StringBuilder("Unesite ").append(i + 1).append(". clan niza: "));
			niz[i] = unosBroja();
		}
		
		Arrays.sort(niz);

		System.out.println("Unesite broj za pretragu: ");
		trazeniBroj = unosBroja();

		for (int i = 0; i < duzinaNiza; i++) {
			nadjen = niz[i] == trazeniBroj;
			if (nadjen) {
				System.out.println("\nNIZ SADRZI TRAZENI BROJ\n");
				break;
			}
		}

		if (!nadjen) {
			System.out.println("\nNIZ NE SADRZI TRAZENI BROJ\n");
		}

		System.out.println("Prvih 5 clanova sortiranog niza su: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(new StringBuilder(niz[i]).append(" ").toString());
		}

	}

	// metoda za validaciju unosa broja
	private static int unosBroja() {
		while (!sc.hasNextInt()) {
			System.out.println("Pogresan unos! Pokusajte ponovo!");
			sc.next();
		}
		return sc.nextInt();
	}

}
