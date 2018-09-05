import java.util.Scanner;

public class ParniBrojevi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		while(true) {
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
		while(donjaGranica <= gornjaGranica) {
			if(donjaGranica % 2 == 0)				
				System.out.print(donjaGranica + " ");
			donjaGranica++;
		}
		System.out.println("");
		System.out.println("Da li zelite da nastavite?");
		if (sc.next().equalsIgnoreCase("ne")) {
			System.out.println("The End!!!");
			break;
			
		}
		}

	}
	private static int unos() {
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.println("Pogresan unos! Pokusajte ponovo!");
			sc.next();
		}
		int i = sc.nextInt();
		return i;
		
	}

}
