package Practical;

class Methods {
    // Method to calculate the sum of two numbers
    public int sum(int a, int b) {
        return a + b;
    }

    // Method to calculate the factorial of a number
    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Methods methods = new Methods();

        // Test the sum method
        int resultSum = methods.sum(5, 10);
        System.out.println("Sum: " + resultSum);

        // Test the factorial method
        int resultFactorial = methods.factorial(5);
        System.out.println("Factorial: " + resultFactorial);
    }
}