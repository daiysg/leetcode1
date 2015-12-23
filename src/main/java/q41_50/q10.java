package q41_50;

public class q10 {

	
	// recursion way
	// 1. consider special case, 1. empty; 2. last one (to avoid p.charAt(1) out of range)
	// if more then one, check p(1) =='*', if no, compare current digit;
	// if so, improve s and keep p until s match p start from 2.
	 public boolean isMatch(String s, String p) {
		 
		 if (p.length() == 0) 
			 return s.length() == 0;
		 
		 //last digit problem except *
		 if (p.length() == 1) {
			 if (s.length() == 1 && (p.charAt(0) == s.charAt(0) || p.charAt(0)=='.')) 
				 return true;
			 else 
				 return false;
		 }
		 
		 //next star as *, 
		 if (p.charAt(1) == '*') {
			 
			 //check after * result for p
			 if (isMatch(s, p.substring(2)))
				 return true;
			 
			 if (s.length()>0) { 
				 if (p.charAt(0) == '.' || s.charAt(0) == p.charAt(0)) {
					 return isMatch(s.substring(1), p);
				 } else {
					 return false;
				 }
				 
			 } else {
				 return false;
			 }
		 } else {
			 if (s.length()>0) { 
				 if (p.charAt(0) == '.' || s.charAt(0) == p.charAt(0)) {
					 return isMatch(s.substring(1), p.substring(1));
				 } else {
					 return false;
				 }			 
			 } else {
				 return false;
			 }
		 }
	        
	 }
}
