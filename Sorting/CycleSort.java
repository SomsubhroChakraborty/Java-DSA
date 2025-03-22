package Sorting;

public class CycleSort {
    public static void cycleSort(int[] a){
        int n= a.length;
        int v=0;
        for(int i=0 ; i<=n-1;i++){
            // int item= a[i];
            // int pos = i ;
            for(int j=i ; j<n ; j++){
                if( a[i] < a[j]){
                    v=v+1;
                }
            }
                if(v==0){
                    continue;
                }
                if(v!=0){
                  int temp = a[i];
                  a[i] =a[v];
                  a[v] = temp;
                }
                while(v!=0){
                    
                }
        }
    }
}
