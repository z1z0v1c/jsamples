import java.util.Random;
import java.util.Scanner;

public class PogodiBroj {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) { 
			int unetiBroj= unosInt();
			int provera = proveraPogotka(unetiBroj);
			if(provera == 2)
				continue;
	    	System.out.println("Da li zelite da nastavite?");
			if (sc.next().equalsIgnoreCase("ne")) {
				System.out.println("The End!!!");
				break;				
			}						
		}
		sc.close();
	}
	
	public static boolean isEmpty(Integer i) {
		String s = i.toString();
		return s.equals(null) || s.trim().length() == 0;
	}
	
	private static int proveraPogotka(int unetiBroj) {
		Random r = new Random();
		int randomBroj = r.nextInt(50) + 1;
		System.out.println("Zadati broj je: " + randomBroj);
		
		if (randomBroj == unetiBroj) {
			System.out.println("Neverovatno!Pogodili ste tacan broj! Odigrajte Loto!!!");
			return 0;
		} else if ((randomBroj - 5) <= unetiBroj) {
			System.out.println("Dobar pokusaj, bili ste jako blizu!");
			return 1;
		} else {
			System.out.println("Vise srece sledeci put...");
			return 2;
		}
	}
	
	private static int unosInt() {
		Scanner sc = new Scanner(System.in);
		int i;
		do {
			System.out.println("Unesite broj od 1 do 50: ");
		    while (!sc.hasNextInt()) {			    	
		        System.out.println("Uneta vrednost nije broj! Pokusajte ponovo!");
		        sc.next(); 			    			    	
		    }
		    i = sc.nextInt();			    
		} while (i <= 0 || i > 50 || isEmpty(i));
		return i;
	}
}
