public class Array_pre_defined {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        try{
            System.out.println("Accessing element at index 10: " + arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Caught : " + e);
        }
        System.out.println("Program Ended");
    }
}
