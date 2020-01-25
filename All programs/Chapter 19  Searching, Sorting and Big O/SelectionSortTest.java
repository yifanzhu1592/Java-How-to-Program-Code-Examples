// Fig. 19.4: SelectionSortTest.java
// Sorting an array with selection sort.
import java.security.SecureRandom;
import java.util.Arrays;

public class SelectionSortTest {
	// sort array using selection sort
	public static void selectionSort(int[] data) {
		// loop over data.length - 1 elements
		for (int i = 0; i < data.length - 1; i++) {
			int smallest = i; // first index of remaining array
			
			// loop to find index of smallest element
			for (int index = i + 1; index < data.length; index++)
				if (data[index] < data[smallest])
					smallest = index;
			
			swap(data, i, smallest); // swap smallest element into position
			printPass(data, i + 1, smallest); // output pass of algorithm
		}
	} // end method selectionSort
	
	// helper method to swap value in two elements
	private static void swap(int[] data, int first, int second) {
		int temporary = data[first]; // store first in temporary
		data[first] = data[second]; // replace first with second
		data[second] = temporary; // put temporary in second
	}
	
	// print a pass of the algorithm
	private static void printPass(int[] data, int pass, int index) {
		System.out.printf("after pass %2d: ", pass);
		
		// output elements till selected item
		for (int i = 0; i < index; i++)
			System.out.printf("%d  ", data[i]);
		
		System.out.printf("%d* ", data[index]); // indicate swap
		
		// finish outputting array
		for (int i = index + 1; i < data.length; i++)
			System.out.printf("%d  ", data[i]);
		
		System.out.printf("%n               "); // for alignment
		
		// indicate amount of array that's sorted
		for (int j = 0; j < pass; j++)
			System.out.print("--  ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		SecureRandom generator = new SecureRandom();
		
		int[] data = new int[10]; // create array
		
		for (int i = 0; i < data.length; i++) // populate array
			data[i] = 10 + generator.nextInt(90);
		
		System.out.printf("Unsorted array:%n%s%n%n",
				Arrays.toString(data)); // display array
		selectionSort(data); // sort array
		
		System.out.printf("Sorted array:%n%s%n%n",
				Arrays.toString(data)); // display array
	}
} // end class SelectionSortTest
