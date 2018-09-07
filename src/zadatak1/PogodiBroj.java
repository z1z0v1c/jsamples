package zadatak1;

import java.util.Random;
import java.util.Scanner;

public class PogodiBroj {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {

			int unetiBroj;
			do {
				// unos broja i validacija
				System.out.println("Unesite broj od 1 do 50: ");
				while (!sc.hasNextInt()) {
					System.out.println("Uneta vrednost nije broj! Pokusajte ponovo!");
					sc.next();
				}
				unetiBroj = sc.nextInt();

			} while (unetiBroj <= 0 || unetiBroj > 50);

			// generisanje random broja
			Random r = new Random();
			int randomBroj = r.nextInt(50) + 1;
			System.out.println("Zadati broj je: " + randomBroj);

			// prikaz rezultata
			if (randomBroj == unetiBroj) {
				System.out.println("Neverovatno!Pogodili ste tacan broj! Odigrajte Loto!!!");
			} else if (5 >= Math.abs(unetiBroj - randomBroj)) {
				System.out.println("Dobar pokusaj, bili ste jako blizu!");
			} else {
				System.out.println("Vise srece sledeci put...");
			}

			// izlaz iz programa
			System.out.println("Da li zelite da nastavite?");
			if (unosString().equalsIgnoreCase("da")) {
				continue;
			} else
				break;
		}
		sc.close();
	}

	// metoda za validaciju odgovora pri izlasku iz programa
	private static String unosString() {
		String s = sc.next();
		while (!(s.equalsIgnoreCase("da") || s.equalsIgnoreCase("ne"))) {
			System.out.println("Pogresan unos! Pokusajte ponovo!");
			s = sc.next();
		}
		return s;
	}
}
