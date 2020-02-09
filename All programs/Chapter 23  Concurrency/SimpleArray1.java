// Fig. 23.8: SimpleArray1.java
// Class that manages an integer array to be shared by multiple
// threads with synchronization.
import java.security.SecureRandom;
import java.util.Arrays;

public class SimpleArray1 {
	private static final SecureRandom generator = new SecureRandom();
	private final int[] array; // the shared integer array
	private int writeIndex = 0; // index of next element to be written
	
	// construct a SimpleArray of a given size
	public SimpleArray1(int size) {
		array = new int[size];
	}
	
	// add a value to the shared array
	public synchronized void add(int value) {
		int position = writeIndex; // store the write index
		
		try {
			// in real applications, you shouldn't sleep while holding a lock
			Thread.sleep(generator.nextInt(500)); // for demo only
		}
		catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		
		// put value in the appropriate element
		array[position] = value;
		System.out.printf("%s wrote %2d to element %d.%n",
				Thread.currentThread().getName(), value, position);
		
		++writeIndex; // increment index of element to be written next
		System.out.printf("Next write index: %d%n", writeIndex);
	}
	
	// used for outputting the contents of the shared integer array
	public synchronized String toString() {
		return Arrays.toString(array);
	}
} // end class SimpleArray1
