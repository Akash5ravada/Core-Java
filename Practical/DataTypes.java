
class Addition {
    public void addNumbers() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
}

public class DataTypes {
    public static void main(String[] args) {
        //DataTypes
        //Primitive
        int number = 22;
        char ch = 'A';
        float pi = 3.14f;
        double salary = 25000.23;
        boolean isActive = true;
        Long id = 201022358l;
        
        //Non-Primitive
        String name = "Akash";
        int[] numbers = {1, 2, 3, 4, 5};
        Addition addition = new Addition();

        System.out.println("Integer: " + number);
        System.out.println("Character: " + ch);
        System.out.println("Float: " + pi);
        System.out.println("Double: " + salary);
        System.out.println("Boolean: " + isActive);
        System.out.println("Long: " + id);
        System.out.println("String: " + name);
        System.out.print("Array: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
        addition.addNumbers();
    }
}
