package q51_60;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class q56 {

	public class Interval {
		   int start;
		    int end;
		    Interval() { start = 0; end = 0; }
		    Interval(int s, int e) { start = s; end = e; }
	}
	
	public List<Interval> merge(List<Interval> intervals) {
		ArrayList<Interval> result = new ArrayList<Interval>();  
		
		if (intervals == null ) return result;
		if (intervals.size() == 0) return result;
		
		//sort 
		Collections.sort(intervals, new IntervalsComparator());
		
		// merge, pass from left to right
		for (int i=0; i< intervals.size()-1; i++ ) {
			Interval left = intervals.get(i);
			Interval right = intervals.get(i+1);
			
			// easy case
			if (right.start > left.end) {
				result.add(left);
				
			// case 2, (1, 3) ->(2, 4) should be (1, 4)
				// then the left one should be thrown away
			} else if (right.start <= left.end && right.end > left.end) {
				right.start = left.start;
				// case 2, (1, 4) ->(2, 3) should be (1, 4)
			} else if (right.start <= left.end && right.end <= left.end) {
				right.start = left.start;
				right.end = left.end;
			}
		}
		
		result.add(intervals.get(intervals.size()-1));
		
		return result;
    }
	
	 private static class IntervalsComparator implements Comparator<Interval> {  
		  
	       public int compare(Interval o1, Interval o2) {  
	            return o1.start - o2.start;  
	       }  
	  }  
}
