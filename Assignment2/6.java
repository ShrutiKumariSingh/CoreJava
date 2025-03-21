import java.util.HashSet;
import java.util.Set;

// Class to filter out offensive words from a text
class OffensiveWordFilter {
    
    // A set of offensive words to check against
    private static final Set<String> offensiveWords = new HashSet<>();
    
    // Static block to initialize the set of offensive words
    static {
        offensiveWords.add("badword");
        offensiveWords.add("offensive");
        offensiveWords.add("hate");
        offensiveWords.add("stupid");
        // Add more offensive words as needed
    }
    
    // Method to replace offensive words with ***
    public static String filterOffensiveWords(String input) {
        // Split the input text into words
        String[] words = input.split(" ");
        
        // Iterate over the words and replace offensive ones
        for (int i = 0; i < words.length; i++) {
            if (offensiveWords.contains(words[i].toLowerCase())) {
                // Replace offensive word with ***
                words[i] = "***";
            }
        }
        
        // Join the words back together to form the filtered sentence
        return String.join(" ", words);
    }
}

// Main class to test the OffensiveWordFilter class
public class Main {
    public static void main(String[] args) {
        String inputText1 = "This is a badword and offensive message";
        String inputText2 = "I hate this stupid thing";
        String inputText3 = "This is a clean message";
        
        // Test case 1
        System.out.println("Original: " + inputText1);
        System.out.println("Filtered: " + OffensiveWordFilter.filterOffensiveWords(inputText1)); // Expected output: "This is a *** and *** message"
        
        // Test case 2
        System.out.println("Original: " + inputText2);
        System.out.println("Filtered: " + OffensiveWordFilter.filterOffensiveWords(inputText2)); // Expected output: "I *** this *** thing"
        
        // Test case 3
        System.out.println("Original: " + inputText3);
        System.out.println("Filtered: " + OffensiveWordFilter.filterOffensiveWords(inputText3)); // Expected output: "This is a clean message"
    }
}
