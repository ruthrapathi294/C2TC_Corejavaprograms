package com.Ruthra.assignment.utilities;

import com.yourname.assignment.employees.Employee;
import com.yourname.assignment.employees.Manager;
import com.yourname.assignment.employees.Developer;

/**
 * Utility class for handling employee operations.
 */
public class EmployeeUtilities {

    /**
     * Prints basic details of an employee.
     */
    public static void printEmployeeDetails(Employee employee) {
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
    }

    /**
     * Prints manager-specific details.
     */
    public static void printManagerDetails(Manager manager) {
        printEmployeeDetails(manager);
        System.out.println("Department: " + manager.getDepartment());
    }

    /**
     * Prints developer-specific details.
     */
    public static void printDeveloperDetails(Developer developer) {
        printEmployeeDetails(developer);
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
    }

    /**
     * Increases salary of an employee by a percentage.
     */
    public static void increaseSalary(Employee employee, double percent) {
        double newSalary = employee.getSalary() * (1 + percent / 100);
        employee.setSalary(newSalary);
        System.out.println("Salary increased by " + percent + "%");
    }
}
