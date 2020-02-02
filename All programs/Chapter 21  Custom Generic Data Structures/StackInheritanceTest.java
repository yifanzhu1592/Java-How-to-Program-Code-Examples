// Fig. 21.11: StackInheritanceTest.java
// Stack manipulation program.
import com.deitel.datastructures.StackInheritance;
import com.deitel.datastructures.EmptyListException;

public class StackInheritanceTest {
	public static void main(String[] args) {
		StackInheritance<Integer> stack = new StackInheritance<>();
		
		// use push method
		stack.push(-1);
		stack.print();
		stack.push(0);
		stack.print();
		stack.push(1);
		stack.print();
		stack.push(5);
		stack.print();
		
		// remove items from stack
		try {
			int removedItem;
			
			while (true) {
				removedItem = stack.pop(); // use pop method
				System.out.printf("%n%d popped%n", removedItem);
				stack.print();
			}
		}
		catch (EmptyListException emptyListException) {
			emptyListException.printStackTrace();
		}
	}
} // end class StackInheritanceTest
