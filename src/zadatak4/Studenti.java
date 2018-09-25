
package zadatak4;

import java.util.Scanner;

/** 
 * Koriscenjem for petlje pronaci i ispisati ime studenta sa najvecim brojem poena na testu. Prvo se unosi
 * broj studenata n, posle se n puta obilazi for petlja i unose ime i broj poena studenta. Zapamti onog sa
 * najvecim brojem poena.
 *
 * @author Aleksandar.Zizovic
 *
 */

public class Studenti {

	private static Scanner ulaz = new Scanner(System.in);
	private static String imeStudenta;
	private static final String BR_STUDENATA = "Unesite broj studenata:";
	private static final String MAX_BR_POENA = "Student sa najvecim brojem poena: ";
	private static final String BR_POENA = "Broj poena koji je student ostvario: ";
	private static final String POGRESAN_UNOS = "Pogresan unos! Pokusajte ponovo!";
	private static final String POGRESAN_UNOS_IME = "Ime mora da ima vise od jednog karaktera i ne sme da sadrzi brojeve! Pokusajte ponovo!";
	private static final String POGRESAN_UNOS_BR_POENA = "Broj poena mora da bude pozitivan! Pokusajte ponovo!";
	private static final String POGRESAN_UNOS_BR_STUDENATA = "Broj studenata mora da bude veci od 0! Pokusajte ponovo!";
	private static final String REGEX = "^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$";
	private static final String NASTAVAK = "Da li zelite da nastavite?";
	private static final String KRAJ = "Kraj programa";
	
	public static void main(String[] args) {

		while (true) {
			System.out.println(BR_STUDENATA);
			int brojStudenata = unosBrojaStudenata();
			int maxPoeni = 0;
			for (int i = 1; i <= brojStudenata; i++) {
				System.out.println(new StringBuilder("Unesite ime ").append(i).append(". studenta: "));
				String ime = unosImena();
				System.out.println(new StringBuilder("Unesite broj poena ").append(i).append(". studenta: "));
				int pomocnaVrednost = unosBrojaPoena();
				if (pomocnaVrednost > maxPoeni) {
					maxPoeni = pomocnaVrednost;
					imeStudenta = ime;
				}
			}

			System.out.println(new StringBuilder(MAX_BR_POENA).append(imeStudenta));
			System.out.println(new StringBuilder(BR_POENA).append(maxPoeni));

			System.out.println(NASTAVAK);
			if (!unosKraj().equalsIgnoreCase("da")) {
				System.out.println(KRAJ);
				break;
			}
		}
		ulaz.close();
	}
	
	//provera da li je unet broj
	private static int unosBroja() {
		while (!ulaz.hasNextInt()) {
			System.out.println(POGRESAN_UNOS);
			ulaz.next();
		}
		return ulaz.nextInt();
	}

	// validacija unetog broja studenata
	private static int unosBrojaStudenata() {
		int broj = unosBroja();
		while(broj <= 0) {
			System.out.println(POGRESAN_UNOS_BR_STUDENATA);
			broj = unosBroja();
		} 
			return broj;
	}
	
	//validacija unetog broja studenata
	private static int unosBrojaPoena() {
		int broj = unosBroja();
		while(broj < 0) {
			System.out.println(POGRESAN_UNOS_BR_POENA);
			broj = unosBroja();
		} 
			return broj;
	}
	
	// validacija unetiog imena i prezimena
	private static String unosImena() {
		String ime = "";
		while (!ime.matches(REGEX)) {
			if (!ime.equals("")) {
				System.out.println(POGRESAN_UNOS_IME);
			}
			ime = ulaz.nextLine();
		}
		return ime;
	}

	// validacija odgovora za izlaz iz programa
	private static String unosKraj() {
		String odgovor = ulaz.next();
		while (!(odgovor.equalsIgnoreCase("da") || odgovor.equalsIgnoreCase("ne"))) {
			System.out.println(POGRESAN_UNOS);
			odgovor = ulaz.next();
		}
		return odgovor;
	}
}
