package q1_10;
import java.util.HashMap;


public class q3 {

	 public int lengthOfLongestSubstring(String s)
	 {
		 int maxLength = 0;
		 int startIndex = 0;
		 HashMap<Character, Integer> lastShowMap=new HashMap <Character, Integer>();
	
		 for (int i=0; i<s.length(); i++)
		 {
			if (lastShowMap.containsKey(s.charAt(i))) {
				
				 
                if (maxLength < i - startIndex) {
                    maxLength = i - startIndex;
                }
                
               if (startIndex < lastShowMap.get(s.charAt(i)) + 1) {
                   startIndex = lastShowMap.get(s.charAt(i)) + 1;
               }
                
				
			   lastShowMap.put(s.charAt(i), i);
			}

		 }
		return maxLength;

	 }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
