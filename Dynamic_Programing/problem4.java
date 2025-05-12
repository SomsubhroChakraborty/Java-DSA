// 1. Write a program in that accepts two strings S1 and S2 as input. The program should
// check if S2 is a substring of S1 or not. If S2 is a substring of S1, then the program
// should output the starting location and ending location of S2 in S1. If S2 appears more
// than once in S1, then the locations of all instances have to be given without using
// predefined substring and index-of function
package Dynamic_Programing;

public class problem4 {
    public static void SubString(String S1, String S2) {
        int s1 = S1.length();
        int s2 = S2.length();
        boolean found = false;

        if (s1 < s2) {
            System.out.println("Not a Substring");
            return;
        }

        for (int i = 0; i <= s1 - s2; i++) {
            boolean match = true;

            for (int j = 0; j < s2; j++) {
                if (S1.charAt(i + j) != S2.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                found = true;
                int start = i;
                int end = i + s2 - 1;
                System.out.println("Match found from index " + start + " to " + end);
            }
        }

        if (!found) {
            System.out.println("No match found");
        }
    }

    public static void main(String[] args) {
        String A = "Somsubhro";
        String B = "subhro";
        SubString(A, B);
    }
}
