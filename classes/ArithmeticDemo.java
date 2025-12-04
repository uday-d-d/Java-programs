class Arithmetic {

    // Method for Addition
    void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    // Method for Subtraction
    void sub(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }

    // Method for Multiplication
    void mul(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }

    // Method for Division
    void div(int a, int b) {
        if (b != 0)
            System.out.println("Division = " + (a / b));
        else
            System.out.println("Error: Division by zero!");
    }
}

public class ArithmeticDemo {
    public static void main(String[] args) {

        Arithmetic obj = new Arithmetic();  // Create object of class

        obj.add(20, 10);
        obj.sub(20, 10);
        obj.mul(20, 10);
        obj.div(20, 10);
    }
}
