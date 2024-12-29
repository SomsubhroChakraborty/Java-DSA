// 3. Multiple Interface Implementation
// Create two interfaces:

// Flyable with method void fly().
// Swimmable with method void swim().
// Create a class Duck that implements both interfaces and demonstrates how it can fly and swim.


package OOPS.Interface;

interface Flyable{
void fly();
}
interface Swimmable{
    void swim();
}

class Duck implements Flyable,Swimmable{
    @Override
    public void fly(){
        System.out.println("Fly");
    }
    @Override
    public void swim(){
        System.out.println("Swim");
    }
}

public class problem3 {
    public static void main(String[] args) {
Duck duck = new Duck();
duck.fly();
duck.swim();
    }
}
