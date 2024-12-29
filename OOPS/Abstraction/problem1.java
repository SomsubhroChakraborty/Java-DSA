// 1. Abstract Class for Vehicles
// Create an abstract class Vehicle with the following:
// Fields: speed, fuel
// Abstract methods:
// void start()
// void stop()
// Concrete method: void displaySpecs() to display the speed and fuel.
// Create subclasses:
// Car (with an additional field for numberOfDoors)
// Bike (with an additional field for type such as "sports" or "cruiser")
// Implement the abstract methods in each subclass. Demonstrate the functionality in the main method.
package OOPS.Abstraction;
// Abstract class Vehicle
abstract class Vehicle {
    protected int speed;
    protected int fuel;
    public Vehicle(int speed, int fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }
    // Abstract methods
    abstract void start();
    abstract void stop();

    // Concrete method
    void displaySpecs() {
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel: " + fuel + " liters");
    }
}
// Subclass Car
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(int speed, int fuel, int numberOfDoors) {
        super(speed, fuel);
        this.numberOfDoors = numberOfDoors;
    }
    @Override
    void start() {
        System.out.println("Car is starting...");
    }
    @Override
    void stop() {
        System.out.println("Car is stopping...");
    }
    void displayCarDetails() {
        displaySpecs();
        System.out.println("Number of doors: " + numberOfDoors);
    }
}
// Subclass Bike
class Bike extends Vehicle {
    private String type;
    public Bike(int speed, int fuel, String type) {
        super(speed, fuel);
        this.type = type;
    }
    @Override
    void start() {
        System.out.println("Bike is starting...");
    }
    @Override
    void stop() {
        System.out.println("Bike is stopping...");
    }
    void displayBikeDetails() {
        displaySpecs();
        System.out.println("Type: " + type);
    }
}
// Main class to demonstrate functionality
public class problem1 {
    public static void main(String[] args) {
        // Create Car object
        Car car = new Car(120, 50, 4);
        System.out.println("Car Details:");
        car.start();
        car.displayCarDetails();
        car.stop();
        System.out.println("\nBike Details:");
        // Create Bike object
        Bike bike = new Bike(80, 15, "Sports");
        bike.start();
        bike.displayBikeDetails();
        bike.stop();
    }
}