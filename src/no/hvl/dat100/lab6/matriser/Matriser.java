package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a) FERDIG ////////////////////////////////////////////////
	public static void skrivUt(int[][] matrise) {
		
		for (int[] rad : matrise) {
            for (int kolonne : rad) {
            System.out.print(kolonne + " ");
            }
            System.out.println();
            }
		
	}

	// b) FERDIG ////////////////////////////////////////
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

	// c) //////////////////////////////////////////////////////////
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] gange = matrise;
        int j = 0;

        while (j<gange.length) {

            int[] tabell = gange[j];

            for (int i = 0; i<tabell.length; i++) { 

                tabell[i] = tabell[i]*tall;

                 } 

            gange[j]= tabell;
            j++;
        }
	return gange;
	}

	// d) //////////////////////////////////////////////////////////
	public static boolean erLik(int[][] a, int[][] b) {

		boolean resultat = true;
		   int i = 0;
		   
		   while ((resultat == true)&&((i<a.length-1)&&(i<b.length-1))) {
			   
			   int[] tabell = a[i];
			   int[] tabell2 = b[i];
			   
			   if (!(tabell[i] == tabell2[i])) {
				   resultat = false; 
			   }
			   i++;		
					
         }
		    return resultat;
		   
	}
	
	// e) IKKE VALGT Å GJØRE ///////////////////////////////////////
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f) IKKE VALG Å GJØRE /////////////////////////////////////
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
