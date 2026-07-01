package oop.theory.practice.finals.i;

public class UniversityStudent extends Student implements Person {
    private int idCardNo;
    protected double CGPA;


    // Default constructor
    public UniversityStudent() {
//        super();  // Calling super constructor is not that important here
        this.idCardNo = 0;
        this.CGPA = 0;
    }

    // Parameterized constructor
    public UniversityStudent(String name, int age, String rollNo, int idCardNo, double CGPA) {
        super(name, age, rollNo);
        this.idCardNo = idCardNo;
        this.CGPA = CGPA;
    }

    // Method overriding (runtime polymorphism)
    @Override
    public void showInfo() {
        System.out.println("Name: " + super.name + ", Age: " + super.getAge() + // age was private use via getter
                ", Section: " + Student.section + ", Roll No: " + super.rollNo +
                ", ID Card: " + this.idCardNo + ", CGPA: " + this.CGPA);
    }
}
