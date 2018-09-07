package zadatak3;
import java.util.Scanner;

public class ParniBrojevi {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {		

		while (true) {
			System.out.println("Unesite donju granicu: ");
			int donjaGranica = unos();
			System.out.println("Unesite gornju granicu: ");
			int gornjaGranica = unos();
			System.out.println("Parni brojevi izmedju unetih granica su:");

			if (donjaGranica > gornjaGranica) {
				int pom = gornjaGranica;
				gornjaGranica = donjaGranica;
				donjaGranica = pom;
			}
			while (donjaGranica <= gornjaGranica) {
				if (donjaGranica % 2 == 0)
					System.out.print(donjaGranica + " ");
				donjaGranica++;
			}
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

	private static int unos() {
		while (!sc.hasNextInt()) {
			System.out.println("Pogresan unos! Pokusajte ponovo!");
			sc.next();
		}
		return sc.nextInt(); 
	}
	
	private static String nastavak() {
		String s = sc.next();
		while (!(s.equalsIgnoreCase("da") || s.equalsIgnoreCase("ne"))) {
			System.out.println("Pogresan unos! Pokusajte ponovo!");
			 s = sc.next();
		}
		return s;	 		
	}

}
