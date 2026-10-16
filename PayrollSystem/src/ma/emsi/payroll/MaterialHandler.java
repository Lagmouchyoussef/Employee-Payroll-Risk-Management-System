package ma.emsi.payroll;

public class MaterialHandler extends Employee {
    protected int hours;

    public MaterialHandler(String name, int age, String hireDate, int hours) {
        super(name, age, hireDate);
        this.hours = hours;
    }

    @Override
    public double calculateSalary() {
        return hours * 650;
    }

    @Override
    public String getName() {
        return "The material handler " + name;
    }
}