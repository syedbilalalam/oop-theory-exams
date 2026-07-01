package oop.theory.practice.finals.ii.calculator;

public interface Calculator {
    // Default method (can be overridden)
    default void showMessage() {
        System.out.println("This is a calculator");
    }

    // Static method (cannot be overridden)
    static int add(int a, int b) {
        return a + b;
    }

    // Abstract method must be overridden
    void performAddition();
}
