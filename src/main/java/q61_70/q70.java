package q61_70;

public class q70 {

	// p(n) = p(n-1) + p(n-2);
	public int climbStairs(int n) {
	    //p1: number of ways to reach i - 1
	    //p2: number of ways to reach i - 2
	    //cur number of ways to reach i
	    int p1 = 1, p2 = 0, cur = 0;

	    for (int i = 1; i <= n; i++){
	        cur = p1 + p2;
	        p2 = p1;
	        p1 = cur;
	    }
	    return cur;
	}
}
