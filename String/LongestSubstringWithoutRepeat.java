package String;

import java.util.HashSet;

public class LongestSubstringWithoutRepeat {
    public static int LongestSubstring(String s){

        int n = s.length();
        int left =0;
        int maxlen = 0;
        HashSet<Character> set = new HashSet<>();
        for(int right=0; right<n; right++){
            char c = s.charAt(right);

            while (set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            maxlen = Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }

    public static void main(String args[]){
        String s1 = "workattach";
        System.out.println(LongestSubstring(s1)); 
    }
   
}
