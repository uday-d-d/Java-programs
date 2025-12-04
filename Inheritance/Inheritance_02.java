import java.util.Scanner;

// Base class
class Employee {
    String name;
    int salary;

    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter salary: ");
        salary = sc.nextInt();
        sc.nextLine(); // consume leftover newline
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Derived class Manager
class Manager extends Employee {
    String dept;

    void inputManager() {
        input();
        System.out.print("Enter department: ");
        dept = sc.nextLine();
    }

    void displayManager() {
        display();
        System.out.println("Department: " + dept);
    }
}

// Derived class Engineer
class Engineer extends Employee {
    String trade;

    void inputEngineer() {
        input();
        System.out.print("Enter trade: ");
        trade = sc.nextLine();
    }

    void displayEngineer() {
        display();
        System.out.println("Trade: " + trade);
    }
}

// Main class
public class Inheritance_02 {
    public static void main(String[] args) {

        Manager m = new Manager();
        System.out.println("Enter Manager details:");
        m.inputManager();
        System.out.println("\nManager Details:");
        m.displayManager();

        Engineer e = new Engineer();
        System.out.println("\nEnter Engineer details:");
        e.inputEngineer();
        System.out.println("\nEngineer Details:");
        e.displayEngineer();
    }
}
