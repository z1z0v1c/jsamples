package pckg03evennumbers;

import java.util.Scanner;

/**
 * Using the while loop, print out all the even numbers between the numbers a and b that are entered through the
 * standard input.
 *
 * @author Aleksandar Zizovic
 */
public class EvenNumbers {
    private static final String LOWER_lIMIT = "Enter the lower limit: ";
    private static final String HIGHER_LIMIT = "Enter the higher limit:";
    private static final String EVEN_NUMBERS = "The even numbers between the entered limits are: ";
    private static final String WRONG_ENTRY = "Wrong entry! Try again!";
    private static final String CONTINUE = "Do you want to continue?";
    private static final String THE_END = "End of program!";

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println(LOWER_lIMIT);
            int lowerLimit = entry();

            System.out.println(HIGHER_LIMIT);
            int higherLimit = entry();

            System.out.println(EVEN_NUMBERS);

            // Swap values if they are entered incorrectly
            if (lowerLimit > higherLimit) {
                int helper = higherLimit;
                higherLimit = lowerLimit;
                lowerLimit = helper;
            }

            // Print even numbers
            while (lowerLimit <= higherLimit) {
                if (lowerLimit % 2 == 0) {
                    System.out.print(lowerLimit + "\n");
                }

                lowerLimit++;
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
    private static int entry() {
        while (!scanner.hasNextInt()) {
            System.out.println(WRONG_ENTRY);
            scanner.next();
        }

        return scanner.nextInt();
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
