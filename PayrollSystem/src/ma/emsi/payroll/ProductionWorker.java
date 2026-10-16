package ma.emsi.payroll;

public class ProductionWorker extends Employee {
    protected int units;

    public ProductionWorker(String name, int age, String hireDate, int units) {
        super(name, age, hireDate);
        this.units = units;
    }

    @Override
    public double calculateSalary() {
        return units * 5; 
    }

    @Override
    public String getName() {
        return "The production worker " + name;
    }
}