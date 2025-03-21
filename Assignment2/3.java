import java.util.ArrayList;
import java.util.List;

// Class to generate letter combinations from a phone number
class PhoneNumberCombinations {

    // Mapping of digits to their corresponding letters
    private static final String[] digitToLetters = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    // Method to generate letter combinations
    public static List<String> generateCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        
        // If the input is empty, return an empty list
        if (digits == null || digits.length() == 0) {
            return combinations;
        }
        
        // Start the recursive process to generate combinations
        backtrack(digits, 0, new StringBuilder(), combinations);
        
        return combinations;
    }

    // Helper method to perform backtracking
    private static void backtrack(String digits, int index, StringBuilder current, List<String> combinations) {
        // If the current string has reached the length of the input, we have a complete combination
        if (index == digits.length()) {
            combinations.add(current.toString());
            return;
        }

        // Get the letters corresponding to the current digit
        int digit = digits.charAt(index) - '0';
        String letters = digitToLetters[digit];

        // Loop through each letter and recursively build combinations
        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i)); // Add the letter to the current combination
            backtrack(digits, index + 1, current, combinations); // Move to the next digit
            current.deleteCharAt(current.length() - 1); // Backtrack by removing the last character
        }
    }
}

// Main class to test the PhoneNumberCombinations
public class Main {
    public static void main(String[] args) {
        String digits1 = "23";
        String digits2 = "2";
        String digits3 = "7";

        // Test case 1
        List<String> result1 = PhoneNumberCombinations.generateCombinations(digits1);
        System.out.println("Combinations for " + digits1 + ": " + result1);

        // Test case 2
        List<String> result2 = PhoneNumberCombinations.generateCombinations(digits2);
        System.out.println("Combinations for " + digits2 + ": " + result2);

        // Test case 3
        List<String> result3 = PhoneNumberCombinations.generateCombinations(digits3);
        System.out.println("Combinations for " + digits3 + ": " + result3);
    }
}
