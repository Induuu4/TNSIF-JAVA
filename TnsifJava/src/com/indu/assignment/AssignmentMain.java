package com.indu.assignment;
import com.indu.assignment.Employee.*;
import com.indu.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        // Create Manager and Developer instances
        Manager manager = new Manager("Alice", 101, 80000, "IT");
        Developer developer = new Developer("Bob", 102, 60000, "Java");

        // Use EmployeeUtilities to perform operations
        System.out.println("=== Manager Details ===");
        EmployeeUtilities.printEmployeeDetails(manager);

        System.out.println("\n=== Developer Details ===");
        EmployeeUtilities.printEmployeeDetails(developer);

        // Give salary raise
        EmployeeUtilities.giveRaise(manager, 5000);
        EmployeeUtilities.giveRaise(developer, 3000);

        System.out.println("\n=== Updated Details ===");
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);
    }
}
