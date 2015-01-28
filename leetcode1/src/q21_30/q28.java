package q21_30;

public class q28 {

	 public static int strStr(String haystack, String needle) {
		    if (needle.length()>haystack.length()) return -1;
		    if (needle.length()==0) return 0;

	        for (int i=0; i<=haystack.length()-needle.length(); i++)
	        {
	        	int j=0;
	        	while (needle.charAt(j)==haystack.charAt(j+i))
	        	{
	        		j++;
	        		if (j==needle.length())
	        		{
	        			break;
	        		}
	        	}

	        	if (j==needle.length())
	        		return i;
	        }

	        return -1;
	    }

	 public static void main(String[] args) {
			// TODO Auto-generated method stub

			System.out.println(strStr("21", "21"));
		}
}
