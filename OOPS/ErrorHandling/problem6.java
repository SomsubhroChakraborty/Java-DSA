// Write a class that keeps a running total of all characters passed to it (one at a time) and
// throws an exception if it is passed a non-alphabetic character.


package OOPS.ErrorHandling;

import java.util.Scanner;

class NonAlphabeticException extends Exception{
public String toString(){
    return "This is not a Alphabet";
}
} 
public class problem6 {
    public static void main(String[] args) {
        int count =0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter a input");
                String input = sc.nextLine();
                if(input.length()==1){
                    char c = input.charAt(0);
                if(Character.isLetter(c)){
                    count++;
                    System.out.println("Alphabetic character count : " + count);
                }
                else{
                    throw new NonAlphabeticException();                }    
                } 
                else{
                    System.out.println("Enter one input at a time");
                }    
            } catch (NonAlphabeticException e) {
                System.out.println("this is a non alphabetic input");
            }
         
        }
    }
 }
// import java.util.*;

// class NonAlphabeticException extends Exception {
//     public String toString() {
//         return "This is a non-alphabetic character";
//     }
// }

// public class Alphabetic {
//     public static void main(String[] args) {
//         int count = 0;
//         Scanner sc = new Scanner(System.in);

//         while (true) {
//             try {
//                 System.out.println("Enter an input: ");
//                 String input = sc.nextLine();

//                 if (input.length() == 1) {
//                     char c = input.charAt(0);
                    
//                     if (Character.isLetter(c)) {
//                         count++;
//                         System.out.println("alphabetic character count: " + count);
//                     } else {
//                         throw new NonAlphabeticException();
//                     }
//                 } else {
//                     System.out.println("Please enter only a single character.");
//                 }
//             } catch (NonAlphabeticException e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }