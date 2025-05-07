// Write a program in that accepts two strings S1 and S2 as input. The program should
// check if S2 is a substring of S1 or not. If S2 is a substring of S1, then the program
// should output the starting location and ending location of S2 in S1. If S2 appears more
// than once in S1, then the locations of all instances have to be given without using
// predefined substring and index-of function.

package String;
import java.util.*;

public class problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input strings
        System.out.print("Enter string S1: ");
        String S1 = scanner.nextLine();
        System.out.print("Enter string S2: ");
        String S2 = scanner.nextLine();

        int len1 = S1.length();
        int len2 = S2.length();
        boolean found = false;

        for (int i = 0; i <= len1 - len2; i++) {
            int j;
            for (j = 0; j < len2; j++) {
                if (S1.charAt(i + j) != S2.charAt(j)) {
                    break;
                }
            }

            if (j == len2) {
                // Match found
                found = true;
                System.out.println("S2 found from index " + i + " to " + (i + len2 - 1));
            }
        }

        if (!found) {
            System.out.println("S2 is not a substring of S1.");
        }

        scanner.close();
    }
}
