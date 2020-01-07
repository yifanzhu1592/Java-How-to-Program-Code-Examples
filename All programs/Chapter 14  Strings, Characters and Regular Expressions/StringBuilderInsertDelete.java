// Fig. 14.14: StringBuilderInsertDelete.java
// StringBuilder methods insert, delete and deleteCharAt.

public class StringBuilderInsertDelete {
	public static void main(String[] args) {
		Object objectRef = "hello";
		String string = "goodbye";
		char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
		boolean booleanValue = true;
		char characterValue = 'Z';
		int integerValue = 7;
		long longValue = 10000000000L;
		float floatValue = 2.5f; // f indicates that 2.5 is a float
		double doubleValue = 33.333;
		
		StringBuilder buffer = new StringBuilder();
		
		buffer.insert(0, objectRef);
		buffer.insert(0, "  "); // each of these contains two spaces
		buffer.insert(0, string);
		buffer.insert(0, "  ");
		buffer.insert(0, charArray);
		buffer.insert(0, "  ");
		buffer.insert(0, charArray, 3, 3);
		buffer.insert(0, "  ");
		buffer.insert(0, booleanValue);
		buffer.insert(0, "  ");
		buffer.insert(0, characterValue);
		buffer.insert(0, "  ");
		buffer.insert(0, integerValue);
		buffer.insert(0, "  ");
		buffer.insert(0, longValue);
		buffer.insert(0, "  ");
		buffer.insert(0, floatValue);
		buffer.insert(0, "  ");
		buffer.insert(0, doubleValue);
		
		System.out.printf("buffer after inserts:%n%s%n%n", buffer.toString());
		
		buffer.deleteCharAt(10); // delete 5 in 2.5
		buffer.delete(2, 6); // delete .333 in 33.333
		
		System.out.printf("buffer after deletes:%n%s%n", buffer.toString());
	}
} // end class StringBuilderInsertDelete
