/* Interview question */
/* Return the length of the longest eligible subarray (such that sum of all elements <= target). 
 * Double loop
 * O(n2)
 */

public class FindLongestSequenceForGivenTarget {

	public static void main(String[] args) {

		int[] arr = { 9,6,1,3,2,7 };
		int target = 5;
		int startIndx = 0;
		int result = 0;
		int longestSequence = 0;

		while (startIndx < arr.length) {
			result = findLength(arr, target, startIndx);
			startIndx++;
			if (result > longestSequence) {
				longestSequence = result;
			}
		}

		System.out.println("Final Longest length = " + longestSequence);
	}

	static int findLength(int[] arr, int target, int startIndx) {

		int longestLength = 0;
		int temp = 0;

		for (int i = startIndx; i < arr.length - 1; i++) {

			// Check to see the element in array is already greater than or equal to target
			// if it is length is now 1 and no need to add more elements. exit out

			if (arr[i] > target) {
				longestLength = 1;
				break;
			}
			// if current element in the loop is smaller than target value. 
			// Sum the previous value with current element 
			
			if (arr[i] <= target) {
				temp = temp + arr[i];
			}
			
			// Check if sum of elements is still less than target value
			// increase the length if it is. 
			if (temp <= target) {
				longestLength++;
			}
			
			//System.out.println("Longest length = " + longestLength);
		}
		return longestLength;
	}
}
//
// [9,6,1,3,2,7]
//.
//.   target = 5
//.   [ 7, 1, 3, 1, 2, 1, 1, 4, 1]
//      -
//         [-----]prevvalue-1+2
//           [value]
//
//

//. Outer loop
//. N
// Inner loop
// N N-1 N-2 N-3 N-4 ... 1
//
// 0.5N^2 ~= N^2
//
//
//
// [6,1,3,2,7]
// [6] [1] [3] ... [6,1] [1,3] ... [6,1,3,2,7] NOT: [1,2]
// target=6
//
// 
//
