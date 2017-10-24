
public class KontoApp {
	public static void main(String[] args) {
		Konto konto1 = new Konto(1000, "Andrzej");
		Konto konto2 = new Konto(1500, "Julian");
		KontoR kontoR = new KontoR(2000, "Olek");
		
		System.out.println(kontoR);
		System.out.println(konto1);
		System.out.println(konto2);
		
		System.out.println(konto1.getWlasciciel() +" -> "+konto2.getWlasciciel() + " - 100PLN");
		konto1.przelej(100, konto2);
		
		System.out.println(kontoR);
		System.out.println(konto1);
		System.out.println(konto2);
		
		System.out.println(konto2.getWlasciciel() +" -> "+konto1.getWlasciciel() + " - 100PLN");
		Konto.przelej(100, konto2, konto1);
		
		System.out.println(kontoR);
		System.out.println(konto1);
		System.out.println(konto2);
		
		System.out.println(kontoR.getWlasciciel() +" -> "+konto2.getWlasciciel() + " - 500PLN");
		kontoR.przelej(500, konto2);
		
		System.out.println(kontoR);
		System.out.println(konto1);
		System.out.println(konto2);
		
		System.out.println(kontoR.getWlasciciel() +" -> "+konto1.getWlasciciel() + " - 1000PLN");
		
		kontoR.przelej(1000, konto1);
		
		System.out.println(kontoR);
		System.out.println(konto1);
		System.out.println(konto2);
		
	}
	

}
