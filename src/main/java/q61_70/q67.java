package q61_70;

//simple one, two pointer from back
public class q67 {

	public String addBinary(String a, String b) {

		int carry = 0;
		String result = "";
		
		int i = a.length()-1;
		int j = b.length()-1;
		
		for(; i >=0 || j>=0; --i,--j)  {
			int ai = 0;
			int bj = 0;
			if (i >= 0) {
				ai = Integer.parseInt(a.substring(i, i+1));
			}
			if (j >= 0) {
				bj = Integer.parseInt(b.substring(j, j+1));
			}

		 int val = (ai+bj+carry)%2;  
		 carry = (ai+bj+carry) /2;  
		 result = val + result;
		}  
		
		if(carry ==1)     {  
			result = "1" + result;
		}
		 
		return result;    
	}
}
