interface Shape2{
    double area();
}
class Circle1 implements Shape2{
    double radius ;

    public Circle1(double r){
        radius = r ;
    }
    public double area(){
        return Math.PI * radius * radius ;
    }
}
class Square1 implements Shape2{
    double side ;

    public Square1(double s){
        side = s;
    }
    public double area(){
        return side * side ;
    }
}
class Rectangle1 implements Shape2{
    double length ;
    double width ;

    public Rectangle1(double l , double w){
        length = l ;
        width = w ;
    }
    public double area(){
        return length * width ;
    }
}

public class Interface {
    public static void main(String[] args) {
        Circle1 c = new Circle1(2.00);
        System.out.println("Area of Circle : "+c.area());

        Square1 s = new Square1(5.00);
        System.out.println("Area of Circle : "+s.area());

        Rectangle1 r = new Rectangle1(5.00 ,10.00);
        System.out.println("Area of Circle : "+r.area());
    }
}
