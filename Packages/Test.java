import geometry.Rectangle;

public class Test {
    public static void main(String[] args){
        Rectangle rect = new Rectangle(5,3);
        
        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Perimeter of Rectangle: " + rect.perimeter());
    } 
}
