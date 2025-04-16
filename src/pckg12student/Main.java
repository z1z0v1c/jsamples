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
 * result of the program, the output file "ocene.txt" is expected, which will
 * contain a list of all students sorted by points, from the highest to the
 * lowest, and where, apart from the name of the student and the color of the
 * points, find the grade he got in the exams. Grade 10 if he had more than 90
 * points, 9 if he had between 81 and 90... Up to 5 if he had less than 51
 * points.
 * 
 * @author Aleksandar.Zizovic
 */
public class Main {

	private static final Scanner input = new Scanner(System.in);
	private static final String FIRST_NAME = "Enter student first name: ";
	private static final String LAST_NAME = "Enter the student's last name: ";
	private static final String POINTS = "Number of points the student achieved (0 - 100): ";
	private static final String WRONG_ENTRY = "Wrong entry! Try again!";
	private static final String REGEX_FIRST_NAME = "^[A-Z][a-zA-Z]+";
	private static final String REGEX_LAST_NAME = "^[A-Z]?[\\-'\\s]?[A-Z][a-zA-Z ]+$";
	private static final String CONTINUE = "Do you want to continue?";
	private static final String THE_END = "End of program!";

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		boolean toContinue = true;

		// intake of students
		while (toContinue) {
			System.out.println(FIRST_NAME);
			Student student = new Student();
			student.setFirstName(firstNameEntry());
			System.out.println(LAST_NAME);
			student.setLastName(lastNameEntry());
			System.out.println(POINTS);
			student.setPoints(pointsEntry());

			// adding a student to the list
			students.add(student);

			// program exit
			System.out.println(CONTINUE);
			if (!shouldContinue()) {
				System.out.println(THE_END);
				break;
			}
		}

		Collections.sort(students);
		Collections.reverse(students);

		File file = new File("grade.txt");

		// writing students to the file
		try (PrintWriter output = new PrintWriter(file)) {
			for (Student student : students) {
				output.println(student.toString());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		input.close();
	}

	// validation of the entered first name
	private static String firstNameEntry() {
		String firstName = input.nextLine();
		while (!firstName.matches(REGEX_FIRST_NAME)) {
			if (!firstName.equals("")) {
				System.out.println(WRONG_ENTRY);
			}
			firstName = input.nextLine();
		}
		return firstName;
	}

	// validation of the entered last name
	private static String lastNameEntry() {
		String lastName = input.nextLine();
		while (!lastName.matches(REGEX_LAST_NAME)) {
			System.out.println(WRONG_ENTRY);
			lastName = input.nextLine();
		}
		return lastName;
	}

	// checking if the number has been entered
	private static int numberEntry() {
		while (!input.hasNextInt()) {
			System.out.println(WRONG_ENTRY);
			input.next();
		}
		return input.nextInt();
	}

	// validation of the entered number of points
	private static int pointsEntry() {
		int number = numberEntry();
		while (number < 0 || number > 100) {
			System.out.println(WRONG_ENTRY);
			number = numberEntry();
		}
		return number;
	}

	// response validation to continue or exit the program
	private static boolean shouldContinue() {
		String answer = input.next();
		while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
			System.out.println(WRONG_ENTRY);
			answer = input.next();
		}
		return answer.equalsIgnoreCase("yes");
	}
}
