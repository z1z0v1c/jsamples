package pckg01guessthenumber;

import java.util.Random;
import java.util.Scanner;

/**
 * Write a program to guess a randomly generated number in the range from 1 to 50. The program should work in the
 * following way:
 * <p>
 *      - The user enters an integer via the standard input.
 *      - The number to be guessed should be generated in the range from 1 to 50 using the Random class.
 *      - Write the required number to the standard output and depending on the result of guessing, print the corresponding
 *      message.
 *      - If the correct number was guessed, write: 'Unbelievably you guessed the correct number'.
 *      - If there is a difference between the numbers 5 or less : 'Good try, you were very close'.
 *      - If the difference is greater than 5 : 'Better luck next time'.
 *
 * @author Aleksandar Zizovic
 */
public class GuessTheNumber {
    private static final String ENTRY = "Enter a number from 1 to 50: ";
    private static final String WRONG_ENTRY = "Wrong entry! Try again!";
    private static final String WRONG_ENTRY_NUMBER = "The entered value is not a number! Try again!";
    private static final String HIT = "Incredibly! You guessed the right number! Play the Lotto!!!";
    private static final String CLOSE = "Nice try, you were very close!";
    private static final String MISS = "Better luck next time...";
    private static final String CONTINUE = "Do you want to continue?";
    private static final String THE_END = "End of program!";

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int enteredNumber;

            // Validate number entry
            do {
                System.out.println(ENTRY);

                while (!scanner.hasNextInt()) {
                    System.out.println(WRONG_ENTRY_NUMBER);
                    scanner.next();
                }

                enteredNumber = scanner.nextInt();
            } while (0 >= enteredNumber || 50 < enteredNumber);

            // Generate and display random number
            Random randomGenerator = new Random();
            int randomNumber = randomGenerator.nextInt(50) + 1;

            System.out.println("The default number is: " + randomNumber);

            // Hit check
            if (randomNumber == enteredNumber) {
                System.out.println(HIT);
            } else if (5 >= Math.abs(enteredNumber - randomNumber)) {
                System.out.println(CLOSE);
            } else {
                System.out.println(MISS);
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

    // Validate input for program termination
    private static boolean shouldContinue() {
        String answer = scanner.next();

        while (!"yes".equalsIgnoreCase(answer) && !"no".equalsIgnoreCase(answer)) {
            System.out.println(WRONG_ENTRY);
            answer = scanner.next();
        }

        return "yes".equalsIgnoreCase(answer);
    }
}
