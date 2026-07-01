package oop.theory.practice.finals.iii.bank;
public abstract class Employee {
    int employeeId;
    protected String name;
    protected double basicSalary;

    // Constructor using 'this'
    public Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;   // using this keyword
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Abstract Method
    public abstract double calculateSalary();

    // Concrete Method
    public void displayDetails() {
        System.out.println("Employee ID: " + this.employeeId);
        System.out.println("Name: " + this.name);
        System.out.println("Basic Salary: " + this.basicSalary);
    }
}
