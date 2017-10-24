
public class Konto {
	private float stan;
	private String wlasciciel;

	public float getStan() {
		return stan;
	}

	public void setStan(float stan) {
		this.stan = stan;
	}

	public String getWlasciciel() {
		return wlasciciel;
	}

	public void setWlasciciel(String wlasciciel) {
		this.wlasciciel = wlasciciel;
	}

	public Konto(float stan, String wlasciciel) {
		setStan(stan);
		setWlasciciel(wlasciciel);
	}
	
	public String toString() {
		return getStan() + " - " + getWlasciciel();
	}

	void operacja(float ile) {
		setStan(stan + ile);
	}

	void przelej(float ile, Konto dokad) {
		operacja(-ile);
		dokad.operacja(ile);
	}

	static void przelej(float ile, Konto skad, Konto dokad) {
		skad.operacja(-ile);
		dokad.operacja(ile);
	}
}
