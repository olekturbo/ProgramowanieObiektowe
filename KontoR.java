
public class KontoR extends Konto {

	public KontoR(float stan, String wlasciciel) {
		super(stan, wlasciciel);
		// TODO Auto-generated constructor stub
	}

	int tab[] = new int[5];

	void operacja(float ile) {
		super.operacja(ile);
		float tab[] = new float[5];
			tab[0] = ile;
			System.out.println("Operacja: "+tab[0]+" PLN");
		

	}

}
