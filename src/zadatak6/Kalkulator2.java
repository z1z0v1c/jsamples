
package zadatak6;

/**
 * Modifikacija digitrona od prosle nedelje. Sve operacije smestiti u posebne metode, i kada jeto potrebno
 * pozvati odgovarajucu metodu. Vrteti se u petlji, sve dok se za kod operacije ne unese nepostojeci kod
 * (default kod switch-a).
 * 
 * @author Aleksandar.Zizovic
 * 
 */

import java.util.Scanner;

public class Kalkulator2 {

	private static Scanner sc = new Scanner(System.in);
	private static boolean nastavi = true;
	private static final String UNOS = "Unesite %s broj: ";
	private static final String UNOS_OPERACIJE = "Unesite zeljenu operaciju (s, o, m, d): ";
	private static final String REZULTAT = "%s unetih brojeva je: %f";
	private static final String POGRESAN_UNOS = "Uneta vrednost nije broj! Pokusajte ponovo!";
	private static final String POGRESAN_UNOS_NULA = "Nije moguce deliti sa nulom!";
	private static final String KRAJ = "Kraj programa!";

	public static void main(String[] args) {

		while (nastavi) {

			System.out.println(String.format(UNOS,"prvi"));
			double broj1 = unosBroja();

			System.out.println(String.format(UNOS,"drugi"));
			double broj2 = unosBroja();

			// odabir operacije
			System.out.println(UNOS_OPERACIJE);
			String operacija = sc.next();

			// prikazivanje rezultata za izabranu operaciju
			switch (operacija) {
			case "s":
				System.out.println(String.format(REZULTAT, "Zbir", saberi(broj1,broj2)));
				break;
			case "o":
				System.out.println(String.format(REZULTAT, "Razlika" , oduzmi(broj1, broj2)));
				break;
			case "m":
				System.out.println(String.format(REZULTAT, "Proizvod" , pomnozi(broj1, broj2)));
				break;
			case "d":
				if (broj2 == 0.0) {
					System.out.println(POGRESAN_UNOS_NULA);
					break;
				} else {
					System.out.println(String.format(REZULTAT, "Kolicnik", podeli(broj1, broj2)));
					break;
				}
			default:
				System.out.println(KRAJ);
				nastavi = false;
			}
		}
		sc.close();
	}

	// metoda za proveru unosa broja
	private static double unosBroja() {
		while (!sc.hasNextDouble()) {
			System.out.println(POGRESAN_UNOS);
			sc.next();
		}
		return sc.nextDouble();
	}

	private static double saberi(double a, double b) {
		return a + b;
	}

	private static double oduzmi(double a, double b) {
		return a - b;
	}

	private static double pomnozi(double a, double b) {
		return a * b;
	}

	private static double podeli(double a, double b) {
		return a / b;
	}
}
