package ma.emsi.payroll;

public class Representative extends SalesEmployee {

    public Representative(String name, int age, String hireDate, double revenue) {
        super(name, age, hireDate, revenue);
    }

    @Override
    public double calculateSalary() {
        return (0.20 * revenue) + 8000; 
    }

    @Override
    public String getName() {
        return "The representative " + name;
    }
}