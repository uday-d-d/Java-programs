import java.util.Scanner;

public class count_character {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuffer sb = new StringBuffer(str);

        int vowel = 0, consonant = 0, digit = 0, specialChar = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isLetter(ch)){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                   ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                    vowel++;
                } else {
                    consonant++;
                }
            } else if(Character.isDigit(ch)){
                digit++;
            } else {
                specialChar++;
            }
        }
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);
        System.out.println("Digits: " + digit);
        System.out.println("Special Characters: " + specialChar);
    }
}
