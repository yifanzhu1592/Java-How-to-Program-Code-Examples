// Fig. 9.11: BasePlusCommissionEmployee3.java
// BasePlusCommissionEmployee3 class inherits from CommissionEmployee
// and accesses the superclass's private data via inherited
// public methods.

public class BasePlusCommissionEmployee3 extends CommissionEmployee1 {
	private double baseSalary; // base salary per week
	
	// six-argument constructor
	public BasePlusCommissionEmployee3(String firstName, String lastName,
		String socialSecurityNumber, double grossSales,
		double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber,
			grossSales, commissionRate);
		
		// if baseSalary is invalid throw exception
		if (baseSalary < 0.0)
			throw new IllegalArgumentException(
					"Base salary must be >= 0.0");
		
		this.baseSalary = baseSalary;
	}
	
	// set base salary
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0)
			throw new IllegalArgumentException(
					"Base salary must be >= 0.0");
		
		this.baseSalary = baseSalary;
	}
	
	// return base salary
	public double getBaseSalary() {
		return baseSalary;
	}
	
	// calculate earnings
	@Override
	public double earnings() {
		return getBaseSalary() + super.earnings();
	}
	
	// return String representation of BasePlusCommissionEmployee3
	@Override
	public String toString() {
		return String.format("%s %s%n%s: %.2f", "base-salaried",
			super.toString(), "base salary", getBaseSalary());
	}
} // end class BasePlusCommissionEmployee3
