package zadatak2;

 import java.util.Scanner;

public class Kalkulator {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		while (true) {

			System.out.println("Unesite prvi broj: ");
			int broj1 = unosBroja();

			System.out.println("Unesite drugi broj: ");
			int broj2 = unosBroja();

			System.out.println("Unesite zeljenu operaciju (s, o, m, d): ");
			String operacija = unosStringa();

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
	private static int unosBroja() {
		while (!sc.hasNextInt()) {
			System.out.println("Pogresan unos! Pokusajte ponovo!");
			sc.next();
		}
		return sc.nextInt();		
	}

	// provera da li je unet String koji sadrzi neku od osmd vrednosti
	// mada nisam morao zbog default case - a u switchu
	private static String unosStringa() {
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNext("[somd]")) {
			System.out.println("Pogresan unos! Pokusajte ponovo!");
			sc.next();
		}
		return sc.next();
				
	}
}
