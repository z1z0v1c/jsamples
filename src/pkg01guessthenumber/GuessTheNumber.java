package pkg01guessthenumber;

import java.util.Random;
import java.util.Scanner;

/**
 * Write a program to guess a randomly generated number in the range from 1 to 50.
 * The program should work in the following way: The user enters an integer via the standard input.
 * The number to be guessed should be generated in the range from 1 to 50 using the Random class.
 * After that, write the required number to the standard output and depending on the result of guessing, print the corresponding message.
 * If the correct number was guessed, write: 'Unbelievably you guessed the correct number',
 * if there is a difference between the numbers 5 or less : 'Good try, you were very close', 
 * and if the difference is greater than 5 : 'Better luck next time'.
 * 
 * @author Aleksandar.Zizovic
 */
public class GuessTheNumber {

	private static Scanner scanner = new Scanner(System.in);
	private static final String ENTRY = "Enter a number from 1 to 50: ";
	private static final String WRONG_ENTRY = "Wrong entry! Try again!";
	private static final String WRONG_ENTRY_NUMBER = "The entered value is not a number! Try again!";
	private static final String HIT = "Incredibly! You guessed the right number! Play the Lotto!!!";
	private static final String CLOSE = "Nice try, you were very close!";
	private static final String MISS = "Better luck next time...";
	private static final String CONTINUE = "Do you want to continue?";
	private static final String THE_END = "End of program!";
	
	public static void main(String[] args) {
		while (true) {
			int enteredNumber;
			
			// number entry and validation
			do {
				System.out.println(ENTRY);
				while (!scanner.hasNextInt()) {
					System.out.println(WRONG_ENTRY_NUMBER);
					scanner.next();
				}
				enteredNumber = scanner.nextInt();
			} while ( 0 >= enteredNumber || 50 < enteredNumber);

			// random number generation and display
			Random randomGenerator = new Random();
			int randomNumber = randomGenerator.nextInt(50) + 1;
			System.out.println(new StringBuilder("The default number is: ").append(randomNumber).toString());

			// hit check
			if (randomNumber == enteredNumber) {
				System.out.println(HIT);
			} else if (5 >= Math.abs(enteredNumber - randomNumber)) {
				System.out.println(CLOSE);
			} else {
				System.out.println(MISS);
			}
			
			// response validation to continue or exit the program
			System.out.println(CONTINUE);
			if (!shouldContinue()) {
				System.out.println(THE_END);
				break;
			}
		}
		scanner.close();
	}
	
	// response validation to continue or exit the program
	private static boolean shouldContinue() {
		String answer = scanner.next();
		while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
			System.out.println(WRONG_ENTRY);
			answer = scanner.next();
		}
		return answer.equalsIgnoreCase("yes");	 		
	}
}
