package no.hvl.dat100.lab6.matriser;

public class Matriser {
	
	public static void main(String[] args) {
		int[][] matrise1 = { { 2, 1, 4 }, { 4, 2, 1 }, {2, 2, 2}};
		int[][] matrise2 = { { 1, 2, 3 }, { 4, 5, 6 }, {7, 8, 9}};
		skrivUt(matrise1);
		skrivUt(matrise2);
		System.out.println(tilStreng(matrise1));
		int [][]nyMatrise =skaler(5, matrise1);
		skrivUt(nyMatrise);
	}

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] rad : matrise) {
			for (int a : rad) {
			System.out.println(a + " ");
			}
			System.out.println();
		}}

	// b)
	public static String tilStreng(int[][] matrise) {

		String matriseString = "";
		for(int []rad : matrise) {
			for(int a : rad) {
				matriseString = matriseString + Integer.toString(a) + " ";
			}
			matriseString += "\n";
		}
		return matriseString;
	}	
	

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int [][]nyMatrise = new int[matrise.length][matrise[0].length];
		for(int rad = 0; rad<matrise.length; rad++) {
			for(int a = 0; a<matrise[rad].length; a++) {
				nyMatrise[rad][a] = matrise[rad][a]*tall;
			}
		}
		return nyMatrise;
	}}
//	// d)
//	public static boolean erLik(int[][] a, int[][] b) {
//
//		
//	}
//	
//	// e)
//	public static int[][] speile(int[][] matrise) {
//
//		
//	
//	}
//
//	// f)
//	public static int[][] multipliser(int[][] a, int[][] b) {
//
//	
//	}
//}
