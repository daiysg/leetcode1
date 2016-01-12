package q71_80;

public class q80 {

	// same as remove duplicate 1, only different is start from 2 and compare i and end-1;
	// same answer, two pointer
	public int removeDuplicates(int[] A) {
		if (A.length< 3) return A.length; // in 1; A.length<2
		
		 int end = 1;
		for (int i=2; i<A.length; i++) {
			// in 1; A[i] != A[end]
			if (A[i]!= A[end-1])  {
				end++;
				A[end] = A[i];
			}
		}
		
		return end+1;
		
	}
}
