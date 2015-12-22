
package q21_30;

public class q29 {

	public int divide(int dividend, int divisor) {
	    if (dividend == 0)
	        return 0;
	    if (divisor == 1)
	        return dividend; 
	    boolean positive = (dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0);
	    long absDividend = dividend < 0 ? 0 - (long) dividend : (long) dividend;
	    long absDivisor = divisor < 0 ? 0 - (long) divisor : (long) divisor;
	    int result = dividePositive(absDividend, absDivisor, absDivisor);
	    return positive ? result : 0 - result;
	}
	private int dividePositive(long p, long q, long originalDivisor) { // p / q
	    if (p < q)
	        return 0; 
	    int result = 0;
	    int e = 0;
	    while (p >= q) { 
	        result += 1 << e;
	        p -= q;
	        q = q << 1;
	        e++;
	    }
	    return p > 0 ? result + dividePositive(p, originalDivisor, originalDivisor) : result;
	 }
}
