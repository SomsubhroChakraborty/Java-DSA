//  8. Remove Elements to Make Arrays Disjoint
// From two arrays, remove minimum elements so they have no common elements.
// Input: A = [4,2,4,4], B = [4,3]
// Output: 1



package Dynamic_Programing;

import java.util.*;

public class problem8{
    public static int remove(int[]a, int[] b){
        Set<Integer> setA = new HashSet<>();
        for(int i:a){
            setA.add(i);
        }
        int remove=0;
        for(int i:b){
           if( setA.contains(i))
            remove++;
        }
        return remove;
    }
    public static void main(String[] args) {
        int[] A = {4,2,4,4};
        int[] B = {4,3};
        System.out.println(remove(A,B));
    }
}