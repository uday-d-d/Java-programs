import java.util.Scanner;

public class largest_among_three {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println("Number 1 is Larger among three");
        } else if(num2 >= num1 && num2 >= num3){
            System.out.println("Number 2 is largest among three");
        } else{
            System.out.println("Number 3 is largest among three");
        }
    }
}