package q91_100;

public class q96 {

	//dp
	
	//再看一遍三个元素的数组，可以发现BST的取值方式如下：
	//Count[3] = Count[0]*Count[2]  (1为根的情况)
	  //             + Count[1]*Count[1]  (2为根的情况)
	    //           + Count[2]*Count[0]  (3为根的情况)

	//所以，由此观察，可以得出Count的递推公式为
	//Count[i] = ∑ Count[0...k] * [ k+1....i]     0<=k<i-1
	 public int numTrees(int n) {
	 
		int[] countResult = new int[n+1];// remember that 
		
		countResult[0] = 1;
		countResult[1] = 1;
		
		for (int i=2; i<=n; i++) {
			for (int j=0; j<i; j++) {
				countResult[i]+= countResult[j]*countResult[i-j-1];
			}
		}
		
		return countResult[n];
	}
}
