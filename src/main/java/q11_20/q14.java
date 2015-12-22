package q11_20;

public class q14 {

	public static String longestCommonPrefix(String[] strs) {
		int curIndx = 1;
		if (strs.length==1) return strs[0];
		if (strs.length==0) return "";
		String result = "";
		if (strs[0].length()==0) return "";
		result = strs[0].substring(0, curIndx);
		while (curIndx <= strs[0].length()) {
			result = strs[0].substring(0, curIndx);
			for (int i = 1; i < strs.length; i++) {
				if (strs[i].length()<curIndx) 
					return result.substring(0, result.length() - 1);
				if (strs[i].substring(0, curIndx).equals(result) == false) {
					return result.substring(0, result.length() - 1);
				}
			}
			curIndx++;		
		}

		return strs[0];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strs={"ab","a"};
		System.out.println(longestCommonPrefix(strs));
	}
}
