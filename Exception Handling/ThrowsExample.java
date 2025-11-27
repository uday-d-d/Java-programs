public class ThrowsExample{
    public static void divide(int a, int b) throws ArithmeticException{
        System.out.println("Result : " + (a/b));
    }
    public static void main(String[] args){
        try{
            divide(15, 0);
        }
        catch(ArithmeticException e){
            System.out.println("Error : Divide by zero ");
        }
    }
} 