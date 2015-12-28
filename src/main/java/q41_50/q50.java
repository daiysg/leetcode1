package q41_50;

//simple quiz, binary 
//let r = pow(x, n/2)
//if n is odd, return r*r
//else return r*r*x;
public class q50 {

	 public double myPow(double x, int n) {
         boolean sign = true;
         if (n<0) {
             sign = false;
             n = n *(-1);
         }
         if (x == 0 ) return 0;
         if (n == 0 ) return 1;
         if (x == 1 ) return 1;
         
         double result = powRecursion(x, n);
         
         if (!sign) {
             return 1/result;
         } else {
             return result;
         }
    }
    
    
    public double powRecursion(double x, int n) {
         if (n == 0 ) return 1;
         
         double tempResult = powRecursion(x , n/2);
         if(n % 2 == 0) {
             return tempResult*tempResult;
         } else {
             return tempResult*tempResult*x;
         }
    }
}
