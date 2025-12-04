// Parent class
class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void display() {
        System.out.println("Brand name is: " + brand);
        System.out.println("Year: " + year);
    }
}

// Child class inheriting from Vehicle
class Car extends Vehicle {
    String model;

    public Car(String brand, int year, String model) {
        super(brand, year); // Calls the constructor of the parent class (Vehicle)
        this.model = model;
    }

    public void displayCar() {
        display(); // Calls the method of the parent class (Vehicle)
        System.out.println("Model: " + model);
    }
}
// Grandchild class inheriting from Car
class SportCar extends Car {
    String type;
    int engine;

    public SportCar(String brand, int year, String model, String type, int engine) {
        super(brand, year, model); // Calls the constructor of the parent class (Car)
        this.type = type;
        this.engine = engine;
    }

    public void displaySport() {
        displayCar(); // Calls the method of the parent class (Car)
        System.out.println("Type: " + type);
        System.out.println("Engine: " + engine + " horsepower");
    }
}


public class Inheritance_1 {
    public static void main(String[] args) {

        SportCar obj = new SportCar("BMW",2024,"M5", "Car",620);
        obj.displaySport();

    }

}
