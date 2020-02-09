// Fig. 23.9: Buffer.java
// Buffer interface specifies methods called by Producer and Consumer.

public class Buffer {
	// place int value into Buffer
	public void blockingPut(int value) throws InterruptedException;
	
	// return int value from Buffer
	public int blockingGet() throws InterruptedException;
} // end interface Buffer
