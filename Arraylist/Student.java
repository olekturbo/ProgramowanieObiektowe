import java.util.ArrayList;

public class Student {
	private int nr;
	private String imie;
	ArrayList<Integer> oceny = new ArrayList<>();

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public Student(int nr, String imie) {
		this.nr = nr;
		this.imie = imie;
	}

	public String toString() {
		return getNr() + " " + getImie() + " " + oceny;
	}

}
