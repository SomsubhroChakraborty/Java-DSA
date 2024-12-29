// 2. Interface with Default Methods
// Define an interface Vehicle with the following:

// void startEngine()
// void stopEngine()
// A default method default void maintenance() that prints "Performing maintenance."
// Create classes Car and Bike that implement the interface. Override the default method in one of the classes and demonstrate its usage.

package OOPS.Interface;

interface Vehical{
void startEngine();
void stopEngine();

default void maintenance(){
    System.out.println("Performing maintenance.");
}
}

 class Car implements Vehical {
    @Override
    public void startEngine(){
        System.out.println("start car engine");
    }
    @Override
    public void stopEngine(){
        System.out.println("stop car engine");
    }
    @Override
    public void maintenance(){
        System.out.println("Performing maintenance for car");
    }
}

class Bike implements Vehical {
    @Override
    public void startEngine(){
        System.out.println("start Bike engine");
    }
    @Override
    public void stopEngine(){
        System.out.println("stop Bike engine");
    }
    @Override
    public void maintenance(){
        System.out.println("Performing maintenance for Bike");
    }
}


public class problem2 {
public static void main(String[] args) {
    Vehical car = new Car();
    Vehical bike = new Bike();

car.startEngine();
car.stopEngine();
car.maintenance();
bike.startEngine();
bike.stopEngine();
bike.maintenance();

}
}
