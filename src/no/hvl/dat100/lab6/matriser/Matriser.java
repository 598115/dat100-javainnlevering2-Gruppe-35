package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("skrivUt ikke implementert");
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String print = "";
		int j = 0;
		
		while (j<matrise.length) {
			
				int[] tabell = matrise[j];																		
			
				for (int i = 0; i<tabell.length; i++) { 
					
				     print += tabell[i] + " ";
			     } 
				print += "\n";
				j++;
		}
				
				return print;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("erLik ikke implementert");
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
