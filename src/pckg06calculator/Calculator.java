package pckg06calculator;

import java.util.Scanner;

/**
 * Modification of the previous calculator.
 * Place all operations in special methods, and call the corresponding method when necessary.
 * Spin in a loop until a non-existent code (default switch code) is entered for the operation code.
 *
 * @author Aleksandar Zizovic
 */
public class Calculator {
    private static final String ENTRY = "Enter %s number: ";
    private static final String ENTRY_OPERATION = "Enter the desired operation (a, s, m, d)-any other key for exit: ";
    private static final String RESULT = "%s of numbers entered is: %f";
    private static final String WRONG_ENTRY_NUMBER = "The entered value is not a number! Try again!";
    private static final String WRONG_ENTRY_ZERO = "It is not possible to divide by zero!";
    private static final String THE_END = "End of program!";

    private static final Scanner scanner = new Scanner(System.in);
    private static boolean toContinue = true;

    public static void main(String[] args) {
        while (toContinue) {
            System.out.printf(ENTRY + "%n", "first");
            double firstNumber = numberEntry();

            System.out.printf(ENTRY + "%n", "second");
            double secondNumber = numberEntry();

            // Operation selection
            System.out.println(ENTRY_OPERATION);
            String operation = scanner.next();

            // Displaying the results for the selected operation
            switch (operation) {
                case "a":
                    System.out.printf(RESULT + "%n", "Sum", add(firstNumber, secondNumber));
                    break;
                case "s":
                    System.out.printf(RESULT + "%n", "Difference", subtract(firstNumber, secondNumber));
                    break;
                case "m":
                    System.out.printf(RESULT + "%n", "Product", multiply(firstNumber, secondNumber));
                    break;
                case "d":
                    if (secondNumber == 0.0) {
                        System.out.println(WRONG_ENTRY_ZERO);
                    } else {
                        System.out.printf(RESULT + "%n", "Quotient", divide(firstNumber, secondNumber));
                    }
                    break;
                default:
                    System.out.println(THE_END);
                    toContinue = false;
            }
        }

        scanner.close();
    }

    // Verification of number entry
    private static double numberEntry() {
        while (!scanner.hasNextDouble()) {
            System.out.println(WRONG_ENTRY_NUMBER);
            scanner.next();
        }

        return scanner.nextDouble();
    }

    private static double add(double a, double b) {
        return a + b;
    }

    private static double subtract(double a, double b) {
        return a - b;
    }

    private static double multiply(double a, double b) {
        return a * b;
    }

    private static double divide(double a, double b) {
        return a / b;
    }
}
