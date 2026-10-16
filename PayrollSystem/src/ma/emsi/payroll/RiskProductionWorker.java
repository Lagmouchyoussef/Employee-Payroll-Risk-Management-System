package ma.emsi.payroll;

public class RiskProductionWorker extends ProductionWorker implements Risk {

    public RiskProductionWorker(String name, int age, String hireDate, int units) {
        super(name, age, hireDate, units);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + BONUS;
    }

    @Override
    public String getName() {
        return "The high-risk production worker " + name;
    }
}