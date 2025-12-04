class Area{

    public double calculate(double r){
        return Math.PI * r * r ;
    }
    public double calculate(double l, double w){
        return l * w ;
    }
    public double calculate(int b , int h){
        return 0.5 * b * h ;
    }
}
public class Method_overloading {
    public static void main(String [] args){
        Area obj = new Area();
        System.out.println("Area of Circle : "+obj.calculate(2.00));
        System.out.println("Area of Rectangle : "+obj.calculate(5.00 , 10.00));
        System.out.println("Area of Triangle : "+obj.calculate(5 , 10));
    }
}
