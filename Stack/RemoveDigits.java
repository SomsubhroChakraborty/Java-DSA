package Stack;


public class RemoveDigits {
    public static String removeDigits(String s) {
        char[] arr = s.toCharArray();
        int j = 0; // Pointer for valid characters
        
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) {
                if (j > 0) {
                    j--; // Remove the closest non-digit by moving j back
                }
            } else {
                arr[j] = arr[i]; // Store valid non-digit
                j++; // Move forward
            }
        }
        
        return new String(arr, 0, j); // Return valid part of array
    }

    public static void main(String[] args) {
        System.out.println(removeDigits("abc"));     // Output: "abc"
        System.out.println(removeDigits("cb34"));    // Output: ""
        System.out.println(removeDigits("a1b2c3"));  // Output: ""
        System.out.println(removeDigits("a1bc2d3e4f")); // Output: "f"
    }
}
