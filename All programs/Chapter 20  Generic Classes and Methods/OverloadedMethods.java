// Fig. 20.1: OverloadedMethods.java
// Printing array elements using overloaded methods.

public class OverloadedMethods {
	public static void main(String[] args) {
		// create arrays of Integer, Double and Character
		Integer[] integerArray = {1, 2, 3, 4, 5, 6};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
		Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
		
		System.out.printf("Array integerArray contains:%n");
		printArray(integerArray); // pass an Integer array
		System.out.printf("%nArray doubleArray contains:%n");
		printArray(doubleArray); // pass a Double array
		System.out.printf("%nArray characterArray contains:%n");
		printArray(characterArray); // pass a Character array
	}
	
	// method printArray to print Integer array
	public static void printArray(Integer[] inputArray) {
		// display array elements
		for (Integer element : inputArray)
			System.out.printf("%s ", element);
		
		System.out.println();
	}
	
	// method printArray to print Integer array
	public static void printArray(Double[] inputArray) {
		// display array elements
		for (Double element : inputArray)
			System.out.printf("%s ", element);
		
		System.out.println();
	}
	
	// method printArray to print Integer array
	public static void printArray(Character[] inputArray) {
		// display array elements
		for (Character element : inputArray)
			System.out.printf("%s ", element);
		
		System.out.println();
	}
} // end class OverloadedMethods
