

public class ArtihmeticOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        // Addition
        int sum = a + b + c + d + e;
        System.out.println("Sum: " + sum);

        // Subtraction
        int difference = e - d - c - b - a;
        System.out.println("Difference: " + difference);

        // Multiplication
        int product = a * b * c * d * e;
        System.out.println("Product: " + product);

        // Division
        double quotient = (double) e / a; // Casting to double for accurate division
        System.out.println("Quotient: " + quotient);

        // Modulus
        int remainder = e % a;
        System.out.println("Remainder: " + remainder);
    }
}
