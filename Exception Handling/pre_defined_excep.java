import java.io.FileReader;
import java.io.FileNotFoundException;

public class pre_defined_excep{
    public static void main(String[] args){
        System.out.println("Program Started");
        try{
            FileReader file = new FileReader("mydata.txt");
            System.out.println("File opened successfully");
        }
        catch(FileNotFoundException e){
            System.out.println("Exception caught: " + e);
        }
        System.out.println("Program Ended");
    }
}
