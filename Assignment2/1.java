// Class to find the longest common prefix
class LongestCommonPrefix {
    
    public static String longestCommonPrefix(String[] strs) {
        // If the array is empty, return an empty string
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Start with the first string as the initial prefix
        String prefix = strs[0];
        
        // Iterate through the rest of the strings in the array
        for (int i = 1; i < strs.length; i++) {
            // Keep reducing the prefix until it matches the beginning of the current string
            while (strs[i].indexOf(prefix) != 0) {
                // Shorten the prefix by one character from the end
                prefix = prefix.substring(0, prefix.length() - 1);
                // If there is no common prefix, return an empty string
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
}

// Main class to execute the program
public class Main {
    public static void main(String[] args) {
        // First example
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + LongestCommonPrefix.longestCommonPrefix(strs1));  // Output: "fl"
        
        // Second example
        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Longest Common Prefix: " + LongestCommonPrefix.longestCommonPrefix(strs2));  // Output: ""
    }
}
