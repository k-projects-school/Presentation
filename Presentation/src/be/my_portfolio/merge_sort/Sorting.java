package be.my_portfolio.merge_sort;

public class Sorting {

	public static void main(String[] args) {
		// Create an int array
		int[] array = { 12, 11, 13 };

		// Show the array that we created.
		System.out.println("Given Array");
		printArray(array);

		System.out.println("---------------------");
		System.out.println("Sorted array");

		// Call the merge sort method
		Arrays.mergeSort(array);
		// Print the sorted array
		printArray(array);
	}

	/**
	 * Print the array in the console
	 * 
	 * @param array
	 */
	public static void printArray(int[] array) {
		// Create a string where all numbers will be stored
		String output = "[ ";
		// Loop through the array for the amount of entries
		for (int i = 0; i < array.length; ++i) {
			// Add the value of the current entry to the string
			output += array[i] + ", ";
		}
		// Remove the last ", " from the string and add a "]"
		output = output.substring(0, output.length() - 2) + " ]";
		System.out.println(output);
	}
}
