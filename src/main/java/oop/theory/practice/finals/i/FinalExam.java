package oop.theory.practice.finals.i;

public class FinalExam {
    public static void main(String[] args) {
        // Using constants from interface
        System.out.println("The value of PI is: " + Consts.PI);

        // Super class reference objects
        Student[] students = {
                new CollegeStudent("Bilal", 17, "C63", 1, 84),
                new UniversityStudent("Bilal", 80, "BSE-115", 2, 1),
                new UniversityStudent()
        };

        // Using each object and there methods
        for (int i = 0; i < students.length; i++) {
            students[i].showInfo();
        }

        // Exception handling
        try {
            double ans = Consts.divide(2,0);
            System.out.println("Division answer: " + ans);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Some error occurred: " + e.getMessage());
        }
    }
}
