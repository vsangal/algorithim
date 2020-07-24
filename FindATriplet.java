public class FindATriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,-2,7,5,9,10,19};
		findTriplets(arr);
		
	}
	
	static void findTriplets(int[] arr) {
		
		int i = 0;
		int j = i + 1;
		int k = j + 1;
		boolean found = false;
		
		for (i = 0; i < arr.length; i++) {

				if (arr[i] + arr[j] == arr[k]) {
					System.out.println("Sum of index " + i + " and " + j + " found at index " + k);
					found = true;
				}
				if (k+1 >= arr.length ) {
					break;
				}else {
					k++;
					j++;
				}
				
			}
		if (!found) {
			System.out.println("Triplet Not found");
		}
	}

}
