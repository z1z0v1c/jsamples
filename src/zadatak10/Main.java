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
 */
package zadatak10;

/**
 * @author Aleksandar.Zizovic
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Proizvod mlecniProizvod = new MlecniProizvod("Kisela pavlaka", 50, "20.2.2019.", "kravlje mleko");
		Proizvod kafa = new Kafa("Nes kafa", 300, "5.8.2019.", true) ;
		Proizvod sok = new Sok("Next", 130, "17.5.2019.", "pomorandza");
		Proizvod meso = new Meso("Belo meso", 400, "12.12.2018", "pilece meso");
		
		System.out.println(mlecniProizvod.toString());
		System.out.println(kafa.toString());
		System.out.println(sok.toString());
		System.out.println(meso.toString());
	}

}
