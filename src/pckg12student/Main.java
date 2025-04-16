package pckg12student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Write a program that enables the entry of the student's name and the number
 * of points scored on the test via standard input (until a certain character is
 * entered to stop data entry). The number of points can be from 0 to 100. As a
 * result of the program, the output file "grades.txt" is expected, which will
 * contain a list of all students sorted by points, from the highest to the
 * lowest, and where, apart from the name of the student and the color of the
 * points, find the grade he got in the exams. Grade 10 if he had more than 90
 * points, 9 if he had between 81 and 90... Up to 5 if he had less than 51
 * points.
 *
 * @author Aleksandar Zizovic
 */
public class Main {
    private static final String FIRST_NAME = "Enter student first name: ";
    private static final String LAST_NAME = "Enter the student's last name: ";
    private static final String POINTS = "Number of points the student achieved (0 - 100): ";
    private static final String WRONG_ENTRY = "Wrong entry! Try again!";
    private static final String REGEX_FIRST_NAME = "^[A-Z][a-zA-Z]+";
    private static final String REGEX_LAST_NAME = "^[A-Z]?[\\-'\\s]?[A-Z][a-zA-Z ]+$";
    private static final String CONTINUE = "Do you want to continue?";
    private static final String THE_END = "End of program!";

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Enter students
        while (true) {
            Student student = new Student(
                    firstNameEntry(),
                    lastNameEntry(),
                    pointsEntry()
            );

            // Add student to the list
            students.add(student);

            System.out.println(CONTINUE);

            // Exit (or continue)
            if (!toContinue()) {
                System.out.println(THE_END);
                break;
            }
        }

        Collections.sort(students);
        Collections.reverse(students);

        File file = new File("grades.txt");

        // Write students to the file
        try (PrintWriter output = new PrintWriter(file)) {
            for (Student student : students) {
                output.println(student.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        input.close();
    }

    // Get and validate first name
    private static String firstNameEntry() {
        System.out.println(FIRST_NAME);
        String firstName = input.nextLine();

        while (!firstName.matches(REGEX_FIRST_NAME)) {
            if (!firstName.isEmpty()) {
                System.out.println(WRONG_ENTRY);
            }

            firstName = input.nextLine();
        }

        return firstName;
    }

    // Get and validate last name
    private static String lastNameEntry() {
        System.out.println(LAST_NAME);
        String lastName = input.nextLine();

        while (!lastName.matches(REGEX_LAST_NAME)) {
            System.out.println(WRONG_ENTRY);
            lastName = input.nextLine();
        }

        return lastName;
    }

    // Get and validate number
    private static int numberEntry() {
        while (!input.hasNextInt()) {
            System.out.println(WRONG_ENTRY);
            input.next();
        }

        return input.nextInt();
    }

    // Get and validate number of points
    private static int pointsEntry() {
        System.out.println(POINTS);
        int number = numberEntry();

        while (number < 0 || number > 100) {
            System.out.println(WRONG_ENTRY);
            number = numberEntry();
        }

        return number;
    }

    // Get and validate response for the termination of program
    private static boolean toContinue() {
        String answer = input.next();

        while (!"yes".equalsIgnoreCase(answer) && !"no".equalsIgnoreCase(answer)) {
            System.out.println(WRONG_ENTRY);
            answer = input.next();
        }

        return "yes".equalsIgnoreCase(answer);
    }
}
