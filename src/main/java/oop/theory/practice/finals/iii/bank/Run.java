package oop.theory.practice.finals.iii.bank;

public class Run {
    public static void main(String[] args) {

        Employee e1 = new Faculty(101, "Ali", 50000, 5);
        Employee e2 = new AdminStaff(102, "Sara", 40000, 10);
        Employee e3 = new VisitingFaculty(103, "Ahmed", 30000);

        Employee[] employees = {e1, e2, e3};

        for (Employee emp : employees) {
            System.out.println("\n-------------------------");

            emp.displayDetails();
            System.out.println("Salary: " + emp.calculateSalary());

            // Using instanceof for interface methods
            if (emp instanceof Bonus) {
                Bonus b =  (Bonus) emp;
                System.out.println("Bonus: " + b.calculateBonus());
            }

            if (emp instanceof Reportable) {
                Reportable r = (Reportable) emp;
                r.generateReport();
            }
        }
    }
}
