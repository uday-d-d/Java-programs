class Person {

    String name;
    int age;

    // Constructor to initialize values
    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Method to check voting eligibility
    void checkEligibility() {
        if (age >= 18) {
            System.out.println(name + " is eligible for voting.");
        } else {
            System.out.println(name + " is NOT eligible for voting.");
        }
    }
}

public class PersonDemo {
    public static void main(String[] args) {

        Person p1 = new Person("Rahul", 20);
        Person p2 = new Person("Anita", 15);

        p1.checkEligibility();
        p2.checkEligibility();
    }
}
