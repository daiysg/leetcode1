package q91_100;

public class q91 {

	// dp way
	//Count[i] = Count[i-1]  if S[i-1] is a valid char
	//or   = Count[i-1]+ Count[i-2]  if S[i-1] and S[i-2] together is still a valid char. 
	 public int numDecodings(String s) {
	 
		 if (s.length() == 0) return 0;
		 if (s.length() == 1 && s.charAt(0) != '0') return 1;
		 
		 if (s.charAt(0) == '0') return 0; 
	
		 
		 int fn=0, fn_1=0, fn_2=1;    
		 fn_1 = check(s.charAt(0)) * check(s.charAt(1))+  check(s.charAt(0), s.charAt(1));    
		 
		
		 for (int i=2; i<s.length(); i++) {
			 if(check(s.charAt(i))!=0) 
				 fn+= fn_1;  
			 
			 if(check(s.charAt(i-1), s.charAt(i))!=0)
				 fn+=fn_2; 
			 
			 if(fn ==0)   
				 return 0;  // cannot decode
			
			 fn_2 = fn_1;  
			fn_1 = fn;  
			fn=0;     
		 }
		 
		return fn_1;
	 }
	 
	
	public int check(char one) {
		return (one != '0') ? 1 : 0;
	}

	public int check(char one, char two) {
		return (one == '1' || (one == '2' && two <= '6')) ? 1 : 0;
	}
}
