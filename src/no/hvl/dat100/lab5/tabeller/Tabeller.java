package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

//Marius, Benjamin og Lars er de r�este av de r�e til � programmere >:)
	
	public static void main(String[] args) {

		int[] tabell = { 1, 3, 8, -7, 42, 67, 89 }; // en tabell med heltall
		int[] tabell2 = { 6, 7, 9 }; // ekstra tabell p.g.a oppgave h)
		//Vi har valgt � skrive ut alle metodene her i tillegg til at de virker i JUnit. B�de for egen l�ring og morroskyld.
		SkrivUt(tabell); // kaller metoden som skriver ut tabell
		System.out.println(tilStreng(tabell)); // kaller og skriver ut metoden som konverterer fra int til string
		System.out.println(summer(tabell)); // kaller og skriver ut metoden som summerer tabell
		System.out.println(finnesTall(tabell,1)); //kaller metode som sjekker om oppgitt nummer f.eks (1) er i tabell og returnerer true/false
		System.out.println(posisjonTall(tabell,89)); //leser av posisjon p� tallet i tabellen. f.eks tallet 89 er på posisjon 6
		SkrivUt(reverser(tabell)); // skriver ut reversert tabell
		System.out.println(erSortert(tabell)); //kaller metode som sjekker om tallene i tabellen er sortert i stigende rekkef�lge
		SkrivUt(settSammen(tabell,tabell2)); // kaller metode som setter sammen tabellene
	
	}
	// a)
	// metode for � skrive ut en tabell
	public static void SkrivUt(int[] tabell) {

		System.out.print("[");

		int i;
		if (tabell.length > 0) {
		for (i = 0; i < tabell.length - 1; i++) {
			System.out.print(tabell[i] + ",");
		}
		System.out.println(tabell[i] + "]"); }
		else System.out.println("Tabellen er tom");

	}
	// b)
	// metode for � konvertere fra int til string
	public static String tilStreng(int[] tabell) {

		String Stringtabell = "[";
		int i;
		if (tabell.length > 0) {
		for (i = 0; i < tabell.length - 1; i++) {
			Stringtabell = Stringtabell + tabell[i] + ",";
		}
		Stringtabell = Stringtabell + tabell[i] + "]"; }
		else System.out.println("Tabellen er tom");

		return Stringtabell;
	}

	// c)
	public static int summer(int[] tabell) { // for løkke
		int sum = 0;
		int i;
		for (i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		i = i++;

		return sum;

//	public static int summer(int[] tabell) {		//while l�kke
//		int i = 0;
//		int sum = 0;
//	while (i < tabell.length) {
//		sum += tabell[i];
//		i = i+1;
//	}
//		return sum;
//	public static int summer(int[] tabell) {		//utvidet for-l�kke
//		int sum = 0;
//		for (int tall : tabell) {
//			sum += tall; }
//			return sum;
//			}
	}
	
	// d)
	//metode som sjekker om et tall ligger i tabellen og oppgir true/false
	
	public static boolean finnesTall (int[] tabell, int tall) {
		boolean finnes = false;
		int i = 0;
		
		while (i < tabell.length && (!finnes)) {
			
			if (tabell[i] == tall) {
				finnes = true;
			}
			
			i++;
		}
		
		return finnes;
	}
	
	// e)
	// metode som finner posisjon p� tall i tabell
	public static int posisjonTall(int[] tabell, int tall) {
		int teller = 0;
		int i = -1;
		
		while (teller < tabell.length && teller != tall) {
			if (tabell[teller] == tall) {
				i =  teller;
				break;
			}
			teller++;
		}
		return i;
}	
	// f)
	//metode som kopierer en tabell men i motsatt rekkef�lge
	public static int[] reverser(int[] tabell) {
		int[] reversert = new int [tabell.length];
		int nr = tabell.length;
		
		for (int i = 0; i < tabell.length; i++) {
			reversert[nr - 1] = tabell[i];
			nr = nr -1;
		}
		return reversert;
}
	// g)
	//metode som sjekker om heltall er sortert stigende
public static boolean erSortert(int[] tabell) {
		
		boolean sortert = true;
		
		for (int i = 0; i < tabell.length-1; i++) {
			
			if(tabell[i] > tabell[i+1]) {
				sortert = false;
			}
			
		}
		return sortert;
}

// h)
//metode for � sette sammen tabeller
public static int[] settSammen(int[] tabell1, int[] tabell2) {
	
	int lengde = tabell1.length + tabell2.length;
	int[] nyTabell = new int[lengde];
	int teller = 0;
	
	for (int i = 0; i < nyTabell.length; i++) {
		
		if (i < tabell1.length) {
			nyTabell[i] = tabell1[i];
		}
		else {
			nyTabell[i] = tabell2[teller];
			teller++;
		}
	}
	
	return nyTabell;
	
}
}