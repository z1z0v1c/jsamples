package pkg10company;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a program that describes the following scenario:
 * The company is engaged in the resale of food products. We distinguish products by the following product categories:
   - Dairy products
   - Coffee, Juices
   - Meat
 * We store information about all products: product name, product price and expiration date.
 * With dairy products, we also keep the origin of the milk.
 * With coffee, is it whole or ground?
 * We care about juices, what the juice is made of.
 * With meat, we keep track of which animal the meat is from.
 * The VAT on the price of dairy products and juices is 20%, while the VAT on the price of meat and coffee is 8%.
 * 
 * @author Aleksandar.Zizovic
 */

public class Main {

	public static void main(String[] args) {
		
		Product dairyProduct1 = new DairyProduct("Sour cream", 50, "20.2.2019.", "cow milk");
		Product coffee1 = new Coffee("Instant coffee", 300, "5.8.2019.", true) ;
		Product juice1 = new Juice("Next", 130, "17.5.2019.", "orange");
		Product meat1 = new Меат("White meat", 400, "12.12.2018", "chicken meat");
		
		List<Product> list1 = new ArrayList<>();
		list1.add(dairyProduct1);
		list1.add(coffee1);
		list1.add(juice1);
		list1.add(meat1);
		
		Company company1 = new Company(1200, list1);
		
		Product dairyProduct2 = new DairyProduct("Sour cream", 50, "20.2.2019.", "cow milk");
		Product coffee2 = new Coffee("Instant coffee", 300, "5.8.2019.", true) ;
		Product juice2 = new Juice("Next", 130, "17.5.2019.", "orange");
		Product meat2 = new Меат("White meat", 400, "12.12.2018", "chicken meat");
		
		List<Product> list2 = new ArrayList<>();
		list1.add(dairyProduct2);
		list1.add(coffee2);
		list1.add(juice2);
		list1.add(meat2);
		
		Company company2 = new Company(700, list2);
		
		// first option - insufficient funds
		company1.order();
		
		// second option - purchase completed
		company2.order();
	}
}
