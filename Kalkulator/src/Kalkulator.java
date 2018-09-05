import java.util.Scanner;

public class Kalkulator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("Unesite prvi broj: ");
			int broj1 = unosInt();

			System.out.println("Unesite drugi broj: ");
			int broj2 = unosInt();

			System.out.println("Unesite zeljenu operaciju (s, o, m, d): ");
			String operacija = unosString();

			switch (operacija) {
			case "s":
				System.out.println("Zbir unetih brojeva je: " + (broj1 + broj2));
				break;
			case "o":
				System.out.println("Razlika unetih brojeva je: " + (broj1 - broj2));
				break;
			case "m":
				System.out.println("Proizvod unetih brojeva je: " + (broj1 * broj2));
				break;
			case "d":
				if (broj2 == 0) {
					System.out.println("Nije moguce deliti sa nulom!");
					break;
				} else {
					System.out.println("Kolicnik unetih brojeva je: " + (broj1 / broj2));
					break;
				}
			default:
				System.out.println("Izabrali ste nepostojecu operaciju");
			}
			System.out.println("Da li zelite da nastavite?");
			if (sc.next().equalsIgnoreCase("ne")) {
				break;
			}

		}
		sc.close();
	}

	// provera da li je unet int

	private static int unosInt() {
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.println("Pogresan unos! Pokusajte ponovo!");
			sc.next();
		}
		int i = sc.nextInt();
		sc.close();
		return i;
		
	}

	// provera da li je unet String koji sadrzi neku od osmd vrednosti
	// mada nisam morao zbog default case - a u switchu
	private static String unosString() {
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNext("[somd]")) {
			System.out.println("Pogresan unos! Pokusajte ponovo!");
			sc.next();
		}
		String s = sc.next();
		sc.close();
		return s;		
	}
}
