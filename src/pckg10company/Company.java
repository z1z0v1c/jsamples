package pckg10company;

import java.util.List;

/**
 * @author Aleksandar Zizovic
 */
public class Company {
    private static final String LIST_OF_PRODUCTS = "List of products:\n\t";

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
            System.out.print("\nPurchased - ");

            this.listOfProducts.clear();
            this.capital -= totalListPrice;
        } else {
            System.out.print("\nNot enough funds - ");
        }

        System.out.print(LIST_OF_PRODUCTS);

        for (Product product : listOfProducts) {
            System.out.print(product);
        }
    }
}
