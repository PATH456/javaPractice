public class RecursionExercises {
    	
	/*
	 * Purpose: sum all values from n down to 1
	 * Parameters: int - n
	 * Returns: int - the sum
	 * Preconditions: n >= 0
	 */
	public static int sum(int n) {
		if (n ==1) {
			return 1;
		} else {
			return n + sum(n-1);
		}
	}
	
	/*
	 * Purpose: sum all values from n^2 down to 1^2
	 * Parameters: int - n
	 * Returns: int - the sum of squares
	 * Preconditions: n > 0
	 */
	public static int sumSquares(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n*n + sumSquares(n-1);
		} 
	}
	
	/*
	 * Purpose: sum all odd values from n down to 1
	 * Parameters: int - n
	 * Returns: int - the sum of odd values
	 * Preconditions: n > 0
	 */
	public static int sumOdd(int n) {
		if (n == 1) {
			return 1;
		} else {
			if (n % 2 == 1) {
				return n + sumOdd(n-2);
			} else {
				n--;
				return n + sumOdd(n-2);
			}
		}
	}
	
	/*
	 * Purpose: get the sum of all values in the array
	 * Parameters: int[] arr - the array
	 * Returns: int - the sum
	 */
	public static int sumArray(int[] arr) {
		if (arr.length == 0) {
			return 0;
		} else if (arr.length == 1) {
		 	return arr[0];
		} else {
			int[] newArray = new int[arr.length-1];
			for (int i = 0; i< newArray.length; i++) {
				newArray[i] = arr[i];
			}
			if (newArray.length == 0) {
				return 0;
			} else {
				return arr[newArray.length] + sumArray(newArray);
			}
		}
	}
	
	/*
	 * Purpose: count the number of negative values found 
	 *          in the array
	 * Parameters: int[] arr - the array
	 * Returns: int - count of negatives values found
	 */	
	public static int countNegative(int[] arr) {
		// TODO: implement this method
		return 0; // so it compiles
	}
	
	/*
	 * Purpose: count the number of values in the array 
	 *          with a value equal to n
	 * Parameters: (int[]) arr - the array
				   (int) n - value to search for
	 * Returns: int - count of elements equal to n
	 */	
	public static int countEqualTo(int[] arr, int n) {
		// TODO: implement this method
		return 0; // so it compiles
	}
	
	/*
	 * Purpose: determine if the values in array are all above n
	 * Parameters: int[] arr - the array
	 *			   int n - threshold elements must be greater than
	 * Returns: boolean - true if all values are greater than n
	 */	
	public static boolean allAbove(int[] arr, int n) {
		// TODO: implement this method
		return false; // so it compiles
	}	


///////////////////////////////////
//		DAY 2 EXERCISES          //
///////////////////////////////////


	/*
	 * Purpose: determine if three elements with value x are found
	 *          in the given array in a row
	 * Parameters: int[] arr - the array, 
	 *             int x - the value to search for three in a row
	 * Returns: boolean - true if there are 3 x's in a row
	 */	
	public static boolean threeXInARow(int[] arr, int x) {
		// TODO: implement this method
		return false; // so it compiles
	}	
	

	/*
	 * Purpose: determine if three elements with the same value in a row
	 * Parameters: int[] arr - the array
	 * Returns: boolean - true if there are 3 of the same value in a row
	 */	
	public static boolean threeInARow(int[] arr) {
		// TODO: implement this method
		return false; // so it compiles
	}	
	
	
	/*
	 * Purpose: determine if there are n elements with the same value in a row
	 * Parameters: int[] arr - the array
	 *             int n - the number in a row to find
	 * Returns: boolean - true if there are n of the same value in a row
	 */	
	public static boolean nInARow(int[] arr, int n) {
		// TODO: implement this method
		return false;
	}	
	
}
