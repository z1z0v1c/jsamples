package zadatak6;

/**
 * Modifikacija digitrona od prosle nedelje. Sve operacije smestiti u posebne metode, i kada jeto potrebno
 * pozvati odgovarajucu metodu. Vrteti se u petlji, sve dok se za kod operacije ne unese nepostojeci kod
 * (default kod switch-a).
 */

/**
 * @author Aleksandar.Zizovic
 *
 */
import java.util.Scanner;

public class Kalkulator2 {

	public static Scanner sc = new Scanner(System.in);
	public static boolean nastavi = true;

	public static void main(String[] args) {

		while (nastavi) {

			System.out.println("Unesite prvi broj: ");
			double broj1 = unosBroja();

			System.out.println("Unesite drugi broj: ");
			double broj2 = unosBroja();

			// odabir operacije
			System.out.println("Unesite zeljenu operaciju (s, o, m, d): ");
			String operacija = sc.next();

			// prikazivanje rezultata za izabranu operaciju
			switch (operacija) {
			case "s":
				System.out.println(new StringBuilder("Zbir unetih brojeva je: ").append(saberi(broj1, broj2)));
				break;
			case "o":
				System.out.println(new StringBuilder("Razlika unetih brojeva je: ").append(oduzmi(broj1, broj2)));
				break;
			case "m":
				System.out.println(new StringBuilder("Proizvod unetih brojeva je: ").append(pomnozi(broj1, broj2)));
				break;
			case "d":
				if (broj2 == 0.0) {
					System.out.println("Nije moguce deliti sa nulom!");
					break;
				} else {
					System.out.println(new StringBuilder("Kolicnik unetih brojeva je: ").append(podeli(broj1, broj2)));
					break;
				}
			default:
				System.out.println("Kraj programa");
				nastavi = false;
			}

		}
		sc.close();
	}

	// metoda za proveru unosa broja
	private static double unosBroja() {
		while (!sc.hasNextDouble()) {
			System.out.println("Pogresan unos! Pokusajte ponovo!");
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
