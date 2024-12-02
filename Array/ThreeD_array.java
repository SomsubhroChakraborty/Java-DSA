package Array;
// package 3D array in java;
import java.util.*;
public class ThreeD_array {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

//Read the Dimentions
System.out.println("Enter the number of rows : ");
int rows =sc.nextInt();
System.out.println("Enter the number of Columns :");
int cols =sc.nextInt();
System.out.println("Enter the number of Depth :");
int depths =sc.nextInt();

//initialize the 3D array

int[][][] arr = new int[rows][cols][depths]; 


//Taking input
for(int i=0; i<rows;i++){
    for(int j=0 ;j<cols;j++){
        for(int k=0;k<depths;k++){
            arr[i][j][k]= sc.nextInt();
        }
    }
}

//Showing Output
for(int i=0; i<rows;i++){
    for(int j=0 ;j<cols;j++){
        for(int k=0;k<depths;k++){
           System.out.println(arr[i][j][k] + " ");
        }
        System.out.println();
    }
    System.out.println();
}










sc.close();
    }
}
