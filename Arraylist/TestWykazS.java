// klasa testujaca do zadania ArrayL, tj. testujaca klasy Student i WykazS

class TestWykazS {
	public static void main(String[] a) {
		WykazS ws = new WykazS();

		ws.wstawStudenta(199200, "Kazik");
		ws.wstawStudenta(199201, "Kazik");
		ws.wstawStudenta(199204, "Nikodem");
		ws.wstawStudenta(199205, "Jan");
		ws.wstawStudenta(189557, "Wiesiek");

		ws.wstawOcene(199200, 5);
		ws.wstawOcene(199200, 4);
		ws.wstawOcene(199200, 3);
		ws.wstawOcene(199200, 5);
		ws.wstawOcene(199200, 2);

		ws.wstawOcene(199201, 5);
		ws.wstawOcene(199201, 6);

		ws.wstawOcene(199204, 4);
		ws.wstawOcene(199204, 5);
		ws.wstawOcene(199201, 4);

		ws.wstawOcene(199205, 3);
		ws.wstawOcene(189557, 5);
		System.out.println("WYPISZ WSZYSTKICH: ");
		ws.wypisz();
		System.out.println("WYPISZ INDEX: 199200");
		ws.wypisz(199200);
	}
}
