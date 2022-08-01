package pkg02calculator;

/**
 * Write a program that will represent a simple calculator. 
 * The program should work so that the user enters two integers,
 * then the code of the operation he wants to perform 
 * ('a' - addition, 's' - subtraction, 'm' - multiplication, 'd' - division). 
 * The result of the operation should be printed to the standard output.
 * 
 * @author Aleksandar.Zizovic
 */

import java.util.Scanner;

public class Calculator {

	private static Scanner scanner = new Scanner(System.in);
	
	private static final String ENTRY = "Enter %s number: ";
	private static final String ENTRY_OPERATION = "Enter the desired operation (a, s, m, d): ";
	private static final String RESULT = "%s of numbers entered is: %f";
	private static final String WRONG_ENTRY = "Wrong entry! Try again!";
	private static final String WRONG_ENTRY_NUMBER = "The entered value is not a number! Try again!";
	private static final String WRONG_ENTRY_ZERO = "It is not possible to divide by zero!";
	private static final String WRONG_ENTRY_OPERATION = "You have selected a non-existent operation";
	private static final String CONTINUE = "Do you want to continue?";
	private static final String THE_END = "End of program!";

	public static void main(String[] args) {

		while (true) {
			System.out.println(String.format(ENTRY, "first"));
			double firstNumber = numberEntry();

			System.out.println(String.format(ENTRY, "second"));
			double secondNumber = numberEntry();

			// operation selection
			System.out.println(ENTRY_OPERATION);
			String operation = stringEntry();

			// displaying the results for the selected operation
			switch (operation) {
			case "a":
				System.out.println(String.format(RESULT, "Sum", (firstNumber + secondNumber)));
				break;
			case "s":
				System.out.println(String.format(RESULT, "Difference", (firstNumber - secondNumber)));
				break;
			case "m":
				System.out.println(String.format(RESULT, "Product", (firstNumber * secondNumber)));
				break;
			case "d":
				if (secondNumber == 0.0) {
					System.out.println(WRONG_ENTRY_ZERO);
					break;
				} else {
					System.out.println(String.format(RESULT, "Quotient", (firstNumber / secondNumber)));
					break;
				}
			default:
				System.out.println(WRONG_ENTRY_OPERATION);
			}

			// program exit
			System.out.println(CONTINUE);
			if (!shouldContinue()) {
				System.out.println(THE_END);
				break;
			}
		}
		scanner.close();
	}

	// verification of number entry
	private static double numberEntry() {
		while (!scanner.hasNextDouble()) {
			System.out.println(WRONG_ENTRY_NUMBER);
			scanner.next();
		}
		return scanner.nextDouble();
	}

	// checking operation selection
	private static String stringEntry() {
		while (!scanner.hasNext("[asmd]")) {
			System.out.println(WRONG_ENTRY);
			scanner.next();
		}
		return scanner.next();
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
