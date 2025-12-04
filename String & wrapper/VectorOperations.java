import java.util.Vector;

public class VectorOperations {
    public static void main(String[] args) {

        // Create Vector with initial capacity 10
        Vector<Integer> vec = new Vector<>(10);

        // Adding 10 elements
        for (int i = 1; i <= 10; i++) {
            vec.add(i * 10); // 10,20,30,...100
        }

        System.out.println("Initial Vector: " + vec);

        // (a) Add, Insert, Remove, Update elements
        vec.add(110);               // Add element at end
        vec.add(120);               // Add one more
        vec.insertElementAt(25, 2); // Insert at index 2
        vec.remove(4);              // Remove element at index 4
        vec.set(3, 999);            // Update value at index 3

        System.out.println("\nAfter Add/Insert/Remove/Update:");
        System.out.println(vec);

        // (b) Check size & capacity
        System.out.println("\nSize of Vector: " + vec.size());
        System.out.println("Capacity of Vector: " + vec.capacity());

        // (c) Searching using contains() & indexOf()
        System.out.println("\nContains 999? " + vec.contains(999));
        System.out.println("Index of 999: " + vec.indexOf(999));

        // (d) Delete all elements
        vec.clear();
        System.out.println("\nAfter deleting all elements: " + vec);
    }
}
