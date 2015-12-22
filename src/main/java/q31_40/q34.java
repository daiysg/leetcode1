package q31_40;

public class q34 {

	public int[] searchRange(int[] A, int target) {
        int[] range = new int[2];
        if(A.length==0){return range;}
        range[0] = A[0]==target?0:binarySearch(A, target, true);
        range[1] = A[A.length-1]==target?A.length-1:binarySearch(A, target, false);
        return range;
    }

    private int binarySearch(int[] A, int target, boolean downOrUp){
        int begin = 0, end = A.length-1;
        int middle = 0;

        //iterative binary~
        while(begin < end){
            middle = (begin+end)/2;
            // find lower bound
            if(A[middle] < target && A[middle+1] == target && downOrUp)
                return middle+1;
            if(A[middle+1] < target && downOrUp)
                begin = middle+1;
            if(A[middle+1] >= target && downOrUp)
                end = middle;
            // find upper bound
            if(A[middle] == target && A[middle+1] > target && !downOrUp)
                return middle;
            if(A[middle] <= target && !downOrUp)
                begin = middle+1;
            if(A[middle] > target && !downOrUp)
                end = middle;
        }
        return -1;
    }
}
