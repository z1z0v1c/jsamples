import java.util.Random;
import java.util.Scanner;

public class PogodiBroj {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			
			int unetiBroj;
			do {
				System.out.println("Unesite broj od 1 do 50: ");
			    while (!sc.hasNextInt()) {			    	
			        System.out.println("Uneta vrednost nije broj! Pokusajte ponovo!");
			        sc.next(); 			    			    	
			    }
			    unetiBroj = sc.nextInt();
			    
			} while (unetiBroj <= 0 || unetiBroj > 50 || isEmpty(unetiBroj));
						
			Random r = new Random();
			int randomBroj = r.nextInt(50) + 1;
			System.out.println("Zadati broj je: " + randomBroj);

			if (randomBroj == unetiBroj) {
				System.out.println("Neverovatno!Pogodili ste tacan broj! Odigrajte Loto!!!");
			} else if ((randomBroj - 5) <= unetiBroj) {
				System.out.println("Dobar pokusaj, bili ste jako blizu!");
			} else {
				System.out.println("Vise srece sledeci put...");
			}
			System.out.println("Da li zelite da nastavite?");
			if (sc.next().equalsIgnoreCase("ne")) {
				break;
				
			}						
		}
		sc.close();
	}
	
	public static boolean isEmpty(Integer i) {
		String s = i.toString();
		return s.equals(null) || s.trim().length() == 0;
	}
}
