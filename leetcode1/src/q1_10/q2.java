package q1_10;
import java.awt.List;
import java.util.ArrayList;

public class q2 {

	// Pay attention to (2+3)/2=2 for int; need to declare double first!!;
	// Consider to insert all into one List with sequence and get the result;
	public static double findMedianSortedArrays(int A[], int B[]) {
		int length = A.length + B.length;
		ArrayList<Integer> resultList=new ArrayList<Integer>();
		int i = 0, j = 0;


		for (int k = 0; k < length; k++) {
			if (i == A.length)
			{
				resultList.add(B[j]);
				j++;
			}
			else if (j == B.length)
			{
				resultList.add(A[i]);
				i++;
			}
			else if (A[i] < B[j])
			{
				resultList.add(A[i]);
				i++;
			}
			else if (A[i]>B[j])
			{
				resultList.add(B[j]);
				j++;
			}
			else
			{
				k++;
				resultList.add(A[i]);
				resultList.add(B[j]);
				j++;
				i++;
			}
		}

		if (length%2!=0)
			return resultList.get(length/2);
		else
			return (new Double(resultList.get(length/2-1))+new Double(resultList.get(length/2)))/2;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {};
		int[] B = { 1};
		double result = findMedianSortedArrays(A, B);
		System.out.println(result);
	}

}
