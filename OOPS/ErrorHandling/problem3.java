// 3. Custom Exception
// Create a custom exception called InvalidAgeException that is thrown when a user's age is below 18.
// Write a program to accept the user's age and throw the exception if the condition is met, otherwise, print a success message.
package OOPS.ErrorHandling;
import java.util.*;
class InvalidAgeException extends Exception{
    private int age;

    public InvalidAgeException(int age , String message){
        super(message);
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}

public class problem3 {

    public static void validate(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException(age, "Age must be 18 or above");
        }
        else{
            System.out.println("This is a valid age");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the age : ");
            int age = sc.nextInt();
            validate(age);


        } 
        catch (Exception e) {
            System.out.println("the age is less than 18");
        }
        finally{
            System.out.println("Program execution completed");
            sc.close();
        }
    }
}
