package oop.theory.practice.finals.ii.calculator;

public class MyCalculator implements Calculator {
    // Overriding default method
    @Override
    public void showMessage() {
        System.out.println("My Custom Calculator");
    }

    @Override
    public void performAddition() {
        int result = Calculator.add(10, 5); // calling static method
        System.out.println("Addition Result: " + result);
    }
}
