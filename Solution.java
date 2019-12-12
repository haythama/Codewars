
public class Solution {
	
	
	// isSquare challange
	// Hint: 3.00 = 3 , 3.01 != 3 . 
	public static boolean isSquare(int n){
		System.out.println(n +" is square?");
		return Math.sqrt(n) == (int) Math.sqrt(n);
		
	}
	
	// Complementary DNA
	
	  public static String makeComplement(String dna) {

		  String newDna = "";
		  
		  char[] dnaArray = new char[dna.length()];
		  dnaArray = dna.toCharArray();
		  for(int i = 0 ; i < dnaArray.length ; i++){
			  
			  if(dnaArray[i] == 'A')
				  newDna += 'T';
			  
			  if(dnaArray[i] == 'T')
				  newDna += 'A';
			  
			  if(dnaArray[i] == 'C')
				  newDna += 'G';
			  
			  if(dnaArray[i] == 'G')
				  newDna += 'C';
			 		    
		  }
		  
		  return newDna;

	  }
	
