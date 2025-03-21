import java.util.Arrays;

// Class to check if two strings are anagrams
class AnagramChecker {

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String s, String t) {
        // If the lengths of the strings are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Convert both strings to character arrays and sort them
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Compare the sorted arrays
        return Arrays.equals(sArray, tArray);
    }
}

// Main class to test the AnagramChecker
public class Main {
    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaram";
        String s2 = "hello";
        String t2 = "billion";

        // Test case 1
        System.out.println("Are \"" + s1 + "\" and \"" + t1 + "\" anagrams? " + AnagramChecker.areAnagrams(s1, t1));  // Expected output: true

        // Test case 2
        System.out.println("Are \"" + s2 + "\" and \"" + t2 + "\" anagrams? " + AnagramChecker.areAnagrams(s2, t2));  // Expected output: false
    }
}
