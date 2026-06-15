package Practical;

public class ArrayCreation {
    public static void main(String[] args) {
        int[] arr1 = new int[5]; // Array of integers with 5 elements
        String[] arr2 = new String[3]; // Array of strings with 3 elements

        // Initializing the integer array
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;

        // Initializing the string array
        arr2[0] = "Hello";
        arr2[1] = "World";
        arr2[2] = "Java";

        // Printing the integer array
        System.out.println("Integer Array:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // Printing the string array
        System.out.println("\nString Array:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
