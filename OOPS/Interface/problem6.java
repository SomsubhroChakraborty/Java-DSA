// Create a private inner class that implements a public interface. Write a method that
// returns a reference to an instance of the private inner class, up cast to the interface. Show
// that the inner class is completely hidden by trying to downcast to it.
package OOPS.Interface;

public class problem6 {

    // Public interface
    public interface MyInterface {
        void display();
    }

    // Outer class method
    public MyInterface getInnerInstance() {
        return new InnerClass(); // Upcasting to interface
    }

    // Private inner class
    private class InnerClass implements MyInterface {
        @Override
        public void display() {
            System.out.println("This is the InnerClass implementing MyInterface.");
        }
    }

    public static void main(String[] args) {
        problem6 outer = new problem6();

        // Get the instance of the private inner class upcasted to the interface
        MyInterface instance = outer.getInnerInstance();
        instance.display();

        // Uncommenting the following line will cause a compile-time error
        // because InnerClass is private and cannot be accessed outside problem6.
        // InnerClass downcastedInstance = (InnerClass) instance;

        System.out.println("The InnerClass is completely hidden as downcasting is not allowed.");
    }
}
