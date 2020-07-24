
/* Interview question  */
/* Return the length of the longest eligible subarray (such that sum of all elements <= target). */
/* Solution = Single for loop */
/* O(n) */
public class findLongetRunningSequeuceForASum {

	public static void main(String[] args) {

		//int[] arr = { 7, 9, 6, 4, 5, 5, 4, 4, 8, 5, 5, 6 };
		int[] arr = { 1, 2, 6, 4, 5, 5, 4, 1, 8, 5, 5, 6 };
		//int[] arr = { 7, 9, 6, 4, 5, 5, 4, 4, 8, 5, 5, 6 };
		int targetSum = 7;
		int result = 0;
		int longestSequence = 0;

		result = findLength(arr, targetSum);

		if (result > longestSequence) {
			longestSequence = result;
		}

		System.out.println("Final Longest length = " + longestSequence);
	}

	static int findLength(int[] arr, int targetSum) {

		int longestLength = 0;
		int temp = 0;
		int longestLengthHolder = 0;
		int counter = -1;
		int j = 0;


		for (int i = 0; i < arr.length; i++) {

			// Add 2 adjacent elements of an array
			
			temp = temp + arr[i];

			// check if the sum is equal to or less than targetSum, .. if it is count the sequence
			if (temp <= targetSum) {
				longestLengthHolder++;
				
			}
			// Collect longest lenght only when the  sum matches target otherwise  we dont want to count sequence  
			if (temp == targetSum) {
				longestLength = longestLengthHolder;
			}

			// if the sum is greater than target .. 
			// Substract the value at the iterator from the sum 
			// This iterator value is the first value of the start of sequence
			// example for targetSum = 7
			// 1,2,3,4,1,6
			//   2,3,4,1,6
			//     3,4,1,6,x
			
			if (temp > targetSum) {

				counter++;
				System.out.println("temp = " + temp + " counter = " + counter + " arr[counter] == " + arr[counter]);
				temp = temp - arr[counter];
				System.out.println("temp = " + temp);

				// this is required.. as what is after Substract the value at the iterator from the sum 
				// result is equal to target.. We do want to count that sequence. 
				if (temp == targetSum) {
					longestLength = longestLengthHolder;
				}
			}

			System.out.println("longestLength = " + longestLength + " longestLengthHolder = " + longestLengthHolder
					+ " temp " + temp + " i = " + i + " counter = " + counter);
		}
		return longestLength;
	}

}
