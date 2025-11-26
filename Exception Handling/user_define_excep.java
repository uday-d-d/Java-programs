class InvalidAgeException extends Exception{
    public InvalidAgeException(){
        super("Age must be 18 or above");
    }
}

public class user_define_excep {
    public static void registerUser(String name, int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException();
        }
        System.out.println("User registered: " + name + " Registered Successfully");
    }

    public static void main(String[] args){
        try{
            registerUser("Ram", 19);
        }
        catch(InvalidAgeException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
