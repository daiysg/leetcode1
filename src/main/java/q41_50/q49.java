package q41_50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


//remember: 1. string.toCharArray();
//          2. map.keySet();
//          3. for map value as list, no need to add back

public class q49 {

	public List<List<String>> groupAnagrams(String[] strs) {
        
		HashMap <String, List<String>> resultMap = new HashMap<String, List<String>>();
		
		for (String str:strs) {
			String key = splitAndReorderString(str);
			
			if (resultMap.containsKey(key)) {
				List<String> curResult = resultMap.get(key);
				curResult.add(str);	//since list, no need to add back	
			} else {
				List<String> newResult = new ArrayList<String>();
				newResult.add(str);
				resultMap.put(key, newResult);
			}
		}
		
		List<List<String>> results = new ArrayList<List<String>>();
		
		for (String k: resultMap.keySet()) {
			List<String> result = resultMap.get(k);
		    Collections.sort(result);
		    
		    results.add(result);
		}
		
		return results;
		
    }
	
	public String splitAndReorderString (String input) {
		  char[] c = input.toCharArray(); 
		  Arrays.sort(c);
		  return String.valueOf(c);
	}
}
