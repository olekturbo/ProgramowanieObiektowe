
public class UlamekZP extends Ulamek {
	int staryL = this.getLicznik();
	int staryM = this.getMianownik();
	int licz = 0;
	public UlamekZP(int licznik, int mianownik) {
		super(licznik, mianownik);
	}
	
	void cofnij() {
		this.setLicznik(staryL);
		this.setMianownik(staryM);
		licz++;
	}
	
	boolean sprawdz() {
		if(licz >= 1) return false;
		else return true;
	}
	
	public String toString() {
		return super.toString() + " " + sprawdz();
	}
	
	

}
