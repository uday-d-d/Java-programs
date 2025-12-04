abstract class Shape1{
    abstract double area();
}
class Circle extends Shape1{
    double radius ;

    public Circle(double radius){
        this.radius = radius ;
    }
    double area(){
        return Math.PI * radius * radius ;
    }
}
class Rectangle extends Shape1{
    double length ;
    double width ;

    public Rectangle(double length , double width){
        this.length = length ;
        this.width = width ;
    }
    double area(){
        return length * width ;
    }
}

public class Abstract_class {
    public static void main(String[] args) {

        Circle c = new Circle(5.00);
        System.out.println("Area of Circle : "+c.area());
        System.out.println();

        Rectangle r = new Rectangle(5.00 ,10.00);
        System.out.println("Area of Rectangle : "+r.area());
    }
}
