// Write the following methods that return a lambda expression performing a specified action:
// isOdd(): The lambda expression must return true if a number is odd or false if it is even.
// isPrime(): The lambda expression must return true if a number is prime or false if it is composite.
// isPalindrome(): The lambda expression must return true if a number is a palindrome or false if it is not.
package Generics;

import java.util.function.Predicate;

public class problem3 {
    public static Predicate<Integer> isOdd(){
        return num->num%2!=0;
    }

    public static Predicate<Integer> isPrime(){
        return num->{   
        if (num<=1)return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
                }
            return true;
        };
    }

    public static Predicate<Integer> isPalindrome(){
        return num -> {
            String str = String.valueOf(num);
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        };
    }

    public static void main(String[] args) {
        int num =121;
        System.out.println(isOdd().test(num));
        System.out.println(isPalindrome().test(num));
        System.out.println(isPrime().test(num));
    }
}
