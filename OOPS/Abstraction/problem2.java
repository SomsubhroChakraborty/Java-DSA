// 2. Abstract Class for Animals
// Create an abstract class Animal with the following:
// Fields: name, age
// Abstract method: void makeSound()
// Concrete method: void eat() that prints "Eating food."
// Create subclasses:
// Dog (prints "Woof Woof!" in makeSound())
// Cat (prints "Meow Meow!" in makeSound())
// Write a program that demonstrates creating a list of Animal objects and calling their methods.

package OOPS.Abstraction;
// Abstract class Animal
abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method
    abstract void makeSound();

    // Concrete method
    void eat() {
        System.out.println(name + " is eating food.");
    }

    // Method to display animal details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
    }
}

// Subclass Dog
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

// Subclass Cat
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meow Meow!");
    }
}

// Main class to demonstrate functionality
public class problem2 {
    public static void main(String[] args) {
        // Create instances of Dog and Cat
        Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Whiskers", 2);

        // Demonstrate polymorphism
        Animal[] animals = {dog, cat};

        for (Animal animal : animals) {
            animal.displayDetails();
            animal.makeSound();
            animal.eat();
            System.out.println();
        }
    }
}

