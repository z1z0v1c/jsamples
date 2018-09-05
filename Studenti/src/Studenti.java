import java.util.Scanner;

public class Studenti {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("Unesite broj studenata:");
		int brojStudenata = unosInt();
		
		String imeStudenta = "";
		int maxPoeni = 0;
		for(int i = 1; i <= brojStudenata; i++) {
			System.out.println("Unesite ime " + i + ". studenta: ");
			String s = unosString();
			System.out.println("Unesite broj poena " + i + ". studenta: ");
			int pom = unosInt();
			if (pom > maxPoeni) {
				maxPoeni = pom;
				imeStudenta = s;
			}
		}
		
		System.out.println("Student sa najvecim brojem poena: " + imeStudenta);
		System.out.println("Broj poena koji je ostvario: " + maxPoeni);
		
		System.out.println("Da li zelite da nastavite?");
		if (sc.next().equalsIgnoreCase("ne")) {
			System.out.println("The End!!!");
			break;
		}
		}

	}
	
	private static int unosInt() {
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.println("Pogresan unos! Pokusajte ponovo!");
			sc.next();
		}
		return sc.nextInt();	
	}

	private static String unosString() {
		Scanner sc = new Scanner(System.in);
		
		/*while (!sc.hasNext()) {
			
			System.out.println("Pogresan unos! Pokusajte ponovo!");
			sc.next();
		}*/
		String s = "" ;
		while (!s.matches("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$")) {
			if (!s.equals("")) {
				System.out.println("Ime ne sme da sadrzi brojeve! Pokusajte ponovo!");
			}
			s = sc.nextLine();
			
		}
		return s;		
	}

}
