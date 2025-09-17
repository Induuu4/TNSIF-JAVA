package com.indu.assignment.utilities;
import com.indu.assignment.Employee.Employee;

public class EmployeeUtilities {

    /**
     * Prints details of the employee.
     * Demonstrates use of access modifiers through getters.
     */
    public static void printEmployeeDetails(Employee emp) {
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Salary: " + emp.getSalary());
    }

    /**
     * Gives a salary raise to the employee.
     */
    public static void giveRaise(Employee emp, double amount) {
        emp.setSalary(emp.getSalary() + amount);
        System.out.println(emp.getName() + " received a raise of " + amount);
    }
}


