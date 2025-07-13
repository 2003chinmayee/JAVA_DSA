// Abstract Class
abstract class Vehicle {
    String type;  // instance variable

    // Constructor
    Vehicle(String type) {
        this.type = type;
        System.out.println("Vehicle constructor called for type: " + type);
    }

    // Abstract Method
    abstract void start();

    // Non-abstract method
    void fuel() {
        System.out.println("Vehicle needs fuel.");
    }

    // Static Method
    static void showCategory() {
        System.out.println("All vehicles fall under the transportation category.");
    }
}

// Concrete Class
class Car extends Vehicle {

    Car(String type) {
        super(type);  // Call to abstract class constructor
    }

    // Implementation of abstract method
    void start() {
        System.out.println("Car starts with a key.");
    }
}

// Main class to test
public class Abstract2 {
    public static void main(String[] args) {
        // Access static method of abstract class
        Vehicle.showCategory();  // ✅ Allowed without object

        // Create object of subclass
        Car myCar = new Car("Sedan");

        // Access methods and variable
        myCar.start();       // Abstract method implementation
        myCar.fuel();        // Non-abstract method from abstract class
        System.out.println("Car type: " + myCar.type);  // Variable from abstract class
    }
}
