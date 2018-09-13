/**
 * 
 */
package zadatak12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Aleksandar.Zizovic
 *
 */
public class Main {

	private static Scanner ulaz = new Scanner(System.in);
	private static final String IME = "Unesite ime studenata (0 za izlaz iz programa): ";
	private static final String PREZIME = "Student sa najvecim brojem poena: ";
	private static final String BR_POENA = "Broj poena koji je student ostvario: ";
	private static final String POGRESAN_UNOS = "Pogresan unos! Pokusajte ponovo!";

	public static void main(String[] args) {

		ArrayList<Student> studenti = new ArrayList<>();
		boolean nastavi = true;

		while (nastavi) {
			System.out.println(IME);
			String ime = ulaz.next();
			if (ime.equals("0"))
				break;
			Student student = new Student();
			student.setIme(ime);
			System.out.println(PREZIME);
			student.setPrezime(ulaz.next());
			System.out.println(BR_POENA);
			student.setBrojPoena(ulaz.nextInt());
			studenti.add(student);
		}

		Collections.sort(studenti);

		File fajl = new File("ocena.txt");

		for (Student s : studenti) {
			try {
				PrintWriter izlaz = new PrintWriter(fajl);
				izlaz.print(s.toString());
				izlaz.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		ulaz.close();
	}
}
