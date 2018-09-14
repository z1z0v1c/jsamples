
package zadatak12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/** 
 * Napisati program koji umogucava unos imena studenta i broj poena osvojenih na testu preko
 * standardnog ulaza (sve dok se ne unese odredjen znak za prekid unosa podataka).
 * Broj poena sme da bude od 0 do 100.
 * Kao r4ezultat programa,  ocekuje se izlazni fiajl "ocene.txtx" u kome ce se nalaziti lista 
 * svih studenata sortirana po poenima, od najvise ka najmanje, i gde ce se osim imena studenta
 * i boja poena nalaziti i ocena koju je dobio na ispiti.
 * Ocena 10 akoje imao vise od 90 poena, 9 ako je imao izmedju 81 i 90... Sve do 5 ako je imao 
 * manje od 51 poena.  
 * 
 * @author Aleksandar.Zizovic
 *
 */
public class Main {

	private static Scanner ulaz = new Scanner(System.in);
	private static final String IME = "Unesite ime studenata (X za izlaz iz programa): ";
	private static final String PREZIME = "Unesite prezime studenata: ";
	private static final String BR_POENA = "Broj poena koji je student ostvario: ";
	private static final String POGRESAN_UNOS = "Pogresan unos! Pokusajte ponovo!";
	private static final String REGEX = "[a-zA-Z]+";

	public static void main(String[] args) {

		ArrayList<Student> studenti = new ArrayList<>();
		boolean nastavi = true;

		//unos studenata
		while (nastavi) {
			System.out.println(IME);
			String ime = unosImenaiPrezimena();
			if (ime.equalsIgnoreCase("x"))
				break;
			Student student = new Student();
			student.setIme(ime);
			System.out.println(PREZIME);
			student.setPrezime(unosImenaiPrezimena());
			System.out.println(BR_POENA);
			student.setBrojPoena(unosBrojaPoena());
			studenti.add(student);
		}

		Collections.sort(studenti);
		Collections.reverse(studenti);

		File fajl = new File("ocena.txt");

		//upisivanje studenata u fajl
		try {
			PrintWriter izlaz = new PrintWriter(fajl);
			for (Student s : studenti) {
				izlaz.print(s.toString());
				izlaz.println("");
			}
			izlaz.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ulaz.close();
	}
	
	private static String unosImenaiPrezimena() {
		String s = "";
		while (!s.matches(REGEX)) {
			if (!s.equals("")) {
				System.out.println(POGRESAN_UNOS);
			}
			s = ulaz.nextLine();
		}
		return s;
	}
	
	//provera da li je unet broj
		private static int unosBroja() {
			while (!ulaz.hasNextInt()) {
				System.out.println(POGRESAN_UNOS);
				ulaz.next();
			}
			return ulaz.nextInt();
		}
	
	//validacija unetog broja studenata
	private static int unosBrojaPoena() {
		int broj = unosBroja();
		while(broj < 0) {
			System.out.println(POGRESAN_UNOS);
			broj = unosBroja();
		} 
			return broj;
	}
	
	
}
