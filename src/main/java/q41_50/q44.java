package q41_50;


//simpler than q10

//solution, two point for two string

//for p, , if "?" s+1; otherwise, both need match or have * to go next not * place.
// the trick part is we do not know how many digit the * should cover.
// but no need to worry, just put the back flag to let it become true to cover as much as we can.
// finally need to compare whether both run out.



public class q44 {

	 public boolean isMatch(String s, String p) {
		 
		 	if (s==null || p == null) return false;
	    
	        int sIndex = 0;
	        int pIndex = 0;
	        
	        int preS = 0;
	        int preP = 0;
	                
	        boolean back = false; // record for this pick
	        
	        while (sIndex<s.length()) {
	        	 if (pIndex<p.length() && (p.charAt(pIndex) == s.charAt(sIndex) || p.charAt(pIndex) == '?')) {
	        		sIndex++;
	        		pIndex++;
	        		back = false;
	        	} else if (pIndex<p.length() && p.charAt(pIndex) == '*') {
	        		while (pIndex<p.length() && p.charAt(pIndex) == '*') {
	        			pIndex++;
	        		}
	        		
	        		if (pIndex == p.length()) 
	        			return true;
	        		
	        		 back = true;
	        		 preS = sIndex;
	        		 preP = pIndex;
	        	} else if (back) {
	        		 sIndex = ++preS;
	        		 pIndex = preP;
	        		
	        	} else {
	        		return false;
	        	}
	        }
	        
	        // pass all star at the end of P
	        while (pIndex < p.length() && p.charAt(pIndex) == '*') {
	        	pIndex++;
	        }
	        
	        if (sIndex == s.length() && pIndex == p.length()) return true;
	        else {
	        	return false;
	        }
	        
	 }
	 
	 
	 
}
