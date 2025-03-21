import java.util.HashSet;
import java.util.Scanner;

// Class to check if the string has all unique characters
class UniqueCharacterChecker {

    // Method to check if all characters in the string are unique
    public static boolean hasUniqueCharacters(String str) {
        // Use a HashSet to track characters we've encountered
        HashSet<Character> characterSet = new HashSet<>();
        
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            
            // If the character has already been encountered, return false
            if (characterSet.contains(currentChar)) {
                return false;
            }
            
            // Add the character to the set
            characterSet.add(currentChar);
        }
        
        // If no duplicates were found, return true
        return true;
    }
}

// Main class to test the UniqueCharacterChecker class
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.println("Enter a string to check if it has all unique characters:");
        String inputString = scanner.nextLine();
        
        // Call the method from UniqueCharacterChecker to check uniqueness
        boolean result = UniqueCharacterChecker.hasUniqueCharacters(inputString);
        
        // Output the result
        if (result) {
            System.out.println("The string has all unique characters.");
        } else {
            System.out.println("The string does not have all unique characters.");
        }
        
        // Close the scanner object
        scanner.close();
    }
}
