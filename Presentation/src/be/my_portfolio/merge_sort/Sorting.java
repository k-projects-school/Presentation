package be.my_portfolio.merge_sort;

public class Sorting {

	public static void main(String[] args) {
		int array[] = {12, 11, 13}; 
		  
        System.out.println("Given Array"); 
        printArray(array); 
  
        MergeSort object = new MergeSort(); 
        object.mergeSort(array, 0, array.length-1); 

        System.out.println("---------------------"); 
        System.out.println("Sorted array"); 
        printArray(array);
	}

	public static void printArray(int[] array) {
		int n = array.length; 
        for (int i=0; i<n; ++i){
        	System.out.print(array[i] + " "); 
        }
        System.out.println(); 
	}
}
