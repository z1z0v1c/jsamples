/**
 * Napistai program za pogadjanje slucajnog generisanog broja u opsegu od 1 do 50.
 * 
 * Program treba da radi na sledeci nacin: Korisnik preko standardnog ulaza unosi jedan ceo broj.Broj koji
 * treba pogoditi treba generisati u opsegu od 1 do 50 koristeci klasu Random. Posle toga ispisati taj 
 * trazeni broj na standardni izlaz i u zavisnosti od rezultata pogadjanja ispisati odogvarajucu poruku. 
 * Ako je pogodjen tacan broj napisati: Neverovatno pogodili ste tacan broj, ako je razlika izmedju brojeva
 * 5 ili manja : Dobar pokusaj, bili ste jako blizu, i ako je razlika veca od 5 : Vise srece sledeci put.
 */

package zadatak1;

/**
 * @author Radovan.Olujic
 *
 */

import java.util.Random;
import java.util.Scanner;

public class PogodiBroj {

	private static Scanner sc = new Scanner(System.in);
	private static final String UNOS = "Unesite broj od 1 do 50: ";
	private static final String POGRESAN_UNOS = "Pogresan unos! Pokusajte ponovo!";
	private static final String POGRESAN_UNOS_BR = "Uneta vrednost nije broj! Pokusajte ponovo!";
	private static final String POGODAK = "Neverovatno!Pogodili ste tacan broj! Odigrajte Loto!!!";
	private static final String BLIZU = "Dobar pokusaj, bili ste jako blizu!";
	private static final String PROMASAJ = "Vise srece sledeci put...";
	private static final String NASTAVAK = "Da li zelite da nastavite?";
	private static final String KRAJ = "Kraj programa!";
	
	public static void main(String[] args) {

		while (true) {

			int unetiBroj;
			
			//unos i validacija broja
			do {
				System.out.println(UNOS);
				while (!sc.hasNextInt()) {
					System.out.println(POGRESAN_UNOS_BR);
					sc.next();
				}
				unetiBroj = sc.nextInt();

			} while ( 0 >= unetiBroj || 50 < unetiBroj);

			//generisanje i prikaz random broja
			Random r = new Random();
			int randomBroj = r.nextInt(50) + 1;
			System.out.println(new StringBuilder("Zadati broj je: ").append(randomBroj).toString());

			//provera pogotka
			if (randomBroj == unetiBroj) {
				System.out.println(POGODAK);
			} else if (5 >= Math.abs(unetiBroj - randomBroj)) {
				System.out.println(BLIZU);
			} else {
				System.out.println(PROMASAJ);
			}
			
			//nastavak ili izlaz iz programa
			System.out.println(NASTAVAK);
			if (!nastavak().equalsIgnoreCase("da")) {
				System.out.println(KRAJ);
				break;
			}
		}
		sc.close();
	}
	
	//validacija odgovora za nastavak ili izlaz iz programa
	private static String nastavak() {
		String s = sc.next();
		while (!(s.equalsIgnoreCase("da") || s.equalsIgnoreCase("ne"))) {
			System.out.println(POGRESAN_UNOS);
			 s = sc.next();
		}
		return s;	 		
	}
}
