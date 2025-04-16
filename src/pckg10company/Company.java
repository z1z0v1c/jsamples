package pckg10company;

import java.util.List;

/**
 * @author Aleksandar Zizovic
 */
public class Company {
    private static final String LIST_OF_PRODUCTS = "LIST OF PRODUCTS: \n";

    private final List<Product> listOfProducts;
    private double capital;

    Company(double capital, List<Product> listOfProducts) {
        this.capital = capital;
        this.listOfProducts = listOfProducts;
    }

    void order() {
        double totalListPrice = 0;

        for (Product p : this.listOfProducts) {
            totalListPrice += p.getTotalProductPrice();
        }

        if (this.capital >= totalListPrice) {
            System.out.println("Purchased");

            this.listOfProducts.clear();
            this.capital -= totalListPrice;
        } else {
            System.out.println("Not enough funds");
        }

        System.out.println(LIST_OF_PRODUCTS + this.listOfProducts + "\n");
    }
}
