import java.util.ArrayList;

public class WykazS {
	ArrayList<Student> wykaz = new ArrayList<>();
	ArrayList<Integer> oceny = new ArrayList<>();

	void wstawStudenta(int nr, String imie) {
		wykaz.add(new Student(nr, imie));
	}

	void wstawOcene(int nr, int ocena) {
		Student s = wykaz.get(zwroc(nr));
		s.oceny.add(ocena);

	}

	int zwroc(int nr) {
		for (int i = 0; i < wykaz.size(); i++) {
			if (nr == wykaz.get(i).getNr())
				return i;
		}
		return 0;
	}

	void wypisz(int nr) {
		System.out.println(wykaz.get(zwroc(nr)));
	}

	void wypisz() {
		for (Student s : wykaz) {
			System.out.println(s);
		}
	}

}
