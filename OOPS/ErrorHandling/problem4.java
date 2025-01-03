// Create a custom exception called InvalidMarksException that is thrown when:
// Marks entered are negative or greater than 100. Write a program that accepts marks for 5 subjects, 
//validates them, and calculates the average.


package OOPS.ErrorHandling;
// import java.nio.InvalidMarkException;
import java.util.*;

class InvalidMarksException extends Exception{
private int marks;

public InvalidMarksException(int marks, String message){
    super(message);
    this.marks=marks;
}
public int getMarks(){
    return marks;
}
}

public class problem4 {
    public static void marksValidator(int marks)throws InvalidMarksException{
        if(marks<0||marks>100){
            throw new InvalidMarksException(marks, "Invalid"+ marks +"The marks should be greater than 0 or less than 100");
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int totalmarks =0;
try {
    
    for(int i=0 ; i<5 ; i++){
        System.out.println("Enter the number of the "+ (i+1) +" subject :" );
        int subjectMarks = sc.nextInt();
        marksValidator(subjectMarks);
        marks[i] = subjectMarks;
        totalmarks +=subjectMarks;

    }

    double average = totalmarks/5;
    System.out.println("total marks : " + totalmarks);
    System.out.println("average marks : " + average);
} 
catch (InvalidMarksException e) {
    System.out.println("The marks is not valid");
    
}
finally{
    System.out.println("Program execution completed ");
    sc.close();
}
    }
}
