public class AutoboxingExample {
    public static void main(String[] args) {

        int a = 10;
        double b = 20.5;
        char c = 'A';
        boolean d = true;

        // Autoboxing: Converting primitives into wrapper objects
        Integer objA = a;
        Double objB = b;
        Character objC = c;
        Boolean objD = d;

        System.out.println("Autoboxed Integer object: " + objA);
        System.out.println("Autoboxed Double object: " + objB);
        System.out.println("Autoboxed Character object: " + objC);
        System.out.println("Autoboxed Boolean object: " + objD);
    }
}

// public class AutoboxingExample {
//     public static void main(String[] args) {

//         Integer objA = 10;
//         Double objB = 20.5;
//         Character objC = 'A';
//         Boolean objD = true;
// // Unboxing: Converting objects into primitive data types
//         int a = objA;           // primitive int
//         double b = objB;      // primitive double
//         char c = objC;         // primitive char
//         boolean d = objD;     // primitive boolean

//         System.out.println("Unboxed int value: " + a);
//         System.out.println("Unboxed double value: " + b);
//         System.out.println("Unboxed character value: " + c);
//         System.out.println("Unboxed boolean value: " + d);
//     }
// }
