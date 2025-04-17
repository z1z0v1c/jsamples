package pckg09realestate;

/**
 * Create the Real Estate project in the following way: Abstract Real Estate class that has the following attributes:
 * <p>
 * 	- Address, zone, square footage and information about to the owner/instance of the Owner class.
 *  - The owner has full name and surname, ID, and card number.
 *  - The derived classes, Apartment and House have a toString() method where all information about the property,
 *  including the Owner and the price, is printed.
 *  - The price is calculated based on the square footage of X zone (I zone 3000, II zone 2000, III zone 1000, IV zone
 *  500e).
 *  - The house has an additional area of the yard.
 *  - The price of the house includes the price of the yard, which is calculated according to the principle (yard area X
 *  Zone X 15%).
 *  - The apartment has two additional fields, the Basement area and the Terrace area.
 *  - The price of the apartment includes the price of the basement and terrace ((basement area + terrace area) X Zone X
 *  33%).
 * <p>
 * Create the Main class and in it create instances of the Property class and create objects of derived classes with
 * arbitrary arguments. Print String representation of objects - toString().
 *
 * @author Aleksandar Zizovic
 */
public class Main {
	public static void main(String[] args) {
		try {
			Owner owner1 = new Owner("Petar Petrovic", "2110991783444", "006677676");
			Owner owner2 = new Owner("Ivan Ivanovic", "2110991783555", "006677434");

			RealEstate house = new House(owner1, "Svetog Nikole 10", 2, 76.0, 100.0);
			RealEstate apartment = new Apartment(owner2, "Cirila i Metodija 33", 3, 44.0, 10.0, 7.0);

			System.out.println(house);
			System.out.println(apartment);
		} catch (IllegalArgumentException exception) {
			exception.printStackTrace();
		}
	}
}
