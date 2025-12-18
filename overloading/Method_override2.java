//. Write a Java program to demonstrate method overriding with a class Sports having a method
//play(), and subclasses Cricket and Football overriding the method.
class Sports{
    public void play(){
        System.out.println("Playing different games !!");
    }
}
class Cricket extends Sports{
    public void play(){
        System.out.println("Playing Cricket in Cricket class method");
    }
}
class Football extends Sports{
    public void play(){
        System.out.println("Playing Football in Football class method");
    }
}
public class Method_override2 {
    public static void main(String[] args) {

        Sports s = new Sports();
        s.play();

        Cricket c = new Cricket();
        c.play();

        Football f = new Football();
        f.play();
    }
}
