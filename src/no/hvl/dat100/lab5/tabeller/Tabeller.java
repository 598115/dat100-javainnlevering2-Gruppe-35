package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a) FERDIG //////////////////////////////////////////////////////////////////////////
	public static void skrivUt(int[] tabell) {
		
String print = "";
		
		for (int i = 0; i<tabell.length; i++) { 
			
		     print += "Tall " + i + ":  " + tabell[i] + "\n";

	     } 
		
		System.out.println(print);
} 
	
	// b) FERDIG //////////////////////////////////////////////////////////////////////////
	public static String tilStreng(int[] tabell) {
		
String tabellVerdier = "";
		
		for (int i = 0; i<tabell.length; i++) { 
			
		     tabellVerdier += tabell[i];
		     
		  if (i<(tabell.length-1)) {   
			  
			  tabellVerdier += ",";
			  
		 } 
 }		
		
		String print = "[" + tabellVerdier + "]";
		
		return print;
}

	// c) FERDIG /////////////////////////////////////////////////////////////////////////////
	public static int summer(int[] tabell) {

		/// FOR LØKKE
		int sumFor = 0;
		
		   for (int i = 0; i<tabell.length; i++) {
			   
			   sumFor += tabell[i];

			}
		       
		       
		 //// WHILE LØKKE
	int sumWhile = 0;
	int j = 0;
			
	while (j < tabell.length) {
			   
           sumWhile += tabell[j];
		   j++;
	 } 
		            
		       
		///////// UTVIDET FOR LØKKE       
		   	int sumForu = 0;	
			
			for(int k: tabell) {
				
				sumForu += k;
				
		     }
	int returnValue = (sumFor + sumForu + sumWhile) - (sumFor + sumWhile);		       
	return returnValue;
		       		       
}    

	// d) FERDIG /////////////////////////////////////////////////////////////////////////
	public static boolean finnesTall(int[] tabell, int tall) {	
		
		boolean funnet = false;	
		
		for (int i = 0; i<tabell.length; i++) {
			
			 if (tabell[i] == tall) {
				funnet = true;
			 }

	     }	
		return funnet;	
	}

	// e) FERDIG ////////////////////////////////////////////////////////////////////////////
	public static int posisjonTall(int[] tabell, int tall) {

	    int posisjon = 0;	
		boolean funnet = false;	
		int i = 0;
		
		while ((funnet != true)&&(i<tabell.length)) {
			
		      if (tabell[i] == tall) {
		    	  funnet = true;
		      }
			     if (funnet == true) {
			    	 posisjon = i;
			     } else posisjon = -1;
			i++;
	     }	
		
		return posisjon; 
		
	}

	// f) FERDIG ////////////////////////////////////////////////////////////////////////////
	
	public static int[] reverser(int[] tabell) {

		 int[] tabellRevers = new int[tabell.length];
		    int j = tabell.length-1;
		    
		    for (int i = 0; i<tabell.length; i++) {
		    	
		    	tabellRevers[j] = tabell[i];
		    	j--;
		    	  	
		    }
	return tabellRevers;    
 }

	// g) FERDIG ////////////////////////////////////////////////////////////////////////////////
	public static boolean erSortert(int[] tabell) {

		 boolean resultat = true;
		   int i = 0;
		   
		   while ((resultat != false)&&(i<tabell.length-1)) {
			   
			   if(tabell[i]>tabell[i+1]) {
				   resultat = false; 
			   }
			   i++;		
 }
		   return resultat;
}		   

	// h) FERDIG /////////////////////////////////////////////////////////////////////////
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
	int tabellKomb[] = new int[tabell1.length + tabell2.length];
	int j = 0;
		    
		    for (int i = 0; i<tabellKomb.length; i+=2) {
		    	
		    	tabellKomb[j] = tabell1[j];
		    	tabellKomb[j+tabell1.length] = tabell2[j];
		    	
		    	j++;
             }
	return tabellKomb;	    
 }
}	
