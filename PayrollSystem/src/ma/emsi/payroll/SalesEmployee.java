package ma.emsi.payroll;

public abstract class SalesEmployee extends Employee {
	public SalesEmployee(String name, int age, String hireDate, double revenue) {
		super(name, age, hireDate);
		this.revenue= revenue;
		// TODO Auto-generated constructor stub
	}

	protected double revenue;

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

}
