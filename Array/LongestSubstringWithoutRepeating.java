package Array;
import java.util.*;

public class LongestSubstringWithoutRepeating {
    public static int longestSubstringOfString(String s){
        HashSet<Character> set = new HashSet<>();
        int left =0;
        int maxLength=0;
        for(int right=0; right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left ++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "abcabcdbb";
        System.out.println("Max length is : "+longestSubstringOfString(s) );
    }
}
