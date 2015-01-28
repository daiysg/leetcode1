package q1_10;
import java.util.HashMap;
import java.util.Map;


//Please note that cannot use Arrays.contains to find not intuitive value int;
//e.g. Arrays.asList(arrays).contains(int) does not work, should convert int to be integer

public class q1 {

	/**
	 * @param args
	 */

	public int[] twoSum(int[] numbers, int target) {
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < numbers.length; ++i) {
	            map.put(numbers[i], i);

	    }

	    for (int i = 0; i < numbers.length; ++i) {
	        int gap = target - numbers[i];
	        if (map.containsKey(gap)) {
	            int j=map.get(gap);
	                if (j > i) {
	                    return new int[] { i + 1, j + 1};
	                }
	            }
	        }
	    return new int[] { -1, -1 };
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
