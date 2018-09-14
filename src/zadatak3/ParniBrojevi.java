
package zadatak3;

import java.util.Scanner;

/**
 * Uraditi modifikaciju domaceg iz predhodne nedelje. Vrteti se u petlji dok ne pogodimo broj, 
 * ili budemo barem blizu (razlika manja od 5). Taj deo sa proverom pogodtka izdvojiti u zasebnu
 * metodu, kojoj se kao argument prosledjuje broj koji tipujemo, a povratna vrednost metode je 
 * 0 - ako smo pogodili, 1 - ako smo bili blizu,2 - ako smo promasili. Na osnovu toga ostajemo
 * ili izlazimo iz petlje i zavrsavamo program sa odgovarajucom porukom.
 * 
 * @author Aleksandar.Zizovic
 */

public class ParniBrojevi {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {		

		while (true) {
			System.out.println("Unesite donju granicu: ");
			int donjaGranica = unos();
			System.out.println("Unesite gornju granicu: ");
			int gornjaGranica = unos();
			System.out.println("Parni brojevi izmedju unetih granica su:");

			//zamena vrednosti promenljivih ukoliko su pogresno unete vrednosti
			if (donjaGranica > gornjaGranica) {
				int pom = gornjaGranica;
				gornjaGranica = donjaGranica;
				donjaGranica = pom;
			}
			
			//stampanje parnih brojeva
			while (donjaGranica <= gornjaGranica) {
				if (donjaGranica % 2 == 0)
					System.out.print(donjaGranica + " ");
				donjaGranica++;
			}
			
			//izlaz iz programa
			System.out.println("");
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
	// metoda za validaciju unosa broja
	private static int unos() {
		while (!sc.hasNextInt()) {
			System.out.println("Pogresan unos! Pokusajte ponovo!");
			sc.next();
		}
		return sc.nextInt(); 
	}
	
	//metoda za validaciju odgovora pri izlasku iz programa
	private static String nastavak() {
		String s = sc.next();
		while (!(s.equalsIgnoreCase("da") || s.equalsIgnoreCase("ne"))) {
			System.out.println("Pogresan unos! Pokusajte ponovo!");
			 s = sc.next();
		}
		return s;	 		
	}
}
