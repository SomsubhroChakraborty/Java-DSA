package Tree;

// import java.util.*;

class FindMinMax {
    static class Result {
        int min;
        int max;
    }

    static Result findMinMax(int arr[], int low, int high) {
        Result res = new Result();
        
        // base case
        if (low == high) {
            res.min = arr[low];
            res.max = arr[low];
            return res;
        }

        // If there are more than 2 elements
        int mid = (low + high) / 2;
        Result leftRes = findMinMax(arr, low, mid);
        Result rightRes = findMinMax(arr, mid + 1, high);

        // Combine the results
        res.min = Math.min(leftRes.min, rightRes.min);
        res.max = Math.max(leftRes.max, rightRes.max);

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1000, 11, 445, 1, 330, 3000};
        int n = arr.length;

        Result result = findMinMax(arr, 0, n - 1);

        System.out.println("Minimum element is " + result.min);
        System.out.println("Maximum element is " + result.max);
    }
}
