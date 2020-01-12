// Fig. 15.7: MenuOption.java
// enum type for the credit-inquiry program's options.

public enum MenuOption {
	// declare contents of enum type
	ZERO_BALANCE(1),
	CREDIT_BALANCE(2),
	DEBIT_BALANCE(3),
	END(4);
	
	private final int value; // current menu option
	
	// constructor
	private MenuOption(int value) {
		this.value = value;
	}
} // end enum MenuOption
