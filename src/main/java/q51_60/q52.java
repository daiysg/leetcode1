package q51_60;


// seems as different, but actually the same as q51
public class q52 {
	
	 int result = 0;
	
	 public int totalNQueens(int n) {
	 
		
		 int[] columnNumber = new int[n];
		 
		 DFS(0, columnNumber, n);
		 
		 return result;
	        
	 }
	 
	 public void DFS(int currentRow, int[] columnNumber, int totalRow) {
		 if (currentRow == totalRow) {
			 result++;
			 return;
		 } else {
			 for (int i = 0; i< totalRow; i++) {
				 columnNumber[currentRow] = i;
				 if (checkValid(columnNumber, currentRow)) {
					 DFS(currentRow+1, columnNumber, totalRow);
				 }
			 }
			 
			 return;
			
		 }
	 }
	 
	 public boolean checkValid(int[] columnNumber, int currentRow) {
		 
		 for (int i=0; i< currentRow; i++) {
			 if ((columnNumber[i] == columnNumber[currentRow]) || (Math.abs(columnNumber[i] -columnNumber[currentRow]) == currentRow - i)) {
				 return false;
			 }
		 }
		 
		 return true;
	 }
}
