// Write a Java program to implement method overriding in a Bank class with method
//rateOfInterest(). Subclasses SBI, HDFC, and ICICI should override this method and display
//their respective rates.
class Bank{
    public void rateOfInterest(){
        System.out.println("General Bank rate of interest");
    }
}
class SBI extends Bank{
    @Override
    public void rateOfInterest(){
        System.out.println("Rate of interest of SBI id 3%");
    }
}
class HDFC extends Bank{
    @Override
    public void rateOfInterest(){
        System.out.println("Rate of interest of HDFC id 5%");
    }
}
class ICICI extends Bank{
    @Override
    public void rateOfInterest(){
        System.out.println("Rate of interest of ICICI id 3%");
    }
}
public class Method_overriding {
    public static void main(String[] args) {
        SBI s = new SBI();
        HDFC h = new HDFC();
        ICICI i = new ICICI();

        s.rateOfInterest();
        h.rateOfInterest();
        i.rateOfInterest();

    }
}
