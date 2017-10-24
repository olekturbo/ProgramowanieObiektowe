
public class Ulamek {
	private int licznik, mianownik;

	int getLicznik() {
		return licznik;
	}

	void setLicznik(int licznik) {
		this.licznik = licznik;
	}

	int getMianownik() {
		return mianownik;
	}

	void setMianownik(int mianownik) {
		this.mianownik = mianownik;
	}

	public Ulamek(int licznik, int mianownik) {
		setLicznik(licznik);
		setMianownik(mianownik);
	}

	static Ulamek dodaj(Ulamek u, Ulamek v) {
		int nowyMianownik = u.getLicznik() * v.getMianownik();
		int nowyLicznikU = u.getLicznik() * v.getMianownik();
		int nowyLicznikV = v.getLicznik() * u.getMianownik();
		Ulamek x = new Ulamek(nowyLicznikV + nowyLicznikU, nowyMianownik);
		return x;

	}

	void plus(Ulamek v) {
		int nowyMianownik = this.mianownik * v.getMianownik();
		int nowyLicznikU = this.licznik * v.getMianownik();
		int nowyLicznikV = v.getLicznik() * this.mianownik;

		this.setLicznik(nowyLicznikU + nowyLicznikV);
		this.setMianownik(nowyMianownik);

	}

	void plus(int i) {
		this.setLicznik(this.getLicznik() + (i * this.getMianownik()));
	}

	public String toString() {
		return getLicznik() + "/" + getMianownik();
	}

}
