package zadatak8;

/*
* Kreirati projekat Geometrijske slike na sledeci nacin:
* - Apstraktna klasa Geometrijska Slika
* - Tri osnovne klase Krug, Kvadrat, Trougao
* - Izvedene klase Elipsa, Pravougaonik i Nejednakostranicni Trougao
* - Klase imaju preklopljenu metodu toString() u kojoj se ispisuju obim i povrsina
* - Svaka klasa treba da sadrzi po 3 konstruktora
* - Klasa Trougao definise jednakostranicni Trougao
* - Obim elipse se racuna aPI(9-sqrt35)/2, a povrsina abPI
* Napraviti Main klasu i u njoj kreirati instance klase Geometrijska slika i napraviti objekte svih osnovnih i 
* izvedenih klasa sa proizvoljnim argumentima. Ispisati String reprezentaciju objekta - toString()
*/

/**
 * @author Aleksandar.Zizovic
 *
 */

public class Main {

	public static void main(String[] args) {
		GeometrijskaSlika krug = new Krug("plava", true, 5.5);
		GeometrijskaSlika kvadrat = new Kvadrat("zuta", false, 4.36);
		GeometrijskaSlika trougao = new Trougao("crvena", true, 7.04);
		GeometrijskaSlika elipsa = new Elipsa("crna", false, 8.3, 5.7);
		GeometrijskaSlika pravougaonik = new Pravougaonik("zelena", true, 4.84, 9.56);
		GeometrijskaSlika nejednakostranicniTrougao = new NejednakostranicniTrougao("bela", false, 4.5, 4.0, 3.5);
		
		System.out.println(krug);
		System.out.println(kvadrat);
		System.out.println(trougao);
		System.out.println(elipsa);
		System.out.println(pravougaonik);
		System.out.println(nejednakostranicniTrougao);
	}

}
