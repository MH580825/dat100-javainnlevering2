package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

//Marius, Benjamin og Lars er de råeste av de råe til å programmere >:)
	
	public static void main(String[] args) {
		int[] tabell = { 1, 3, 8, -7, 42, 67, 89 }; // en tabell med heltall
		SkrivUt(tabell);			//kaller metoden som skriver ut tabell
		System.out.println(tilStreng(tabell));	//kaller og skriver ut metoden som konverterer fra int til string
		System.out.println(summer(tabell));	//kaller og skriver ut metoden som summerer tabell
		 }	
	
	//metode for å skrive ut en tabell
	public static void SkrivUt(int[] tabell) {
		
		System.out.print("[");
		
		int i;
		for ( i=0; i < tabell.length-1; i++) {
		System.out.print(tabell[i] + ",");
		}
		System.out.println(tabell[i] + "]");
		
	}

	// b)
	//metode for å konvertere fra int til string
	public static String tilStreng(int[] tabell) {
		
		String Stringtabell = "[";
		int i;
		for ( i=0; i < tabell.length-1; i++) {
			Stringtabell = Stringtabell + tabell[i] + ",";
		}
		Stringtabell = Stringtabell + tabell[i] + "]";
		
		return Stringtabell;
}

	// c)
	//for løkke
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int tall : tabell) {
			sum += tall; }
			return sum;
	//while løkke
		//	public static int summer(int[] tabell) {
//		int i = 0;
//		int sum = 0;
//	while (i < tabell.length) {
//		sum += tabell[i];
//		i = i+1;
//	}
//		return sum;

	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
