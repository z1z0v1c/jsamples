package zadatak4;
import java.util.Scanner;

public class Studenti {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			System.out.println("Unesite broj studenata:");
			int brojStudenata = unosBroja();

			String imeStudenta = "";
			int maxPoeni = 0;
			for (int i = 1; i <= brojStudenata; i++) {
				System.out.println("Unesite ime " + i + ". studenta: ");
				String s = unosStringa();
				System.out.println("Unesite broj poena " + i + ". studenta: ");
				int pom = unosBroja();
				if (pom > maxPoeni) {
					maxPoeni = pom;
					imeStudenta = s;
				}
			}

			System.out.println("Student sa najvecim brojem poena: " + imeStudenta);
			System.out.println("Broj poena koji je ostvario: " + maxPoeni);

			System.out.println("Da li zelite da nastavite?");
			if (unosString().equalsIgnoreCase("da")) {
				continue;				
			}
			else 
				break;
		}

	}

	//validacija unetog broja studenata
	private static int unosBroja() {
		while (!sc.hasNextInt()) {
			System.out.println("Pogresan unos! Pokusajte ponovo!");
			sc.next();
		}
		int broj = sc.nextInt();
		if (broj <= 0) {
			System.out.println("Broj studenata mora da bude veci od 0! Pokusajte ponovo!");
			return unosBroja();
		} else
			return broj;
	}

	//validacija unetiog imena i prezimena
	private static String unosStringa() {
		String s = "";
		while (!s.matches("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$")) {
			if (!s.equals("")) {
				System.out.println("Ime ne sme da sadrzi brojeve! Pokusajte ponovo!");
			}
			s = sc.nextLine();
		}
		return s;
	}
	
	//validacija odgovora za izlaz
	private static String unosString() {
		String s = sc.next();
		while (!(s.equalsIgnoreCase("da") || s.equalsIgnoreCase("ne"))) {
			System.out.println("Pogresan unos! Pokusajte ponovo!");
			 s = sc.next();
		}
		return s;	 		
	}

}
