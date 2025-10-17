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
		return sumArrayHelper(arr, 0);
	}
		
	public static int sumArrayHelper(int[] arr, int index) {
		if (index == arr.length) {
			return 0;
		} else {
			return arr[index] + sumArrayHelper(arr, index+1);
		}
	}


	
	/*
	 * Purpose: count the number of negative values found 
	 *          in the array
	 * Parameters: int[] arr - the array
	 * Returns: int - count of negatives values found
	 */	
	public static int countNegative(int[] arr) {
		return countNegativeHelper(arr, 0);
	}
	public static int countNegativeHelper(int[] arr, int index) {
		if (index == arr.length) {
			return 0;
		} else {
			if (arr[index] < 0) {
				return 1 + countNegativeHelper(arr, index+1);
			} else {
				return countNegativeHelper(arr, index+1);
			}
		}
	}

	
	/*
	 * Purpose: count the number of values in the array 
	 *          with a value equal to n
	 * Parameters: (int[]) arr - the array
				   (int) n - value to search for
	 * Returns: int - count of elements equal to n
	 */	
	public static int countEqualTo(int[] arr, int n) {
		return countEqualToHelper(arr, n, 0);
	}
	public static int countEqualToHelper(int[] arr, int n, int index) {
		if (index == arr.length) {
			return 0;
		} else {
			if (arr[index] == n) {
				return 1 + countEqualToHelper(arr, n, index+1);
			} else {
				return countEqualToHelper(arr, n, index+1);
			}
		}
	}
	
	/*
	 * Purpose: determine if the values in array are all above n
	 * Parameters: int[] arr - the array
	 *			   int n - threshold elements must be greater than
	 * Returns: boolean - true if all values are greater than n
	 */	
	public static boolean allAbove(int[] arr, int n) {
		return allAboveHelper(arr, n, 0);
	}	
	public static boolean allAboveHelper(int[] arr, int n, int index) {
		if (index == arr.length) {
			return true;
		} else {
			if (arr[index] > n) {
				return allAboveHelper(arr, n, index+1);
			} else {
				return false;
			}
		}
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
		if (arr.length < 3) {
			return false;
		} else {
			return threeInARowHelper(arr, x, 1);
		}
	}	
	public static boolean threeInARowHelper(int[] arr, int x, int index) {
		if (index+1 == arr.length) {
			return false;
		} else {
			int prev = arr[index-1];
			int cur = arr[index];
			int next = arr[index+1];
			if (prev == x && cur == x && next == x) {
				return true;
			} else {
				return threeInARowHelper(arr, x, index+1);
			}
		}
	}
	

	/*
	 * Purpose: determine if three elements with the same value in a row
	 * Parameters: int[] arr - the array
	 * Returns: boolean - true if there are 3 of the same value in a row
	 */	
	public static boolean threeInARow(int[] arr) {
		if (arr.length < 3) {
			return false;
		} else {
			return threeInARowHelper(arr, 1);
		}
	}	
	public static boolean threeInARowHelper(int[] arr, int index) {
		if (index+1 == arr.length) {
			return false;
		} else {
			int prev = arr[index-1];
			int cur = arr[index];
			int next = arr[index+1];
			if (prev == cur && cur == next) {
				return true;
			} else {
				return threeInARowHelper(arr,index+1);
			}
		}
	}
	
	/*
	 * Purpose: determine if there are n elements with the same value in a row
	 * Parameters: int[] arr - the array
	 *             int n - the number in a row to find
	 * Returns: boolean - true if there are n of the same value in a row
	 */	
	public static boolean nInARow(int[] arr, int n) {
		if (arr.length == 0 && n == 0) {
			return true;
		} else {
			return nInARowHelper(arr, n, 0);
		}
	}

	public static boolean nInARowHelper(int[] arr, int n, int index) {
		if (index == arr.length || arr.length == 0) {
			return false;
		} else if (n == 1) {
			return true;
		} else {
			int checkOccurance = countEqualTo(arr, arr[index]);
			if (checkOccurance == n) {
				return true;
			} else {
				return nInARowHelper(arr, n, index+1);
			}
		}
	}
}
