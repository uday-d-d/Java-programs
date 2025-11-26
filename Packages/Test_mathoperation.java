import mathoperations.MathUtil;

public class Test_mathoperation {
    public static void main(String[] args){
        MathUtil m = new MathUtil();

        System.out.println("Addition: " + m.add(10,5));
        System.out.println("Subtraction: " + m.sub(10,5));
        System.out.println("Multiplication: " + m.mul(10,5));
        System.out.println("Division: " + m.div(10,5));
    }
}
