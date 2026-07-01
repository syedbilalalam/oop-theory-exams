package oop.theory.practice.finals.ii.calculator;

public class UseCalculator {
    public static void main(String[] args) {
        Calculator obj = new MyCalculator();

        obj.showMessage();          // default method (overridden)
        obj.performAddition();      // uses static method
    }
}
