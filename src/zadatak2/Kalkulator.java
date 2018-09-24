
package zadatak2;

/**
 * Napisati program koji ce predstavljati jednostavan digitron. Program treba da radi tako sto korisnik 
 * unese dva cela broja, zatim kod operacije koji zeli da izvrsi ('s' - sabiranje, 'o' - oduzimanje, 
 * 'm' - mnozenje, 'd' - deljenje). Kao rezultat se ocekuje ispisivanje rezultata te operacije nad unetim 
 * operandima.
 * 
 * @author Aleksandar.Zizovic
 *
 */

import java.util.Scanner;

public class Kalkulator {

	private static Scanner sc = new Scanner(System.in);
	private static final String UNOS = "Unesite %s broj: ";
	private static final String UNOS_OPERACIJE = "Unesite zeljenu operaciju (s, o, m, d): ";
	private static final String REZULTAT = "%s unetih brojeva je: %f";
	private static final String POGRESAN_UNOS = "Pogresan unos! Pokusajte ponovo!";
	private static final String POGRESAN_UNOS_BR = "Uneta vrednost nije broj! Pokusajte ponovo!";
	private static final String POGRESAN_UNOS_NULA = "Nije moguce deliti sa nulom!";
	private static final String POGRESAN_UNOS_OPERACIJA = "Izabrali ste nepostojecu operaciju";
	private static final String NASTAVAK = "Da li zelite da nastavite?";
	private static final String KRAJ = "Kraj programa!";
	
	public static void main(String[] args) {

		while (true) {

			System.out.println(String.format(UNOS, "prvi"));
			double broj1 = unosBroja();

			System.out.println(String.format(UNOS, "drugi"));
			double broj2 = unosBroja();

			//odabir operacije
			System.out.println(UNOS_OPERACIJE);
			String operacija = unosStringa();

			//prikazivanje rezultata za izabranu operaciju
			switch (operacija) {
			case "s":
				System.out.println(String.format(REZULTAT, "Zbir", (broj1 + broj2)));
				break;
			case "o":
				System.out.println(String.format(REZULTAT, "Razlika" , (broj1 - broj2)));
				break;
			case "m":
				System.out.println(String.format(REZULTAT, "Proizvod" , (broj1 * broj2)));
				break;
			case "d":
				if (broj2 == 0.0) {
					System.out.println(POGRESAN_UNOS_NULA);
					break;
				} else {
					System.out.println(String.format(REZULTAT, "Kolicnik", (broj1 / broj2)));
					break;
				}
			default:
				System.out.println(POGRESAN_UNOS_OPERACIJA);
			}
			
			//izlaz iz programa
			System.out.println(NASTAVAK);
			if (!nastavak().equalsIgnoreCase("da")) {
				System.out.println(KRAJ);
				break;				
			}
		}
		sc.close();
	}

	//provera unosa broja
	private static double unosBroja() {
		while (!sc.hasNextDouble()) {
			System.out.println(POGRESAN_UNOS_BR);
			sc.next();
		}
		return sc.nextDouble();		
	}

	//provera izbora operacije
	private static String unosStringa() {
		while (!sc.hasNext("[somd]")) {
			System.out.println(POGRESAN_UNOS);
			sc.next();
		}
		return sc.next();				
	}
	
	//provera odgovora pri izlasku iz programa
	private static String nastavak() {
		String s = sc.next();
		while (!(s.equalsIgnoreCase("da") || s.equalsIgnoreCase("ne"))) {
			System.out.println(POGRESAN_UNOS);
			 s = sc.next();
		}
		return s;	 		
	}
}
