package pckg05guessthenumber;

import java.util.Random;
import java.util.Scanner;

/**
 * Modify the homework from the previous week. Loop until we hit the number, or at least come close (difference less
 * than 5). Separate that part with the hit check into a separate method, to which the number we type is passed as an
 * argument, and the return value of the method is 0 - if we hit, 1 - if we were close, 2 - if we missed. Based on that,
 * we stay or exit the loop and end the program with the appropriate message.
 *
 * @author Aleksandar Zizovic
 */
public class GuessTheNumber {
    private static final String ENTRY = "Enter a number from 1 to 50: ";
    private static final String DEFAULT_NUMBER = "The default number is: %d.";
    private static final String WRONG_ENTRY = "Wrong entry! Try again!";
    private static final String WRONG_ENTRY_NUMBER = "The entered value is not a number! Try again!";
    private static final String HIT = "Incredibly! You guessed the right number! Play Lotto!!!";
    private static final String CLOSE = "Nice try, you were very close!";
    private static final String MISS = "Better luck next time...";
    private static final String CONTINUE = "Do you want to continue?";
    private static final String THE_END = "End of program!";

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int enteredNumber = numberEntry();
            int check = checkHit(enteredNumber);

            if (check == 2) {
                continue;
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

    private static int checkHit(int enteredNumber) {
        // Generate and display random number
        Random random = new Random();
        int randomNumber = random.nextInt(50) + 1;

        System.out.printf(DEFAULT_NUMBER + "%n", randomNumber);

        // Validate, display and return results
        if (randomNumber == enteredNumber) {
            System.out.println(HIT);
            return 0;
        } else if (5 >= Math.abs(enteredNumber - randomNumber)) {
            System.out.println(CLOSE);
            return 1;
        } else {
            System.out.println(MISS);
            return 2;
        }
    }

    // Validate number entry
    private static int numberEntry() {
        int enteredNumber;

        do {
            System.out.println(ENTRY);

            while (!scanner.hasNextInt()) {
                System.out.println(WRONG_ENTRY_NUMBER);
                scanner.next();
            }

            enteredNumber = scanner.nextInt();
        } while (0 >= enteredNumber || 50 < enteredNumber);

        return enteredNumber;
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
