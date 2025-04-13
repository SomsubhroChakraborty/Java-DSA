// You are climbing a staircase. It takes n steps to reach the top.
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
// Example 1:
// Input: n = 2
// Output: 2
// Explanation: There are two ways to climb to the top.
// 1. 1 step + 1 step
// 2. 2 steps

package Miscellaneous;
import java.util.*;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println(1);
        } else if (n == 2) {
            System.out.println(2);
        } else {
            int a = 1; // ways to reach step 1
            int b = 2; // ways to reach step 2
            int result = 0;

            for (int i = 3; i <= n; i++) {
                result = a + b;
                a = b;
                b = result;
            }

            System.out.println("Ways to climb to the top: " + result);
        }
    }
}
