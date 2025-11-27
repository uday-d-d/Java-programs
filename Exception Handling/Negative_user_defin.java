class InvalidNumberException extends Exception{
    public InvalidNumberException(){
        System.out.println("Number cannot be negative");
    }
}

public class Negative_user_defin {
    public static void main(String[] args){
        try{
            int num = -14;
            if(num < 0){
                throw new InvalidNumberException();
            }
            System.out.println("Number is Valid");
        }
        catch(InvalidNumberException e){
        }
    }
}
