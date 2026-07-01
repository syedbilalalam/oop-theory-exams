package oop.theory.practice.finals.iii.bank;

public class AdminStaff extends Employee implements Bonus, Reportable {
    private int overtimeHours;

    public AdminStaff(int employeeId, String name, double basicSalary, int overtimeHours) {
        super(employeeId, name, basicSalary); // using super
        this.overtimeHours = overtimeHours;   // using this
    }

    @Override
    public double calculateSalary() {
        double overtimeRate = 200;
        return super.basicSalary + (this.overtimeHours * overtimeRate);
    }

    @Override
    public double calculateBonus() {
        return this.overtimeHours * 100;
    }

    @Override
    public void generateReport() {
        System.out.println("Admin Staff Report:");
        System.out.println("Overtime Hours: " + this.overtimeHours);
    }
}
