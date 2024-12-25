package OOPS.Inheritance;

class Animal{
    String name;

    public Animal(String name){
        this.name = name;
    }

    void makeSound(){
        System.out.println(" Some generic sound");
    }
}
 class Dog extends Animal{
    String breed;
public Dog(String name, String breed){
        super(name);
        this.breed = breed;
    }
    @Override
    void makeSound(){
        System.out.println("Bark");
    }
 }

    class Cat extends Animal{
        String color;
        public Cat(String name, String color){
            super(name);
            this.color = color;
        }
        @Override
        void makeSound(){
            System.out.println("Meow");
        }
    }
public class problem1 {
    public static void main(String[] args) {
Cat cat =new Cat("billu","black");
cat.makeSound();
Dog dog = new Dog("tommy","leri");
dog.makeSound();
    }
}
