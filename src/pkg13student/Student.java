package pkg13student;

/**
 * @author Aleksandar.Zizovic
 */
public class Student implements Comparable<Student> {

	private String firstName;
	private String lastName;
	private int points;

	public Student() {
	}

	public Student(String firstName, String lastName, int points) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.points = points;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
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
		return (this.points > student.points) ? 1 : (this.points == student.points) ? 0 : -1;
	}

	@Override
	public String toString() {
		return new StringBuilder(this.firstName)
				.append(" ").append(this.lastName)
				.append(" ").append(this.points)
				.append(" ").append(this.getGrade())
				.append(" \n").toString();
	}
}
