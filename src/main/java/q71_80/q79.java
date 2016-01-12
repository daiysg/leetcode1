package q71_80;

public class q79 {

	//straitforward way, use a 2d array to check the used way, 
	// and get every point and four directions DFS
	 public boolean exist(char[][] board, String word) {
	 
		 if (word == null || word.length() == 0) return true;
		 
		 if (board == null || board.length == 0 || board[0].length == 0) return false;
		 
		 boolean[][] used = new boolean[board.length][board[0].length];  
		 
		 for (int i = 0; i<board.length; i++) {
			 for (int j=0; j<board[0].length; j++) {
				 if(searchFunction(board,word,0,i,j,used))  
		            return true;  
			 }
		 }
		 
		 return false;
	 }

	 //DFS part
	 // classical quiz, binary tree, 
	 //add this,
	 // recursion
	 // not add this.
	private boolean searchFunction(char[][] board, String word, int curIndex, int i,
			int j, boolean[][] used) {
		// TODO Auto-generated method stub
		
		//final leave status
		if (curIndex == word.length()) {
			return true;
		}
		
		//final status
		if (i<0 || j<0 || i>=board.length || j>=board[0].length || used[i][j] || board[i][j]!=word.charAt(curIndex)) {
			 return false; 
		}
        
		//add this
		used[i][j] = true;
		
		//recur
		boolean result = ((searchFunction(board,word,curIndex+1,i+1,j,used)) || (searchFunction(board,word,curIndex+1,i-1,j,used)) || 
				(searchFunction(board,word,curIndex+1,i,j+1,used)) || (searchFunction(board,word,curIndex+1,i,j-1,used)));
		//remove this
		used[i][j] = false;
		
		return result;
	}
	 
}
