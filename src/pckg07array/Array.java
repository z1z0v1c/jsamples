package pckg07array;

import java.util.Scanner;
import java.util.Arrays;

/**
 * To enter a series of integers of length n (which is also entered), sort the series,
 * check if it contains the number x and print the first 5 members of the series to standard output.
 * Use the Arrays class.
 *
 * @author Aleksandar Zizovic
 */
public class Array {
    private static final String ARRAY_LENGTH = "Enter the string length (at least 5): ";
    private static final String WRONG_ENTRY = "Wrong entry! Try again!";
    private static final String WRONG_ENTRY_LENGTH = "Wrong entry! Minimum string length is 5! Try again! ";
    private static final String REQUESTED_NUMBER = "Enter the search number: ";
    private static final String FIRST_FIVE = "The first 5 members of the sorted array are: ";
    private static final String CONTAINS = "\nTHE STRING CONTAINS THE REQUESTED NUMBER\n";
    private static final String DOES_NOT_CONTAIN = "\nTHE STRING DOES NOT CONTAIN THE REQUESTED NUMBER\n";

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = arrayEntry();

        sort(array);
        numberInArray(array);
        printFirstFive(array);

        scanner.close();
    }

    // Validation of number entry
    private static int numberEntry() {
        while (!scanner.hasNextInt()) {
            System.out.println(WRONG_ENTRY);
            scanner.next();
        }

        return scanner.nextInt();
    }

    // Entering the length and members of the string
    private static int[] arrayEntry() {
        System.out.println(ARRAY_LENGTH);
        int arrayLength;

        do {
            arrayLength = numberEntry();

            if (arrayLength < 5) {
                System.out.println(WRONG_ENTRY_LENGTH);
            }

        } while (arrayLength < 5);

        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter the " + (i + 1) + ". array member: ");
            array[i] = numberEntry();
        }

        return array;
    }

    // Array sorting
    private static void sort(int[] array) {
        Arrays.sort(array);
    }

    // Search for a given number in a sequence
    private static void numberInArray(int[] array) {
        System.out.println(REQUESTED_NUMBER);

        int requestedNumber = numberEntry();
        boolean isFound = false;

        for (int element : array) {
            if (element == requestedNumber) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println(CONTAINS);
        } else {
            System.out.println(DOES_NOT_CONTAIN);
        }
    }

    // Printing the first 5 members of the sequence
    private static void printFirstFive(int[] array) {
        System.out.println(FIRST_FIVE);

        for (int i = 0; i < 5; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
