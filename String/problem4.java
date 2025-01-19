// Write a program to accept a string from the user and find out the following statistics:

// (a) Count of uppercase character
// (b) Count of lowercase character
// (c) Count of digits
// (d) Count of spaces


package String;

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
System.out.println("Enter the input");
String input = sc.nextLine();
int uppercase = 0 ;
int lowercase = 0 ;
int digitcase = 0 ;
int spacecase = 0 ;

for (int i=0;i<input.length()  ; i++){
    char c = input.charAt(i);
    if(Character.isUpperCase(c)){
        uppercase++;
    }
    else if(Character.isLowerCase(c)){
        lowercase++;
    }
    else if(Character.isDigit(c)){
        digitcase++;
    }
    else{
        spacecase++;
    }
}
System.out.println("Upper case character is : "+ uppercase );
System.out.println("Lower case character is : "+ lowercase );
System.out.println("Digit case character is : "+ digitcase );
System.out.println("Space case character is : "+ spacecase );



    }
}
