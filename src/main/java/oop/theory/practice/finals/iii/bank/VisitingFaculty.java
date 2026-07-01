package oop.theory.practice.finals.iii.bank;

public class VisitingFaculty extends Employee implements Reportable {

    public VisitingFaculty(int employeeId, String name, double basicSalary) {
        super(employeeId, name, basicSalary); // using super
    }

    @Override
    public double calculateSalary() {
        return this.basicSalary; // using this
    }

    @Override
    public void generateReport() {
        System.out.println("Visiting Faculty Report:");
        System.out.println("Contract-based employee.");
    }
}
