
// Write a recursive function to calculate the power of a two number(consider the degree as a
// negative/positive integer).
package Recursion;
public class Problem3 {

    public static int pow(int a,int b){
        if(b==0){
            return 1; 
        }
        if(b<=0){
            return 1 / pow(a,-b);
        }
    return a*pow(a,b-1);
    }
    public static void main(String[] args) {
    System.out.println(pow(2, -3));
    }
    
}