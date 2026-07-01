package oop.theory.practice.finals.iii.bank;

public class Faculty extends Employee implements Bonus, Reportable {
    private int numberOfPublications;

    // Constructor using 'super' and 'this'
    public Faculty(int employeeId, String name, double basicSalary, int numberOfPublications) {
        super(employeeId, name, basicSalary);  // calling parent constructor
        this.numberOfPublications = numberOfPublications; // using this
    }

    @Override
    public double calculateSalary() {
        double researchAllowance = 5000;
        return super.basicSalary + researchAllowance; // using super
    }

    @Override
    public double calculateBonus() {
        return this.numberOfPublications * 1000; // using this
    }

    @Override
    public void generateReport() {
        System.out.println("Faculty Report:");
        System.out.println("Publications: " + this.numberOfPublications);
    }
}
