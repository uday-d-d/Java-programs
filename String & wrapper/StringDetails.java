import java.util.Scanner;

public class StringDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Display length of string
        System.out.println("Length of the string = " + str.length());

        // Display individual characters
        System.out.println("Individual characters:");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
