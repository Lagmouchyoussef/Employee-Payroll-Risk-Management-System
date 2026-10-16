package ma.emsi.payroll;

public class Salesperson extends SalesEmployee {

    public Salesperson(String name, int age, String hireDate, double revenue) {
        super(name, age, hireDate, revenue);
    }

    @Override
    public double calculateSalary() {
        
        return (0.2 * revenue) + 4000;
    }

    @Override
    public String getName() {
        return "The salesperson " + name;
    }
}