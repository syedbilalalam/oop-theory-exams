package oop.theory.practice.finals.i;

public interface Consts {
    // Interface variable can be treated as constants
    double PI = 3.1415;

    // Static methods or default can be defined otherwise all methods are abstract
    static double avg(int a, int b) {
        return (a + b) / 2.0;
    }

    static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
