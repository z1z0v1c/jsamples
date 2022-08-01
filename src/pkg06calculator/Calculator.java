package pkg06calculator;

/**
 * Modification of the previous calculator.
 * Place all operations in special methods, and call the corresponding method when necessary.
 * Spin in a loop until a non-existent code (default switch code) is entered for the operation code.
 * 
 * @author Aleksandar.Zizovic
 */

import java.util.Scanner;

public class Calculator {

	private static Scanner scanner = new Scanner(System.in);
	private static boolean toContinue = true;
	
	private static final String ENTRY = "Enter %s number: ";
	private static final String ENTRY_OPERATION = "Enter the desired operation (a, s, m, d)-any other key for exit: ";
	private static final String RESULT = "%s of numbers entered is: %f";
	private static final String WRONG_ENTRY = "Wrong entry! Try again!";
	private static final String WRONG_ENTRY_NUMBER = "The entered value is not a number! Try again!";
	private static final String WRONG_ENTRY_ZERO = "It is not possible to divide by zero!";
	private static final String THE_END = "End of program!";

	public static void main(String[] args) {

		while (toContinue) {

			System.out.println(String.format(ENTRY, "first"));
			double firstNumber = numberEntry();

			System.out.println(String.format(ENTRY, "second"));
			double secondNumber = numberEntry();

			// operation selection
			System.out.println(ENTRY_OPERATION);
			String operation = scanner.next();

			// displaying the results for the selected operation
			switch (operation) {
			case "a":
				System.out.println(String.format(RESULT, "Sum", add(firstNumber,secondNumber)));
				break;
			case "s":
				System.out.println(String.format(RESULT, "Difference" , subtract(firstNumber, secondNumber)));
				break;
			case "m":
				System.out.println(String.format(RESULT, "Product" , multiply(firstNumber, secondNumber)));
				break;
			case "d":
				if (secondNumber == 0.0) {
					System.out.println(WRONG_ENTRY_ZERO);
					break;
				} else {
					System.out.println(String.format(RESULT, "Quotient", divide(firstNumber, secondNumber)));
					break;
				}
			default:
				System.out.println(THE_END);
				toContinue = false;
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
