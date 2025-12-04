import java.util.Scanner;

public class switchcase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Choose operation : \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.print("Addition : " + (num1 + num2));
                break;
            case 2:
                System.out.print("Subtraction : " + (num1 - num2));
                break;
            case 3:
                System.out.print("Multiplication : " + (num1 * num2));
                break;
            case 4:
                if(num2 != 0){
                    System.out.print("Division : " + (num1 / num2));
                } else{
                    System.out.print("Error: Division by zero");
                }
                break;

            default:
                System.out.print("Invalid choice");
                break;
        }
    }
}