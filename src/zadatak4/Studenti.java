
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

	static Scanner sc = new Scanner(System.in);
	static String imeStudenta;
	static final String BR_STUDENATA = "Unesite broj studenata:";
	static final String MAX_BR_POENA = "Student sa najvecim brojem poena: ";
	static final String BR_POENA = "Broj poena koji je student ostvario: ";
	static final String POGRESAN_UNOS = "Pogresan unos! Pokusajte ponovo!";
	static final String POGRESAN_UNOS_IME = "Ime mora da ima vise od jednog karaktera i ne sme da sadrzi brojeve! Pokusajte ponovo!";
	static final String POGRESAN_UNOS_BR_POENA = "Broj poena mora da bude pozitivan! Pokusajte ponovo!";
	static final String POGRESAN_UNOS_BR_STUDENATA = "Broj studenata mora da bude veci od 0! Pokusajte ponovo!";
	static final String REGEX = "^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$";
	static final String NASTAVAK = "Da li zelite da nastavite?";
	static final String KRAJ = "Kraj programa";
	
	public static void main(String[] args) {

		while (true) {
			System.out.println(BR_STUDENATA);
			int brojStudenata = unosBrojaStudenata();;
			int maxPoeni = 0;
			for (int i = 1; i <= brojStudenata; i++) {
				System.out.println(new StringBuilder("Unesite ime ").append(i).append(". studenta: "));
				String s = unosImena();
				System.out.println(new StringBuilder("Unesite broj poena ").append(i).append(". studenta: "));
				int pomocnaVrednost = unosBrojaPoena();
				if (pomocnaVrednost > maxPoeni) {
					maxPoeni = pomocnaVrednost;
					imeStudenta = s;
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
		sc.close();
	}
	
	//provera da li je unet broj
	private static int unosBroja() {
		while (!sc.hasNextInt()) {
			System.out.println(POGRESAN_UNOS);
			sc.next();
		}
		return sc.nextInt();
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
		String s = "";
		while (!s.matches(REGEX)) {
			if (!s.equals("")) {
				System.out.println(POGRESAN_UNOS_IME);
			}
			s = sc.nextLine();
		}
		return s;
	}

	// validacija odgovora za izlaz iz programa
	private static String unosKraj() {
		String s = sc.next();
		while (!(s.equalsIgnoreCase("da") || s.equalsIgnoreCase("ne"))) {
			System.out.println(POGRESAN_UNOS);
			s = sc.next();
		}
		return s;
	}
}
