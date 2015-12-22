package q1_10;
public class q6 {

	//great solution, divide by group from one loop;

/*	static char[][] array;

	public static String convert(String s, int nRows) {

		array = new char[nRows][20];
		int curColumn = 0;
		int curRow = 0;
		String result="";

		if (s.equals("")) return "";
		boolean zigFlag = false;
		for (int i = 0; i < s.length(); i++) {

			if (zigFlag)
			{
				array[curRow][curColumn] = s.charAt(i);
				curColumn++;
				curRow--;
				if (curRow == 0)
					zigFlag = false;
			}
			else {
			if (curRow == nRows - 1) {
				array[curRow][curColumn] = s.charAt(i);
				zigFlag = true;
				curColumn++;
				curRow--;
				if (curRow <= 0)
				{
					zigFlag = false;
					curRow=0;
				}
			}
			else {
				array[curRow][curColumn] = s.charAt(i);
				curRow++;
			}

			}
		}

		StringBuffer sb=new StringBuffer();
		for (int i=0; i<nRows; i++)
		{
			sb.append(array[i]);

		}
		System.out.println(sb.toString());
		return sb.toString().replaceAll("\\s","");
	}
*/
	public static String convert(String s, int nRows) {
	int len = s.length();
    if(len<=nRows||nRows<=1) return s; //such condition can't form the zigzag route.

    StringBuilder[] result = new StringBuilder[nRows]; //string buffer array to hold each row's result

    //initialize the string buffer
    for(int i = 0; i < result.length; i++){
        result[i] = new StringBuilder();
    }

    //divide the groups into chunks with size (nRows*2-2).
    int chunk = nRows*2-2; //3->4, 4->6, 5->7, etc.

    for(int i = 0; i < len; i++){
        int group = i%chunk; //get the index of the element in the chunk

        //if they are less then nRows, this element is vertically aligned from top to buttom
        if(group<nRows){
            result[group].append(s.charAt(i));
        }
        //otherwise, it falls onto the slope in reversed direction
        else{
            result[chunk-group].append(s.charAt(i));
        }
    }

    //combine the groups into final array.
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < nRows; i++){
        sb.append(result[i].toString());
    }
    return sb.toString();
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(convert("PAYPALISHIRING",3));
	}

}
