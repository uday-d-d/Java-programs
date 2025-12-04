import java.util.Scanner;

public class StringPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        String reverse = "";

        for(int i = str.length() - 1; i >= 0; i--){
            str = str.toLowerCase();
            reverse = reverse + str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.print("String is palindrome");
        }
        else{
            System.out.print("String is not palindrome");
        }
    }
}
