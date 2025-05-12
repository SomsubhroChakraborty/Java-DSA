// Remove minimum number of elements such that no common element exist in both array
// Given two arrays A\[] and B\[] consisting of n and m elements respectively. Find the
// minimum number of elements to remove from each array such that no common element
// exist in both.
// Examples:
// Input: A[] = { 1, 2, 3, 4}
// B[] = { 2, 3, 4, 5, 8}
// Output: 3 [We need to remove 2, 3 and 4 from any array.]
// Input: A\[] = {4, 2, 4, 4}
// B\[] = {4, 3}
// Output: 1 \[We need to remove 4 from B\[] ]
// Input: A\[] = {1, 2, 3, 4}
// B\[] = {5, 6, 7}
// Output: 0 \[There is no common element in both.]


package Recursion;


import java.util.Set;
import java.util.HashSet;

public class problem11 {
    public static int minRemove(int[] A ,int[]B){

     Set<Integer> setA= new HashSet<>();
     for(int num:A){
        setA.add(num);
     }
     int remove =0;
     for(int num:B){
        if(setA.contains(num)){
            remove++;
        }
     }
     return remove;
    }
    public static void main(String[] args) {
        int[] A1 = {1, 2, 3, 4};
        int[] B1 = {2, 3, 4, 5, 8};
        System.out.println(minRemove(A1, B1));
    }
}
