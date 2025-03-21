import java.util.Scanner;

// Class to convert a sentence to title case
class TitleCaseConverter {

    // Method to convert the sentence to title case
    public static String convertToTitleCase(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // StringBuilder to hold the result
        StringBuilder titleCaseSentence = new StringBuilder();

        // Iterate through each word
        for (String word : words) {
            // Capitalize the first letter and make the rest of the word lowercase
            if (word.length() > 0) {
                String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                // Append the word to the result with a space
                titleCaseSentence.append(capitalizedWord).append(" ");
            }
        }

        // Remove the trailing space at the end of the sentence
        return titleCaseSentence.toString().trim();
    }
}

// Main class to test the TitleCaseConverter
public class Main {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.println("Enter a sentence to convert to title case:");
        String inputSentence = scanner.nextLine();

        // Call the method from TitleCaseConverter to convert the sentence to title case
        String titleCaseSentence = TitleCaseConverter.convertToTitleCase(inputSentence);

        // Output the converted sentence
        System.out.println("The sentence in title case is: " + titleCaseSentence);

        // Close the scanner object
        scanner.close();
    }
}
