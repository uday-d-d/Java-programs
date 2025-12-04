import java.util.Scanner;

public class comparenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.print("Number 1 is greater than Number 2");
        } else if (num1 < num2) {
            System.out.print("Number 2 is greater than Number 1");
        } else {
            System.out.print("Both numbers are equal");
        }
    }
}