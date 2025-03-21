import java.util.Scanner;

// Class to find the longest word in a sentence
class LongestWordFinder {

    // Method to find the longest word in the given sentence
    public static String findLongestWord(String sentence) {
        // Split the sentence into words using space as a delimiter
        String[] words = sentence.split("\\s+");

        // Initialize a variable to store the longest word
        String longestWord = "";

        // Iterate through each word in the sentence
        for (String word : words) {
            // Check if the current word is longer than the previous longest word
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // Return the longest word found
        return longestWord;
    }
}

// Main class to test the LongestWordFinder
public class Main {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.println("Enter a sentence to find the longest word:");
        String inputSentence = scanner.nextLine();

        // Call the method from LongestWordFinder to find the longest word
        String longestWord = LongestWordFinder.findLongestWord(inputSentence);

        // Output the longest word
        System.out.println("The longest word in the sentence is: " + longestWord);

        // Close the scanner object
        scanner.close();
    }
}
