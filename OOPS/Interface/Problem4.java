// 4. Extending an Interface
// Define an interface Shape with a method void draw().
// Create a new interface Colorable that extends Shape and adds a method void setColor(String color).
// Implement the Colorable interface in a class Circle and demonstrate drawing and coloring the circle.

package OOPS.Interface;
// Define the Shape interface
interface Shape {
    void draw();
}

// Define the Colorable interface that extends Shape
interface Colorable extends Shape {
    void setColor(String color);
}

// Implement the Colorable interface in the Circle class
class Circle implements Colorable {
    private String color;

    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }

    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("The Circle is colored " + color + ".");
    }
}

// Main class to demonstrate the implementation
public class Problem4 {
    public static void main(String[] args) {
        // Create an instance of Circle
        Circle circle = new Circle();

        // Call the methods
        circle.draw();
        circle.setColor("Red");
    }
}

