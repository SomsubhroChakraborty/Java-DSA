// Given the participants’ score sheet for your University Sports Day, you are required to find the runner-up
// score. You are given n scores. Store them in a list and find the score of the runner-up.
// Input Format
// The first line contains n. The second line contains an array 

package Array;

import java.util.*;

public class Runnerup {

    public static void runnerup(int[] arr, int n) {
        // Use a set to dedupe, then sort the distinct values
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        List<Integer> array = new ArrayList<>(set);
        if (array.size() < 2) {
            System.out.println("No runner-up");
            return;
        }

        Collections.sort(array); // ascending
        // second largest distinct is at size-2
        System.out.println(array.get(array.size() - 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // read n
        int n = Integer.parseInt(sc.nextLine().trim());
        // read the array line
        String[] parts = sc.nextLine().trim().split("\\s+");
        sc.close();

        int len = Math.min(n, parts.length);
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        runnerup(arr, n);
    }
}
