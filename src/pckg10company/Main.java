package pckg10company;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a program that describes the following scenario:
 * <p>
 * The company is engaged in the resale of food products. We distinguish products by the following product categories:
 *      - Dairy products
 *      - Coffee, Juices
 *      - Meat
 * <p>
 * We store information about all products: product name, product price and expiration date. With dairy products, we
 * also keep the origin of the milk. With coffee, is it whole or ground? We care about juices, what the juice is made of.
 * With meat, we keep track of which animal the meat is from.
 * <p>
 * The VAT on the price of dairy products and juices is 20%, while the VAT on the price of meat and coffee is 8%.
 *
 * @author Aleksandar Zizovic
 */
public class Main {
    public static void main(String[] args) {
        Product coffee1 = new Coffee("Instant coffee", 300, "5.8.2019.", true);
        Product juice1 = new Juice("Next", 130, "17.5.2019.", "orange");
        Product meat1 = new Meat("White meat", 400, "12.12.2018", "chicken meat");
        Product dairyProduct1 =
                new DairyProduct("Sour cream", 50, "20.2.2019.", "cow milk");

        List<Product> list1 = new ArrayList<>();
        list1.add(coffee1);
        list1.add(juice1);
        list1.add(meat1);
        list1.add(dairyProduct1);

        Company company1 = new Company(1200, list1);

        Product coffee2 = new Coffee("Instant coffee", 300, "5.8.2019.", true);
        Product juice2 = new Juice("Next", 130, "17.5.2019.", "orange");
        Product meat2 = new Meat("White meat", 400, "12.12.2018", "chicken meat");
        Product dairyProduct2 =
                new DairyProduct("Sour cream", 50, "20.2.2019.", "cow milk");

        List<Product> list2 = new ArrayList<>();
        list1.add(coffee2);
        list1.add(juice2);
        list1.add(meat2);
        list1.add(dairyProduct2);

        Company company2 = new Company(700, list2);

        // First option - insufficient funds
        company1.order();

        // Second option - purchase completed
        company2.order();
    }
}
