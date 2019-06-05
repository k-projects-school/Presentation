package be.my_portfolio.merge_sort;

public class MergeSort {
	/**
	 * Merge sorts an array.
	 * 
	 * @param array
	 * @param left
	 * @param right
	 */
	public void mergeSort(int[] array, int left, int right) {

		if (left < right) {
			// Get the middle point
			int median = (left + right) / 2;
			// Sort the first half of the array
			mergeSort(array, left, median);
			// Sort the second half of the array
			mergeSort(array, median + 1, right);

			// Merge the two halves
			merge(array, left, median, right);
		}
	}

	/**
	 * Merge 2 arrays.
	 * 
	 * @param array
	 * @param left
	 * @param median
	 * @param right
	 */
	public void merge(int[] array, int left, int median, int right) {
		// Get the sizes of the two subarrays that has to be created
		// sizeLeft is the left size
		int sizeLeft = median - left + 1;
		// pt2 is the right size
		int sizeRight = right - median;

		// Create 2 temporary arrays
		// Left partial array
		int[] tempLeft = new int[sizeLeft];
		// Right partial array
		int[] tempRight = new int[sizeRight];

		// Copy the data from the original array to the temporary arrays
		for (int leftIndex = 0; leftIndex < sizeLeft; ++leftIndex) {
			tempLeft[leftIndex] = array[left + leftIndex];
		}
		for (int rightIndex = 0; rightIndex < sizeRight; ++rightIndex) {
			tempRight[rightIndex] = array[median + 1 + rightIndex];
		}

		/*
		 * Start merging the two temporary arrays in the original array
		 */

		// Initial indexes of the two subarrays and the original array
		int rightIndex = 0, leftIndex = 0, originalIndex = left;

		/*
		 * Loop through the left and right subarray to create the original merged array
		 */
		while (leftIndex < sizeLeft && rightIndex < sizeRight) {
			/*
			 * If the value of the left temporary array is smaller than the value of the
			 * right temporary array, set the value of the original merged array with the
			 * value of the left temporary array
			 */
			if (tempLeft[leftIndex] <= tempRight[rightIndex]) {
				array[originalIndex] = tempLeft[leftIndex];
				leftIndex++;
			}
			/*
			 * If the value of the right temporary array is smaller than the value of the
			 * left temporary array, set the value of the original merged array with the
			 * value of the right temporary array
			 */
			else {
				array[originalIndex] = tempRight[rightIndex];
				rightIndex++;
			}
			originalIndex++;
		}

		// If there are items left in the left temporary array, loop trough them to add
		// them to the original array.
		while (leftIndex < sizeLeft) {
			array[originalIndex] = tempLeft[leftIndex];
			leftIndex++;
			originalIndex++;
		}
		// If there are items left in the right temporary array, loop trough them to add
		// them to the original array.
		while (rightIndex < sizeRight) {
			array[originalIndex] = tempRight[rightIndex];
			rightIndex++;
			originalIndex++;
		}
	}
}
