
package zadatak13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/** 
* Napisati isti program kao u Zadatku 2 koji vraca drugaciji rezultat: ime studenta i poeni na testu se 
* nalaze u nekom fajlu "poeni.txt". Zadatak je ispisati na standardni izlaz spisak studenata (ime, poeni i
* ocena) sortiran po poenima. 
* 
* @author Aleksandar.Zizovic
*
*/
public class Main {
	
	private static Scanner ulaz;

	public static void main(String[] args) {

		File fajl = new File("poeni.txt");
		ArrayList<Student> studenti = new ArrayList<>();
		
		//citanje iz fajla
		try {
			ulaz = new Scanner(fajl);
			while(ulaz.hasNext()) {
				Student student = new Student();
				student.setIme(ulaz.next());
				student.setPrezime(ulaz.next());
				student.setBrojPoena(ulaz.nextInt());
				studenti.add(student);
			}			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Collections.sort(studenti);
		Collections.reverse(studenti);
		
		//ispisivanje studenata
		for (Student student : studenti) {
			System.out.print(student.toString());
		}
	}
}
