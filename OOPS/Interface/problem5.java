// Create three interfaces, each with two methods. Inherit a new interface from the three,
// adding a new method. Create a class by implementing the new interface and also
// inheriting from a concrete class. Now write four methods, each of which takes one of the
// four interfaces as an argument. In main( ), create an object of your class and pass it to
// each of the methods.
package OOPS.Interface;


interface A{
void a1();
void a2();
}
 interface B {
    void b1();
    void b2();
}
interface C {
    void c1();
    void c2();
}
class D implements A,B,C{
    @Override
    public void a1(){
        System.out.println("this is method a1");
    }
    @Override
    public void a2(){
        System.out.println("this is method a2");
    }
    @Override
    public void b1(){
        System.out.println("this is method b1");
    }
    @Override
    public void b2(){
        System.out.println("this is method b2");
    }
    @Override
    public void c1(){
        System.out.println("this is method c1");
    }
    @Override
    public void c2(){
        System.out.println("this is method c2");
    }
}

public class problem5 {
    public static void main(String[] args) {
        D d = new D();
        d.a1();
        d.a2();
        d.b1();
        d.b2();
        d.c1();
        d.c2
        
        
        ();
    }
}
