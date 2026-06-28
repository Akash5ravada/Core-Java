
public class TypeConversion {
    public static void main(String[] args) {
        // Implicit Type Conversion (Widening)
        int num1 = 100;
        double num2 = num1; // int is automatically converted to double
        System.out.println("Implicit Type Conversion:");
        System.out.println("Integer value: " + num1);
        System.out.println("Double value: " + num2);

        // Explicit Type Conversion (Narrowing)
        double num3 = 45.67;
        int num4 = (int) num3; // double is explicitly converted to int
        System.out.println("\nExplicit Type Conversion:");
        System.out.println("Double value: " + num3);
        System.out.println("Integer value: " + num4);
    }
}
