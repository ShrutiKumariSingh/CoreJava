import java.util.HashSet;
import java.util.Set;

// Class to generate permutations of a string
class StringPermutations {
    
    // Method to generate all permutations of the given string
    public static Set<String> getPermutations(String str) {
        Set<String> permutations = new HashSet<>();
        // Base case: if the string is empty, return an empty set
        if (str == null || str.length() == 0) {
            return permutations;
        }
        
        // Call the recursive helper method to generate the permutations
        generatePermutations(str, "", permutations);
        
        return permutations;
    }

    // Helper method to generate permutations using recursion
    private static void generatePermutations(String str, String current, Set<String> permutations) {
        // If the string is empty, we have a complete permutation
        if (str.length() == 0) {
            permutations.add(current);
            return;
        }

        // Loop through the string and recursively generate permutations
        for (int i = 0; i < str.length(); i++) {
            // Choose the character at index i
            char ch = str.charAt(i);
            // Remaining string without the chosen character
            String remaining = str.substring(0, i) + str.substring(i + 1);
            // Recurse with the new string
            generatePermutations(remaining, current + ch, permutations);
        }
    }
}

// Main class to test the StringPermutations class
public class Main {

    public static void main(String[] args) {
        String str = "ABC";
        
        // Get all permutations of the given string
        Set<String> result = StringPermutations.getPermutations(str);
        
        // Print the result
        System.out.println("All permutations of the string \"" + str + "\":");
        for (String permutation : result) {
            System.out.println(permutation);
        }
    }
}
