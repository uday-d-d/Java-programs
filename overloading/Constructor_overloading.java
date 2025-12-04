// Write a Java program to demonstrate constructor overloading in a Laptop class to initialize
//brand only, brand with RAM size, and brand with RAM size and processor speed.
class Laptop{
    String brand ;
    int size ;
    int speed ;

    public Laptop(String brand){
       this.brand = brand ;
    }
    void display(){
        System.out.println(" Brand is : "+brand);
    }
    public Laptop(String brand, int size){
        this.brand = brand ;
        this.size = size ;
    }
    void display1(){
        System.out.println(" Brand is : "+brand);
        System.out.println("Ram size is : "+size);
    }
    public Laptop(String brand, int size, int speed){
        this.brand = brand ;
        this.size = size ;
        this.speed = speed ;
    }
    void display2(){
        System.out.println(" Brand is : "+brand);
        System.out.println("Ram size is : "+size);
        System.out.println("Proccessor speed is : "+speed);
    }
}
public class Constructor_overloading {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("HP");
        Laptop l2 = new Laptop("Lenovo", 512);
        Laptop l3 = new Laptop("Asus", 256, 10);

        l1.display();
        System.out.println();

        l2.display1();
        System.out.println();

        l3.display2();
    }
}
