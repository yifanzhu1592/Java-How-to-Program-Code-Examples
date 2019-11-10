// Fig. 6.2: InitArray.java
// Initializing the elements of an array to default values of zero.

public class InitArray {
	public static void main(String[] args) {
		// declare variable array and initialize it with an array object
		int[] array = new int[10]; // create the array object
		
		System.out.printf("%s%8s%n", "Index", "Value"); // column headings
		
		// output each array element's value
		for (int counter = 0; counter < array.length; counter++)
			System.out.printf("%5d%8d%n", counter, array[counter]);
	}
}
