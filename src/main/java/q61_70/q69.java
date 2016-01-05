package q61_70;



public class q69 {

	// great solution newton method;
	//https://en.wikipedia.org/wiki/Newton%27s_method
	public int mySqrt(int x) {

		 if (x == 0) return 0;
		 long i = x;
		  while(i > x / i)  
		     i = (i + x / i) / 2;            
		  return (int)i;
	}
}
