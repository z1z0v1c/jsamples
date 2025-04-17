package pckg02calculator;

import java.util.Scanner;

/**
 * Write a program that will represent a simple calculator. The program should work so that the user enters two integers,
 * then the code of the operation he wants to perform ('a' - addition, 's' - subtraction, 'm' - multiplication, 'd' -
 * division). The result of the operation should be printed to the standard output.
 *
 * @author Aleksandar Zizovic
 */
public class Calculator {
    private static final String ENTRY = "Enter %s number: ";
    private static final String ENTRY_OPERATION = "Enter the desired operation (a, s, m, d): ";
    private static final String RESULT = "%s of numbers entered is: %.2f";
    private static final String WRONG_ENTRY = "Wrong entry! Try again!";
    private static final String WRONG_ENTRY_NUMBER = "The entered value is not a number! Try again!";
    private static final String WRONG_ENTRY_ZERO = "It is not possible to divide by zero!";
    private static final String WRONG_ENTRY_OPERATION = "You have selected a non-existent operation";
    private static final String CONTINUE = "Do you want to continue?";
    private static final String THE_END = "End of program!";

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.printf(ENTRY + "%n", "first");
            double firstNumber = numberEntry();

            System.out.printf(ENTRY + "%n", "second");
            double secondNumber = numberEntry();

            // Choose operation
            System.out.println(ENTRY_OPERATION);
            String operation = stringEntry();

            // Display the results
            switch (operation) {
                case "a":
                    System.out.printf(RESULT + "%n", "Sum", (firstNumber + secondNumber));
                    break;
                case "s":
                    System.out.printf(RESULT + "%n", "Difference", (firstNumber - secondNumber));
                    break;
                case "m":
                    System.out.printf(RESULT + "%n", "Product", (firstNumber * secondNumber));
                    break;
                case "d":
                    if (secondNumber == 0.0) {
                        System.out.println(WRONG_ENTRY_ZERO);
                    } else {
                        System.out.printf(RESULT + "%n", "Quotient", (firstNumber / secondNumber));
                    }
                    break;
                default:
                    System.out.println(WRONG_ENTRY_OPERATION);
            }

            System.out.println(CONTINUE);

            // Exit (or continue)
            if (!shouldContinue()) {
                System.out.println(THE_END);
                break;
            }
        }

        scanner.close();
    }

    // Validate number entry
    private static double numberEntry() {
        while (!scanner.hasNextDouble()) {
            System.out.println(WRONG_ENTRY_NUMBER);
            scanner.next();
        }

        return scanner.nextDouble();
    }

    // Validate operation selection
    private static String stringEntry() {
        while (!scanner.hasNext("[asmd]")) {
            System.out.println(WRONG_ENTRY);
            scanner.next();
        }

        return scanner.next();
    }

    // Validate response for program termination
    private static boolean shouldContinue() {
        String answer = scanner.next();

        while (!"yes".equalsIgnoreCase(answer) && !"no".equalsIgnoreCase(answer)) {
            System.out.println(WRONG_ENTRY);
            answer = scanner.next();
        }

        return "yes".equalsIgnoreCase(answer);
    }
}
