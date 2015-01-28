package q1_10;
// need to consider integer overflow situation
// For integer, should be below 2^31-1;
public class q7 {

	 public int reverse(int x) {

	        if (x>Integer.MAX_VALUE) return 0;
	        int result=0;
	        boolean negative=false;
	        if (x<0)
	        {
	            x=x*(-1);
	            negative=true;
	        }

	        while (x>0)
	        {
	            if (result*10>Math.pow(2.0, 32)) return 0;
	            result=result*10+(x%10);
	            x=x/10;
	        }

	        if (negative) result=result*(-1);

	        return result;
	    }
}
