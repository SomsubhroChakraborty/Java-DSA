package OOPS.Inheritance;

class Vehicle {
    String vehicleNumber;
    double fuelCapacity;

    // Constructor
    public Vehicle(String vehicleNumber, double fuelCapacity) {
        this.vehicleNumber = vehicleNumber;
        this.fuelCapacity = fuelCapacity;
    }

    // Methods
    void refuel(double liters) {
        if (liters > fuelCapacity) {
            System.out.println("Fuel exceeds capacity. Filling to maximum capacity.");
            liters = fuelCapacity;
        }
        System.out.println("Vehicle refueled with " + liters + " liters.");
    }

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Fuel Capacity: " + fuelCapacity);
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    // Constructor
    public Car(String vehicleNumber, double fuelCapacity, int numberOfDoors) {
        super(vehicleNumber, fuelCapacity);
        this.numberOfDoors = numberOfDoors;
    }

    // Additional Method
    void playMusic() {
        System.out.println("Playing music in the car.");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Truck extends Vehicle {
    double cargoCapacity;

    // Constructor
    public Truck(String vehicleNumber, double fuelCapacity, double cargoCapacity) {
        super(vehicleNumber, fuelCapacity);
        this.cargoCapacity = cargoCapacity;
    }

    // Additional Method
    void loadCargo(double weight) {
        if (weight > cargoCapacity) {
            System.out.println("Cargo exceeds capacity!");
        } else {
            System.out.println("Loaded weight: " + weight + " tons.");
        }
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
    }
}

public class problem3 {
    public static void main(String[] args) {
        // Create objects
        Vehicle vehicle = new Vehicle("VH1234", 50);
        Car car = new Car("CR5678", 40, 4);
        Truck truck = new Truck("TR9876", 100, 20);

        // Perform operations
        System.out.println("Refueling vehicles:");
        vehicle.refuel(30);
        car.refuel(45); // Exceeds capacity
        truck.refuel(80);

        System.out.println("\nUsing Car:");
        car.playMusic();

        System.out.println("\nUsing Truck:");
        truck.loadCargo(15); // Within capacity
        truck.loadCargo(25); // Exceeds capacity

        System.out.println("\nDisplaying details using polymorphism:");
        Vehicle[] vehicles = {vehicle, car, truck};
        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println();
        }
    }
}
