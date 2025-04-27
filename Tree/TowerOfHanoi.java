
// Write functions to implement a solution to Towers of Hanoi problem. Check your
// program with number of disks = 0, 1, 2 and 3.

package Tree;
 class TowerOfHanoi {
    public static void towerofhanoi(int n , char from_rod,char to_rod , char aux_rod){
        if(n==0){
            return;
        }

        towerofhanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod "+ from_rod + " to rod "+ to_rod);
        towerofhanoi(n - 1, aux_rod, to_rod, from_rod);
    }

    public static void main(String[] args) {
        int N=4;
         towerofhanoi(N,'A' ,'C','B');
    }
    }

