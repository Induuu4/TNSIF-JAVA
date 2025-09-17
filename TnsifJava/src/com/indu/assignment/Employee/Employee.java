package com.indu.assignment.Employee;
public class Employee {
    private String name;
    private int employeeId;
    private double salary;

    // Constructor
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    protected void setName(String name) { // protected modifier usage
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    private void setEmployeeId(int employeeId) { // private modifier usage
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) { // public modifier usage
        this.salary = salary;
    }
}


