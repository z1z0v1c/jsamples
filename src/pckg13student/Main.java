package pckg13student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Write the same program as in Task 2, which returns a different result - the name of the student and the points on the
 * test are in some file "points.txt". The task is to print the list of students (name, points and grade) sorted by
 * points to the standard output.
 *
 * @author Aleksandar Zizovic
 */
public class Main {
    public static void main(String[] args) {
        Scanner input;
        File file = new File("points.txt");
        List<Student> students = new ArrayList<>();

        // Read from the file
        try {
            input = new Scanner(file);

            while (input.hasNext()) {
                Student student = new Student(
                        input.next(),   // First name
                        input.next(),   // Last name
                        input.nextInt() // Number of points
                );

                students.add(student);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Collections.sort(students);
        Collections.reverse(students);

        // Print students
        for (Student student : students) {
            System.out.print(student.toString());
        }
    }
}
