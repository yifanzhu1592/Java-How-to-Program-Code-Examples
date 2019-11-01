// Fig. 4.2: ForCounter.java
// Counter-controlled repetition with the for repetition statement.

public class ForCounter {
	public static void main(String[] agrs) {
		// for statement header includes initialization,
		// loop-continuation condition and increment
		for (int counter = 1; counter <= 10; counter++) {
			System.out.printf("%d  ", counter);
		}
		
		System.out.println();
	}
} // end class ForCounter
