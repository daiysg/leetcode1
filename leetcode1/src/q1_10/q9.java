package q1_10;
public class q9 {

	// remember to consider 100021 case; after deleting 1 and 1 it is 0002 and will equals to 2; need to add
	// remember the way to get totalspace 8421 way;
 public static boolean isPalindrome(int x) {

		 int totalDigit = totalDigit(x);
		 if (x < 0)
				return false;
		 if (x==11)
			 return true;
	     if ((x>=0) && (x<=9))
	         return true;
		else if (x<20)
	    	return false;
		 return isPalindromeRecursion(x, totalDigit);
		}

	 private static boolean isPalindromeRecursion(int x, int totalDigit)
	 {
			for (int i=1; i<=totalDigit/2; i++)
			{
			    int tail = getDigit(x, i);
			    int head = getDigit(x, totalDigit+1-i);
			    if (head!=tail) return false;
			}

			return true;
	 }

	 private static int getDigit(int number, int digit)
	 {
		 number=(int) (number/Math.pow(10, digit-1));
		 return number-(number/10)*10;
	 }

		private static int totalDigit(int i) {
			// TODO Auto-generated method stub

			int n = 1;
			while (i > 9) {
				if (i >= 100000000) {
					i /= 100000000;
					n += 8;
				}
				if (i >= 10000) {
					i /= 10000;
					n += 4;
				}
				if (i >= 100) {
					i /= 100;
					n += 2;
				}
				if (i >= 10) {
					i /= 10;
					n += 1;
				}
			}
			return n;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			System.out.println(isPalindrome(12321));

		}

}
