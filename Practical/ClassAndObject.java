

class Car{
    String make;
    String model;
    int year;
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    
}


public class ClassAndObject {
    public static void main(String[] args) {
        // Create an object of the class
        Car myCar = new Car();

        // Set the attributes of the car
        myCar.make = "Toyota";
        myCar.model = "Camry";
        myCar.year = 2020;

        // Call the method to display car information
        myCar.displayInfo();
    }
}
