// 1. Basic Interface Implementation
// Define an interface Animal with the following methods:
// void sound()
// void eat()
// Create two classes, Dog and Cat, that implement the Animal interface. Write a main method to demonstrate polymorphism by calling these methods on Animal references.


package OOPS.Interface;

interface Animal{
void sound();
void eats();
}

class Dog implements Animal{
    @Override
 public void sound(){
    System.out.println("Barking");
 }

 @Override
 public void eats(){
    System.out.println("Dog is eating");
 }
}

class Cat implements Animal{
    @Override
    public void sound(){
        System.out.println("Meowing");
     }
    
     @Override
     public void eats(){
        System.out.println("Cat is eating");
     }
}

public class problem1{
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        dog.eats();
        Animal cat = new Cat();
        cat.sound();
        cat.eats();
    }
}