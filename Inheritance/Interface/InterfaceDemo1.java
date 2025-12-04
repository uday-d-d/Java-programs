interface Circle {
    void area();
}

interface Rectangle {
    void area();
}

class Triangle implements Circle, Rectangle {

    // Implement Circle area
    public void area() {
        System.out.println("This is area() method from interfaces.");
    }

    // Separate methods for actual calculations
    void circleArea(double r) {
        double a = 3.14 * r * r;
        System.out.println("Area of Circle = " + a);
    }

    void rectangleArea(double l, double b) {
        double a = l * b;
        System.out.println("Area of Rectangle = " + a);
    }

    void triangleArea(double base, double height) {
        double a = 0.5 * base * height;
        System.out.println("Area of Triangle = " + a);
    }
}

public class InterfaceDemo1 {
    public static void main(String[] args) {

        Triangle t = new Triangle();

        t.circleArea(5);
        t.rectangleArea(4, 6);
        t.triangleArea(3, 8);
    }
}
