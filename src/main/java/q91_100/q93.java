package q91_100;

import java.util.ArrayList;
import java.util.List;

public class q93 {

	// recursive and backtrack way
	  public List<String> restoreIpAddresses(String s) {
		  List<String> result = new ArrayList<String>();
		  
		  if (s==null || s.length()<4|| s.length()>12)
			  return result;
		  
		  restoreIpAddresRecursion(result, "", 0, s, 0);
		  
		  return result;
	  }

	private void restoreIpAddresRecursion(List<String> result, String curIp,
			int i, String s, int j) {
		// TODO Auto-generated method stub
		
		//final special cases
		if (i==4) {
			if (j == s.length()) {
				result.add(curIp.substring(0, curIp.length()-1));
				return;
			}
			
			return;
		}
		
		//final case, cannot work
		if (j == s.length() && i<4) return;
		
		//recursive way, the thing to remember is cannot change any s, j to cause error
		restoreIpAddresRecursion(result, curIp + s.substring(j, j + 1) + ".", i + 1, s, j + 1); // 1 digit
        if (j + 1 < s.length() && s.charAt(j) != '0')
        	restoreIpAddresRecursion(result, curIp + s.substring(j, j + 2) + ".", i + 1, s, j + 2); // 2 digits
        if (j + 2 < s.length() && s.charAt(j) != '0' && Integer. parseInt(s.substring(j, j + 3)) < 256) // 3 digits
        	restoreIpAddresRecursion(result, curIp + s.substring(j, j + 3) + ".", i + 1, s, j + 3);
		return;
	}
}
