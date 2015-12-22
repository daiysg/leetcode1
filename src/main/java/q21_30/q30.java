package q21_30;

public class q30 {

	 public List<Integer> findSubstring(String S, String[] L) {
	        List<Integer> list = new LinkedList<>();
	        int n = L.length;

	        if (n == 0)
	            return list;

	        int lenS = S.length();
	        int lenL = L[0].length();

	        if (lenS==0 || lenL==0 || lenS<lenL*n)
	            return list;

	        // Use HashMap to store 'L': String and appearsing times in L.
	        // Note: L may have some duplicates, we can't use HashSet just to store 'String' value.
	        Map<String, Integer> map = new HashMap<>();

	        for (String str : L)
	        {
	            if (!map.containsKey(str))
	                map.put(str, 1);
	            else
	                map.put(str, map.get(str)+1);
	        }

	        for (int i = 0; i < lenS-lenL*n+1; i++)
	        {
	            Map<String, Integer> copyMap = new HashMap<>(map);

	            int j = i;

	            // Search range from i to i+lenL*n-1
	            while (j <= i+lenL*(n-1))
	            {
	                String searched = S.substring(j, j+lenL);

	                if (copyMap.containsKey(searched))
	                {
	                    if (copyMap.get(searched) == 1)
	                        copyMap.remove(searched);
	                    else
	                        copyMap.put(searched, copyMap.get(searched)-1);
	                }
	                else
	                    break;

	                j += lenL;
	            }

	            if (copyMap.isEmpty())
	                list.add(i);
	        }

	        return list;
	    }
}
