package pckg04students;

import java.util.Scanner;

/**
 * Using a for loop, find and print the name of the student with the highest number of points on the test. First, the
 * number of students n is entered, then the for loop is run n times and the student's name and number of points are
 * entered. Remember the one with the highest number of points.
 *
 * @author Aleksandar Zizovic
 */
public class Students {
    private static final String NUMBER_OF_STUDENTS = "Enter the number of students: ";
    private static final String MAX_POINTS = "Student with the highest number of points: ";
    private static final String POINTS = "The number of points the student earned: ";
    private static final String WRONG_ENTRY = "Wrong entry! Try again!";
    private static final String WRONG_ENTRY_NAME =
            "The name must have more than one character and must not contain numbers! Try again!";
    private static final String WRONG_ENTRY_POINTS = "The number of points must be positive! Try again!";
    private static final String WRONG_ENTRY_NUMBER_OF_STUDENTS =
            "The number of students must be greater than 0! Try again!";
    private static final String REGEX = "^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$";
    private static final String CONTINUE = "Do you want to continue?";
    private static final String THE_END = "End of program!";

    private static final Scanner input = new Scanner(System.in);
    private static String studentName;

    public static void main(String[] args) {
        while (true) {
            System.out.println(NUMBER_OF_STUDENTS);

            int numberOfStudents = getNumberOfStudents();
            int maxPoints = 0;

            for (int student = 1; student <= numberOfStudents; student++) {
                System.out.println("Enter the name of the " + student + ". student: ");
                String name = nameEntry();

                System.out.println("Enter the number of points of the " + student + ". student: ");
                int helperValue = pointsEntry();

                if (helperValue > maxPoints) {
                    maxPoints = helperValue;
                    studentName = name;
                }
            }

            System.out.println(MAX_POINTS + studentName);
            System.out.println(POINTS + maxPoints);

            System.out.println(CONTINUE);

            // Exit (or continue)
            if (!shouldContinue()) {
                System.out.println(THE_END);
                break;
            }
        }

        input.close();
    }

    // Validate number entry
    private static int numberEntry() {
        while (!input.hasNextInt()) {
            System.out.println(WRONG_ENTRY);
            input.next();
        }

        return input.nextInt();
    }

    // Validate entered number of students
    private static int getNumberOfStudents() {
        int number = numberEntry();

        while (number <= 0) {
            System.out.println(WRONG_ENTRY_NUMBER_OF_STUDENTS);
            number = numberEntry();
        }

        return number;
    }

    // Validate entered number of points
    private static int pointsEntry() {
        int broj = numberEntry();

        while (broj < 0) {
            System.out.println(WRONG_ENTRY_POINTS);
            broj = numberEntry();
        }

        return broj;
    }

    // Validate entered first and last name
    private static String nameEntry() {
        String name = "";

        while (!name.matches(REGEX)) {
            if (!name.isEmpty()) {
                System.out.println(WRONG_ENTRY_NAME);
            }

            name = input.nextLine();
        }

        return name;
    }

    // Validate response for program termination
    private static boolean shouldContinue() {
        String answer = input.next();

        while (!"yes".equalsIgnoreCase(answer) && !"no".equalsIgnoreCase(answer)) {
            System.out.println(WRONG_ENTRY);
            answer = input.next();
        }

        return "yes".equalsIgnoreCase(answer);
    }
}
