// Given a digit string, return all possible IP Addresses that can be formed from the string.
// A valid IP Address contains four integers each in the range of [0, 255]. 
// The four numbers are separated by a '.'. The integers do not have any leading zeros unless the number is itself 0.

package String;

import java.util.*;
public class IPAddress {



    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, 0, "", result);
        return result;
    }

    private static void backtrack(String s, int index, int part, String currentIP, List<String> result) {
        // Base case: 4 parts and all characters used
        if (part == 4 && index == s.length()) {
            result.add(currentIP);
            return;
        }

        // If we already have 4 parts or we've consumed all characters but parts < 4
        if (part >= 4 || index >= s.length()) return;

        // Try segment lengths 1 to 3
        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {
            String segment = s.substring(index, index + len);

            // Skip invalid segment:
            // 1. Leading zeros (unless single '0')
            // 2. Value > 255
            if ((segment.startsWith("0") && segment.length() > 1) || Integer.parseInt(segment) > 255) {
                continue;
            }

            // Add '.' only if it's not the first part
            String newIP = currentIP + (part == 0 ? "" : ".") + segment;

            // Recurse for the next part
            backtrack(s, index + len, part + 1, newIP, result);
        }
    }

    // Test the code
    public static void main(String[] args) {
        String input = "25525511135";
        List<String> ips = restoreIpAddresses(input);

        System.out.println("Possible IP addresses: ");
        for (String ip : ips) {
            System.out.println(ip);
        }
    }
}


