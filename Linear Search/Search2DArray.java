public class Search2DArray{
public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},{4,5,6},{7,8,9}
        };
        int target = 16;

        boolean flag = false;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[i].length-1;j++){
                if(arr[i][j]==target){
                    System.out.println("the element is in the matrix. The position is"+" "+ "row"+" "+i+" "+ "and"+" "+"column"+" "+j);
                    flag = true;
                    break;
                }
            }
        }
        if(!flag){
            System.out.println("Elemet is not in the matrix ! ");
        }
    }
}
