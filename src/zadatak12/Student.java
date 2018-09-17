/**
 * 
 */
package zadatak12;

/**
 * @author Aleksandar.Zizovic
 *
 */
public class Student implements Comparable<Student> {

	private String ime;
	private String prezime;
	private int brojPoena;

	Student() {
	}

	Student(String ime, String prezime, int brojPoena) {
		this.ime = ime;
		this.prezime = prezime;
		this.brojPoena = brojPoena;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getBrojPoena() {
		return brojPoena;
	}

	public void setBrojPoena(int brojPoena) {
		this.brojPoena = brojPoena;
	}

	public int getOcena() {
		if (this.brojPoena > 90)
			return 10;
		else if (this.brojPoena > 80)
			return 9;
		else if (this.brojPoena > 70)
			return 8;
		else if (this.brojPoena > 60)
			return 7;
		else if (this.brojPoena > 50)
			return 6;
		else
			return 5;
	}

	@Override
	public int compareTo(Student student) {
		if (this.brojPoena > student.brojPoena)
			return 1;
		else if (this.brojPoena == student.brojPoena)
			return 0;
		else
			return -1;
	}

	@Override
	public String toString() {
		return new StringBuilder(this.ime).append(" ").append(this.prezime).append(" ").append(this.brojPoena)
				.append(" ").append(this.getOcena()).append(" \n").toString();
	}
}
