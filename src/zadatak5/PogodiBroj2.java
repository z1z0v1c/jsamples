package zadatak5;


import java.util.Random;
import java.util.Scanner;

public class PogodiBroj2 {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		while (true) {
			int unetiBroj = unosBroja();
			int provera = proveraPogotka(unetiBroj);
			if (provera == 2)
				continue;
			
			//izlaz iz programa
			System.out.println("Da li zelite da nastavite?");
			if (izlazValidacija().equalsIgnoreCase("da")) {
				continue;				
			}
			else 
				break;
		}
		sc.close();
	}

	
	private static int proveraPogotka(int unetiBroj) {
		
		//generisanje i prikaz random broja random broja
		Random random = new Random();
		int randomBroj = random.nextInt(50) + 1;
		System.out.println("Zadati broj je: " + randomBroj);

		//provera, prikaz i vracanje rezultata
		if (randomBroj == unetiBroj) {
			System.out.println("Neverovatno!Pogodili ste tacan broj! Odigrajte Loto!!!");
			return 0;
		} else if (5 >= Math.abs(unetiBroj - randomBroj)) {
			System.out.println("Dobar pokusaj, bili ste jako blizu!");
			return 1;
		} else {
			System.out.println("Vise srece sledeci put...");
			return 2;
		}
	}

	//validacija unosa
	private static int unosBroja() {
		int unetiBroj;
		do {
			System.out.println("Unesite broj od 1 do 50: ");
			while (!sc.hasNextInt()) {
				System.out.println("Uneta vrednost nije broj! Pokusajte ponovo!");
				sc.next();
			}
			unetiBroj = sc.nextInt();
		} while (unetiBroj <= 0 || unetiBroj > 50);
		return unetiBroj;
	}
	
	//validacija odgovora pri izlazu iz programa
	private static String izlazValidacija() {
		String s = sc.next();
		while (!(s.equalsIgnoreCase("da") || s.equalsIgnoreCase("ne"))) {
			System.out.println("Pogresan unos! Pokusajte ponovo!");
			 s = sc.next();
		}
		return s;	 		
	}
}
