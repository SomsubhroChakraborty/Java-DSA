package String;

public class ValidPalindrome {
    
    public static void palindrome(String s){
        if(s==null){
            System.out.println("invalid input");
            return;
        }
       s = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int left =0;
        int right = s.length()-1;

        while (left<right) {
            if(s.charAt(left)!=s.charAt(right)){
                System.out.println("not pallindrome");
                return;
            }
            left++;
            right--;
            
        }
        System.out.println("Pallindrome");

    }
      public static void main(String[] args) {
        palindrome("A man, a plan, a canal : Panama"); // Valid palindrome
        palindrome("raceacar"); // Not a palindrome
    }
}
