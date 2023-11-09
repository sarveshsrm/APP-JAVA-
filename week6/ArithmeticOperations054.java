public class ArithmeticOperations054 {
    public int add054(int a, int b) {
        return a + b;
    }
    public double add054(double a, double b) {
        return a + b;
    }
    public int subtract054(int a, int b) {
        return a - b;
    }
    public double subtract054(double a, double b) {
        return a - b;
    }
    public int multiply054(int a, int b) {
        return a * b;
    }
    public double multiply054(double a, double b) {
        return a * b;
    }
    public int divide054(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }
    public double divide054(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        ArithmeticOperations054 calculator = new ArithmeticOperations054();
        System.out.println("Addition (int): " + calculator.add054(5, 3));
        System.out.println("Subtraction (int): " + calculator.subtract054(10, 4));
        System.out.println("Multiplication (int): " + calculator.multiply054(6, 2));
        System.out.println("Division (int): " + calculator.divide054(8, 2));
        System.out.println("Addition (double): " + calculator.add054(5.5, 3.2));
        System.out.println("Subtraction (double): " + calculator.subtract054(10.0, 4.5));
        System.out.println("Multiplication (double): " + calculator.multiply054(6.5, 2.0));
        System.out.println("Division (double): " + calculator.divide054(8.0, 2.5));
    }
}

