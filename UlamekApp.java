
public class UlamekApp {

	public static void main(String[] args) {

		Ulamek u = new Ulamek(1, 2);
		Ulamek v = new Ulamek(1, 4);
		if (u.getLicznik() >= u.getMianownik())
			System.exit(0);
		System.out.println("dodaj(u,v) =" + Ulamek.dodaj(u, v).toString());
		u.plus(10);
		System.out.println("u+10 =" + u.toString());
		u.plus(v);
		System.out.println("noweU+v = " + u.toString());

		Ulamek x = new Ulamek(1, 2);
		Ulamek z = new Ulamek(1, 4);

		LiczbaU lU = new LiczbaU(1, x);
		LiczbaU lV = new LiczbaU(2, z);

		lU.plus(lV);
		System.out.println("nowe lU = " + lU.toString());

		lU.plus(5);
		System.out.println("nowe lU + 5 = " + lU.toString());

		lU.plus(z);
		System.out.println("(nowe lU +5) + Ulamek x = " + lU.toString());

	}

}
