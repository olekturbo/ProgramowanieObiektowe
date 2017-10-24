
public class LiczbaU {
	private int calosci;
	private Ulamek czescU;

	int getCalosci() {
		return calosci;
	}

	void setCalosci(int calosci) {
		this.calosci = calosci;
	}

	Ulamek getCzescU() {
		return czescU;
	}

	void setCzescU(Ulamek czescU) {
		this.czescU = czescU;
	}

	public LiczbaU(int calosci, Ulamek czescU) {
		setCalosci(calosci);
		setCzescU(czescU);
	}

	void plus(LiczbaU l) {
		this.setCalosci(this.getCalosci() + l.getCalosci());
		int nowyMianownik = this.czescU.getMianownik() * l.czescU.getMianownik();
		int nowyLicznikU = this.czescU.getLicznik() * l.czescU.getMianownik();
		int nowyLicznikV = l.czescU.getLicznik() * this.czescU.getMianownik();

		czescU.setLicznik(nowyLicznikU + nowyLicznikV);
		czescU.setMianownik(nowyMianownik);

		while (this.czescU.getLicznik() >= this.czescU.getMianownik()) {
			this.setCalosci(getCalosci() + getCalosci());
			czescU.setLicznik(this.czescU.getLicznik() - this.czescU.getMianownik());
		}
	}

	void plus(int i) {
		this.calosci += i;
	}

	void plus(Ulamek u) {
		int nowyMianownik = this.czescU.getMianownik() * u.getMianownik();
		int nowyLicznikU = this.czescU.getLicznik() * u.getMianownik();
		int nowyLicznikV = u.getLicznik() * this.czescU.getMianownik();

		czescU.setLicznik(nowyLicznikU + nowyLicznikV);
		czescU.setMianownik(nowyMianownik);

		while (this.czescU.getLicznik() >= this.czescU.getMianownik()) {
			this.calosci++;
			czescU.setLicznik(this.czescU.getLicznik() - this.czescU.getMianownik());
		}
	}

	public String toString() {
		return this.getCalosci() + " i " + this.czescU.getLicznik() + "/" + this.czescU.getMianownik();
	}

}
