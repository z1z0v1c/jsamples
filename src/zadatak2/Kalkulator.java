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

			//odabir operacije
			System.out.println("Unesite zeljenu operaciju (s, o, m, d): ");
			String operacija = unosStringa();

			//prikazivanje rezultata za izabranu operaciju
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
			
			//izlaz iz programa
			System.out.println("Da li zelite da nastavite?");
			if (nastavak().equalsIgnoreCase("da")) {
				continue;				
			}
			else {
				System.out.println("Kraj programa");
				break;				
			}

		}
		sc.close();
	}

	// metoda za proveru unosa broja
	private static int unosBroja() {
		while (!sc.hasNextInt()) {
			System.out.println("Pogresan unos! Pokusajte ponovo!");
			sc.next();
		}
		return sc.nextInt();		
	}

	// metoda za prveru unosa stringa
	private static String unosStringa() {
		while (!sc.hasNext("[somd]")) {
			System.out.println("Pogresan unos! Pokusajte ponovo!");
			sc.next();
		}
		return sc.next();				
	}
	
	// metoda za validaciju odgovora pri izlasku iz programa
	private static String nastavak() {
		String s = sc.next();
		while (!(s.equalsIgnoreCase("da") || s.equalsIgnoreCase("ne"))) {
			System.out.println("Pogresan unos! Pokusajte ponovo!");
			 s = sc.next();
		}
		return s;	 		
	}
}
