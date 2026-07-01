package oop.theory.practice.finals.i;

public abstract class Student {
    // Class variables
    static String section = "SE2C";

    // Instance variables
    String name;
    String rollNo;
    // Hidden instance variable (Encapsulation)
    // Its getter and setter will be an important part of encapsulation
    private int age;

    // Default constructor
    public Student() {
        this("Unknown", 0, "115");
    }
    // Constructor 2nd overload
    public Student(String name, int age, String rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }
    // Constructor 3rd overload. Object as parameter.
    public Student(Student that) {
        this.name = that.name;
        this.age = that.getAge();
        this.rollNo = that.rollNo;
    }

    // Method overloading (compiled time polymorphism) OVERLOAD#1
    public void showInfo() {
        System.out.println("Name: " + this.name + ", Age: " + this.age +
                ", Section: " + Student.section + ", Roll No: " + this.rollNo);
    }
    // Method overloading (compiled time polymorphism) OVERLOAD#2
    final public void showInfo(String title) {  // final means this method will never override
        System.out.println("Title: " + title);
        this.showInfo();
    }

    // Getter and setter of the hidden variable part of encapsulation
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    // Getter and setters of other instance variables
    public static String getSection() {
        return section;
    }
    public String getName() {
        return name;
    }
    public String getRollNo() {
        return rollNo;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
}
