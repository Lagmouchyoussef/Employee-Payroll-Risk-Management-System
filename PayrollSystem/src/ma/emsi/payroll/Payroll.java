package ma.emsi.payroll;

import java.util.ArrayList;
import java.util.List;

public class Payroll {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        
        employees.add(new Salesperson("Mourad", 45, "1995", 30000));
        employees.add(new Representative("Mohamed", 25, "2001", 20000));
        employees.add(new ProductionWorker("Yves", 28, "1998", 1000));
        employees.add(new MaterialHandler("Jeanne", 32, "1998", 45));
        employees.add(new RiskProductionWorker("Jean", 28, "2000", 1000));
        employees.add(new RiskMaterialHandler("Ali", 30, "2001", 45));
        
        System.out.println("--- COMPLETE EMPLOYEE DETAILS ---");
        
        for (Employee e : employees) {
        	
            System.out.println(e.toString());
        }
    }
}