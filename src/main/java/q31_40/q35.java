package q31_40;

//binary search
public class q35 {
    public int searchInsert(int[] A, int target) {
    	  int low = 0;
    	  int high = A.length-1;
          while(low<=high){
              int mid = (low+high)/2;
              if(A[mid] == target) return mid;
              else if(A[mid] > target) high = mid-1;
              else low = mid+1;
          }
          // make sure cannot return high~~
          return low;
    }
}
