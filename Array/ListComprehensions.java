// Example
// x=1 y=1 z=2 n=3
// All permutations of [i,j,k] are:
// [[0,0,0],[0,0,1],[0,0,2],[0,1,0],[0,1,1],[0,1,2],[1,0,0],[1,0,1],[1,0,2],[1,1,0],[1,1,1,1

package Array;

import java.util.*;

public class ListComprehensions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine().trim());
        int y = Integer.parseInt(sc.nextLine().trim());
        int z = Integer.parseInt(sc.nextLine().trim());
        int n = Integer.parseInt(sc.nextLine().trim());
        sc.close();

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                for (int k = 0; k <= z; k++) {
                    if (i + j + k != n) {
                        result.add(Arrays.asList(i, j, k));
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int idx = 0; idx < result.size(); idx++) {
            List<Integer> t = result.get(idx);
            sb.append("[").append(t.get(0)).append(",").append(t.get(1)).append(",").append(t.get(2)).append("]");
            if (idx != result.size() - 1) sb.append(",");
        }
        sb.append("]");
        System.out.println(sb);
    }
}
