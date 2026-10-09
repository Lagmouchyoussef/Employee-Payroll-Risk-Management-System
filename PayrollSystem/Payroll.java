package PayrollSystem;

import java.util.Arrays;
import java.util.List;

// 1. LA CLASSE DE BASE
abstract class Employee {
    private String name;
    private int age;
    private String hireDate;

    public Employee(String name, int age, String hireDate) {
        this.name = name;
        this.age = age;
        this.hireDate = hireDate;
    }

    public abstract double calculateSalary();

    public String getName() {
        return "Employee " + name;
    }

    protected String getSimpleName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHireDate() {
        return hireDate;
    }
}

// 2. LE GROUPE DES COMMERCIAUX
abstract class SalesEmployee extends Employee {
    protected double revenue;

    public SalesEmployee(String name, int age, String hireDate, double revenue) {
        super(name, age, hireDate);
        this.revenue = revenue;
    }
}

// 3. LE VENDEUR
class Salesperson extends SalesEmployee {
    public Salesperson(String name, int age, String hireDate, double revenue) {
        super(name, age, hireDate, revenue);
    }

    @Override
    public double calculateSalary() {
        return (0.20 * revenue) + 4000;
    }

    @Override
    public String getName() {
        return "The salesperson " + getSimpleName();
    }
}

// 4. LE REPRÉSENTANT
class Representative extends SalesEmployee {
    public Representative(String name, int age, String hireDate, double revenue) {
        super(name, age, hireDate, revenue);
    }

    @Override
    public double calculateSalary() {
        return (0.20 * revenue) + 8000;
    }

    @Override
    public String getName() {
        return "The representative " + getSimpleName();
    }
}

// 5. L'OUVRIER
class ProductionWorker extends Employee {
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
        return "The production worker " + getSimpleName();
    }
}

// 6. LE MANUTENTIONNAIRE
class MaterialHandler extends Employee {
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
        return "The material handler " + getSimpleName();
    }
}

// 7. L'INTERFACE DE DANGER
interface Risk {
    double BONUS = 200.0;
}

// 8. L'OUVRIER À RISQUE
class RiskProductionWorker extends ProductionWorker implements Risk {
    public RiskProductionWorker(String name, int age, String hireDate, int units) {
        super(name, age, hireDate, units);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + BONUS;
    }

    @Override
    public String getName() {
        return "The high-risk production worker " + getSimpleName();
    }
}

// 9. LE MANUTENTIONNAIRE À RISQUE
class RiskMaterialHandler extends MaterialHandler implements Risk {
    public RiskMaterialHandler(String name, int age, String hireDate, int hours) {
        super(name, age, hireDate, hours);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + BONUS;
    }

    @Override
    public String getName() {
        return "The high-risk material handler " + getSimpleName();
    }
}

public class Payroll {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Salesperson("Pierre", 30, "1995", 30000),

            new Representative("Mohamed", 25, "2001", 20000),
            new ProductionWorker("Yves", 28, "1998", 1000),
            new MaterialHandler("Jeanne", 32, "1998", 45),
            new RiskProductionWorker("Jean", 28, "2000", 1000),
            new RiskMaterialHandler("Ali", 38, "2001", 45)
        );

        for (Employee e : employees) {
            System.out.println(e.getName() + " earned: " + e.calculateSalary() + " Dhs.");
        }
    }
}