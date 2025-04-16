package pckg13student;

/**
 * @author Aleksandar Zizovic
 */
public class Student implements Comparable<Student> {
    private final String firstName;
    private final String lastName;
    private final int points;

    public Student(String firstName, String lastName, int points) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.points = points;
    }

    public int getGrade() {
        if (this.points > 90)
            return 10;
        else if (this.points > 80)
            return 9;
        else if (this.points > 70)
            return 8;
        else if (this.points > 60)
            return 7;
        else if (this.points > 50)
            return 6;
        else
            return 5;
    }

    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.points, student.points);
    }

    @Override
    public String toString() {
        return new StringBuilder(this.getClass().getSimpleName())
                .append(" - first name: ").append(this.firstName)
                .append("; last name").append(this.lastName)
                .append("; number of points").append(this.points)
                .append("; grade").append(this.getGrade())
                .append("\n").toString();
    }
}
