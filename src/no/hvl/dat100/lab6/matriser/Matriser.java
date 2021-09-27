package no.hvl.dat100.lab6.matriser;

public class Matriser {
	// vi har også her valgt å legge til main metode og kalle alle funksjonene selv, --
	// for å få en bedre forståelse og bedre læring :)
	public static void main(String[] args) {
		int[][] matrise1 = { { 2, 1, 4 }, { 4, 2, 1 }, { 2, 2, 2 } };
		int[][] matrise2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		skrivUt(matrise1); // kaller metoden som skriver ut matrise
		skrivUt(matrise2); // kaller metoden som skriver ut matrise
		System.out.println(tilStreng(matrise1)); // skriver ut matrise som streng
		int[][] nyMatrise = skaler(5, matrise1); //
		skrivUt(nyMatrise);
		
		boolean lik = erLik(matrise1, matrise2);	//kaller metoden som sjekker om matrisene er like
		if ( lik == true) {	
			System.out.println("Matrisene er like");//dersom like, skrives dette ut
		}
		else {
			System.out.println("Matrisene er ulike"); //ellers skrives dette ut
		}
	}


	// a)
	// Metode for å skrive ut matrise
	public static void skrivUt(int[][] matrise) {

		for (int[] rad : matrise) {
			for (int a : rad) {
				System.out.println(a + " ");
			}
			System.out.println();
		}
	}

	// b)
	// metode for å gjøre matrise om til streng
	public static String tilStreng(int[][] matrise) {

		String matriseString = "";
		for (int[] rad : matrise) {
			for (int a : rad) {
				matriseString = matriseString + Integer.toString(a) + " ";
			}
			matriseString += "\n";
		}
		return matriseString;
	}

	// c)
	// metode som returnerer en ny matrise der alle tall i matrisen er multiplisert med tall
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] nyMatrise = new int[matrise.length][matrise[0].length];
		for (int rad = 0; rad < matrise.length; rad++) {
			for (int a = 0; a < matrise[rad].length; a++) {
				nyMatrise[rad][a] = matrise[rad][a] * tall;
			}
		}
		return nyMatrise;
	}

	// d)
	//Metode som sjekker om matrisene er like eller ulike
	public static boolean erLik(int[][] a, int[][] b) {
		boolean lik = false;

		if (a.length != b.length) {
			return lik;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i].length != b[i].length) {
				return lik;
			}
		}
		for (int j = 0; j < a.length; j++) {
			for (int v = 0; v < a[0].length; v++) {
				if (a[j][v] != b[j][v]) {
					return lik;
				}
			}
		}
		lik = true;
		return lik;
	}
}

// e)
//	public static int[][] speile(int[][] matrise) {
//
//	}
//
//	// f)
//	public static int[][] multipliser(int[][] a, int[][] b) {
//
//	}
//}
