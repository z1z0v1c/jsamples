/**
 * Kreirati projekat Nekretnina na sledeci nacin:
 * 		- Apstraktna klasa nekretnina koja od atributa ima
 * 		- adresu, zonu, kvadraturu i podatke o vlasniku/instancu klase Vlasnik.
 * 		- Vlasnik ima puno ime i prezime, JMBG i broj licne karte.
 * 		- Izvedene klase, Stan i Kuca imaju to String() metod gde se ispisuju sve informacije o nekretnini
 * ukljucujuci Vlasnika i cenu
 * 		- Cena se racunapo principu kvadratura X zona (I zona 3000, II zona 2000, III zona 1000, IV zona 500e)
 * 		- Kuca ima dodatno polje povrsinaOkucnice
 * 		- U cenu kuce ulazi i cena okucnice koja se racuna po principu (povrsinaOkucnice X Zona X 15%)
 * 		- Stan ima dva dodatna polja, povrsinaPodruma i povrsinaTerase
 * 		- u cenu Stana ulazi i podruma i terase ((povrsinaPodruma + povrsinaTerase) X Zona X 33%)
 * NApraviti Main klasu i u njoj kreirati instance klae Nekretnina i napraviti objekte izvedenih klasa sa
 * proizvoljnim argumentima. Ispisati String repreentaciju objekata - toString().
 */
package zadatak9;

/**
 * @author Aleksandar.Zizovic
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Vlasnik vlasnik1 = new Vlasnik("Petar Petrovic", "2110991783444", "006677676");	
		Vlasnik vlasnik2 = new Vlasnik("Ivan Ivanovic", "2110991783555", "006677434");

		Nekretnina kuca = new Kuca("Svetog Nikole 10", 2,  76.0, vlasnik1, 100.0);
		Nekretnina stan = new Stan("Cirila i Metodija 33", 3, 44.0, vlasnik2, 10.0, 7.0);
		
		System.out.println(kuca.toString());
		System.out.println(stan.toString());		
	}
}
