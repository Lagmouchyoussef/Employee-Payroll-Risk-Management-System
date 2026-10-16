package ma.emsi.payroll;

public class RiskMaterialHandler extends MaterialHandler implements Risk {

    public RiskMaterialHandler(String name, int age, String hireDate, int hours) {
        super(name, age, hireDate, hours);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + BONUS;
    }

    @Override
    public String getName() {
        return "The high-risk material handler " + name;
    }
}