import java.util.Vector;

public class SimpleVector {
    public static void main(String[] args) {

        // Creating a Vector
        Vector<Integer> v = new Vector<>();

        // Adding elements
        v.add(10);
        v.add(20);
        v.add(30);

        // Displaying vector
        System.out.println("Vector elements: " + v);

        // Accessing an element
        System.out.println("Element at index 1: " + v.get(1));

        // Removing an element
        v.remove(2);  // removes 30
        System.out.println("After removal: " + v);

        // Checking size
        System.out.println("Size of Vector: " + v.size());
    }
}
