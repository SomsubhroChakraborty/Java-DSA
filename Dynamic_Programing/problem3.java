// An integer table TAB of size n containing an unsorted set of integers is supplied as
// input. Each integer in the table can be positive, negative or zero. Another integer r is
// also supplied as input. Write a program to determine indices i and j for which the
// absolute difference in magnitude between r and the quantity (TAB[i] + TAB[j]) is as
// small as possible. (Of course, the smallest possible value for the absolute difference is
// 0.) For example, if n = 10 and TAB contains [ 3, 19, 4, 26, -31, 8, 34, -7, 16, 30 ] and
// r = 44, then i = 1, j = 3, since 19+26 = 45 is closest in value to 44. In your program you
// can assume that n will not exceed 1000. Suppose that instead of two indices i and j we
// want to find three indices i, j, k such that the absolute difference in magnitude between
// r and (TAB[i] + TAB[j] + TAB[k]) is as small as possible. Modify the program to work
// for this case.

package Dynamic_Programing;

public class problem3 {
    
    public static void closestPair2(int[] tab, int r){
        int n= tab.length;
        int mindiff = Integer.MAX_VALUE;
        int ires=-1;
        int jres=-1;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum = tab[i]+tab[j];
                int diff = Math.abs(r-sum);
                if(diff<mindiff){
                    mindiff= diff;
                    ires=i;
                    jres=j;

                }
            }

        }
        System.out.println("closest pair are :"+"i :"+tab[ires]+" j :"+tab[jres]);
        System.out.println(tab[ires]+tab[jres]);
    }
    public static void closestPair3(int[] tab, int r){
        int n= tab.length;
        int mindiff = Integer.MAX_VALUE;
        int ires=-1;
        int jres=-1;
        int kres=-1;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k = j+1 ; k<n;k++){
                    int sum = tab[i]+tab[j]+tab[k];
                int diff = Math.abs(r-sum);
                if(diff<mindiff){
                    mindiff= diff;
                    ires=i;
                    jres=j;
                    kres=k;
                }
                

                }
            }

        }
                System.out.println("closest pair are :"+"i :"+tab[ires]+" j :"+tab[jres]+" k :"+tab[kres]);
        System.out.println(tab[ires]+tab[jres]+tab[kres]);
    }
    public static void main(String[] args) {
        int[] tab = {3, 19, 4, 26, -31, 8, 34, -7, 16, 30};
        int r=44;
        closestPair2(tab,r);
        closestPair3(tab,r);
    }
}
