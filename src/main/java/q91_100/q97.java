package q91_100;

public class q97 {


	//Match[i][j]
	//	    =   (s3.lastChar == s1.lastChar) && Match[i-1][j]
	//	      ||(s3.lastChar == s2.lastChar) && Match[i][j-1]
	
	//dp, use 2d arrau
	public boolean isInterleave(String s1, String s2, String s3) {
    
		if (s1 == null || s2 == null || s3== null) return false;
				
		if(s3.length() != (s1.length() + s2.length())) return false;  
		
		boolean [][] match= new boolean[s1.length()+1][s2.length()+1];
		
		match[0][0] = true;
		// beginning of s1
		 for( int i = 1; i <= s1.length(); i++ ) {
	            if (s1.charAt(i-1) == s3.charAt(i-1)) {
	                match[i][0] = true;
	            } else 
	                break;
		 }
	        
		 //beginning of s2
		 for( int i = 1; i <= s1.length(); i++ ) {
	            if (s2.charAt(i-1) == s3.charAt(i-1)) {
	                match[0][i] = true;
	            } else 
	                break;
		 }	

		 // rest 
		 for(int j = 1; j<= s1.length() +1; j++)  {
			 char c1 = s1.charAt(j-1);
			 
			 for (int k=1; k<s2.length()+1; k++) {
				 char c2 = s2.charAt(k-1);
				 
				 char c3 = s3.charAt(j+k-1);
				 
				 if (c1 == c3) {
					 match[j][k] = match[j - 1][k] || match[j][k];
				 }
				 
				 if (c2 == c3) {
					 match[j][k] = match[j][k - 1] || match[j][k];
				 }
			 }
		 }
			 
		 return match[s1.length()][s2.length()]; 						
    }
}
