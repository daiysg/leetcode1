package q51_60;

import java.util.ArrayList;
import java.util.List;

//DFS questions, classic one


//the trick: use int[]columnNumber to record the col Number of Queens
//every row need to choose one;
//so for DFS, set base first, then for loop for branch, check if can added, if so go to deep 
public class q51 {

	// first set judgement way
    // need to check from row 0 to row curCheck, remember that just one loop is enough.
    public boolean checkOK(int[] columnForRow, int curCheck) {
        for (int i=0; i<curCheck; i++) {
            if(columnForRow[curCheck]==columnForRow[i] || Math.abs(columnForRow[curCheck]-columnForRow[i])==curCheck-i)  
                    return false;
 
        }
        
        return true;
    }
    

    public List<List<String>> solveNQueens(int n) {
        
      List<List<String>> result = new ArrayList<List<String>>();
    
      List<String> sequence = new ArrayList<String>();
     
      int[] columnNumber = new int[n];
      
      
      DFS(n, 0, result, sequence, columnNumber);
      
      return result;
    }
    
    public void DFS(int n, int row, List<List<String>> result, List<String> sequence, int[] columnNumber) {
        
        // check final row
        if (row == n) {
            for (int i = 0; i < n; i++) {
            StringBuffer s = new StringBuffer();
            for (int j = 0; j < n; j++) {
                if (columnNumber[i] == j)
                    s.append("Q");
                else
                    s.append(".");
                }
            sequence.add(s.toString());
            }
            
            result.add(new ArrayList<String>(sequence));
            sequence.clear();
        } else {
            // check every add cases, if can go to deep
            for (int i = 0; i < n; i++) {
              columnNumber[row] = i;
            if (checkOK(columnNumber, row)) {
                DFS(n, row + 1, result, sequence, columnNumber);
            }
        }
        }
    }
}
