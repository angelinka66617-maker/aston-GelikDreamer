package lesson_7_junit_5;

public class ArithmeticOperations {

    public ArithmeticOperations() {}

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль запрещено");
        }
        return a / b;
    }
}