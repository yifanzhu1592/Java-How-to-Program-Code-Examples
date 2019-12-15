// Fig. 7.5: Account1.java
// Account class with a constructor that initializes the name.

public class Account1 {
	private String name; // instance variable
	
	// constructor initializes name with parameter name
	public Account1(String name) { // constructor name is class name
		this.name = name;
	}
	
	// method to set the name
	public void setName(String name) {
		this.name = name;
	}
	
	// method to retrieve the name
	public String getName() {
		return name;
	}
} // end class Account
