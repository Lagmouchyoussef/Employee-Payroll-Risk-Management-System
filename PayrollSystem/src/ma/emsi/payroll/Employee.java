package ma.emsi.payroll;

public abstract class Employee {
    protected String name;
    protected int age;
    protected String hireDate;

    public Employee(String name, int age, String hireDate) {
        if (age < 0) {
            throw new IllegalArgumentException("Error: Age cannot be negative.");
        }
        this.name = name;
        this.age = age;
        this.hireDate = hireDate;
    }

    public abstract double calculateSalary();

    public String getName() {
        return "Employee " + name;
    }

    @Override
    public String toString() {
        return getName() + "  Age: " + age + "  Hire Date: " + hireDate + "  Salary: " + calculateSalary() + " Dhs.";
    }
}