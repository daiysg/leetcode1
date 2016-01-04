package q61_70;

//maths quiz, the result should be (m+n-2)!/(m-1)!(n-1)!
// below shows the way to calculate this value, get the min of m-1 and n-1, then calculate from m+n-2 to the small one, and i
public class q62 {

	public int uniquePaths(int m, int n) {
		
		long result = 1;
		
	     for(int i=0;i<Math.min(m-1,n-1);i++)
	         result = result*(m+n-2-i)/(i+1); 
	     return (int)result;
	}
	
}
