import com.Ruthra.assignment.employee.Developer;
import com.Ruthra.assignment.employee.Manager;
import com.Ruthra.assignment.utilities.EmployeeUtilities;

/**
 * Main class to demonstrate usage of Employee, Manager, Developer, and utilities.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 1001, 90000, "HR");
        Developer developer = new Developer("Bob", 1002, 80000, "Java");

        System.out.println("=== Manager Details ===");
        EmployeeUtilities.printManagerDetails(manager);

        System.out.println("\n=== Developer Details ===");
        EmployeeUtilities.printDeveloperDetails(developer);

        // Give a raise
        System.out.println("\n--- Giving Raises ---");
        EmployeeUtilities.increaseSalary(manager, 10);
        EmployeeUtilities.increaseSalary(developer, 15);

        System.out.println("\n=== Updated Manager Details ===");
        EmployeeUtilities.printManagerDetails(manager);

        System.out.println("\n=== Updated Developer Details ===");
        EmployeeUtilities.printDeveloperDetails(developer);
    }
}
