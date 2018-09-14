
package zadatak10;

import java.util.ArrayList;

/**
 * Napisati program koji opisuje sledeci scenario:
 * Firma se bavi preprodajom prehrambenih proizvoda. Proizvode razlikujemo po sledecim kategorijama proizvoda:
 * 		- Mlecni proizvodi
 * 		- Kafe, Sokovi
 * 		- Meso
 * O svim proizvodima cuvamo informacije: ime proizvoda, cena proizvoda i rok trajanja.
 * Kod mlecnih proizvoda cuvamo i poreklo mleka.
 * Kod kafe da li je u zrnu ili samlevena.
 * O sokovima cuvamo od cega je sok.
 * Kod mesa cuvamo od koje zivotinje je meso.
 * Kod cene mlecnih proizvoda i sokova PDV je 20%, dok je za meso i kafu PDV na cenu 8%.
 * 
 * @author Aleksandar.Zizovic
 */

public class Main {

	public static void main(String[] args) {
		
		Proizvod mlecniProizvod1 = new MlecniProizvod("Kisela pavlaka", 50, "20.2.2019.", "kravlje mleko");
		Proizvod kafa1 = new Kafa("Nes kafa", 300, "5.8.2019.", true) ;
		Proizvod sok1 = new Sok("Next", 130, "17.5.2019.", "pomorandza");
		Proizvod meso1 = new Meso("Belo meso", 400, "12.12.2018", "pilece meso");
		
		ArrayList<Proizvod> lista1 = new ArrayList<>();
		lista1.add(mlecniProizvod1);
		lista1.add(kafa1);
		lista1.add(sok1);
		lista1.add(meso1);
		
		Firma firma1 = new Firma(1200, lista1);
		
		Proizvod mlecniProizvod2 = new MlecniProizvod("Kisela pavlaka", 50, "20.2.2019.", "kravlje mleko");
		Proizvod kafa2 = new Kafa("Nes kafa", 300, "5.8.2019.", true) ;
		Proizvod sok2 = new Sok("Next", 130, "17.5.2019.", "pomorandza");
		Proizvod meso2 = new Meso("Belo meso", 400, "12.12.2018", "pilece meso");
		
		ArrayList<Proizvod> lista2 = new ArrayList<>();
		lista1.add(mlecniProizvod2);
		lista1.add(kafa2);
		lista1.add(sok2);
		lista1.add(meso2);
		
		Firma firma2 = new Firma(700, lista2);
		
		//prva opcija - nema dovoljno sredstava
		firma1.porudzbina();
		
		//druga opcija - kupovina izvrsena
		firma2.porudzbina();
	}
}
