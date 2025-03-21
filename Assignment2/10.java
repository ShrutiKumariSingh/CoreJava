import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Class to extract domain name from a URL
class DomainExtractor {

    // Method to extract domain name from a URL
    public static String extractDomain(String url) {
        // Regular expression to match the domain name part of a URL
        String regex = "^(https?://)?([a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*)(?:/.*)?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(url);

        // If the URL matches the regular expression, extract the domain name
        if (matcher.find()) {
            return matcher.group(2); // Extracted domain name is in group 2
        } else {
            return "Invalid URL"; // If the URL is not valid, return an error message
        }
    }
}

// Main class to test the DomainExtractor
public class Main {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a URL
        System.out.println("Enter a URL to extract the domain name:");
        String inputURL = scanner.nextLine();

        // Call the method from DomainExtractor to extract the domain name
        String domain = DomainExtractor.extractDomain(inputURL);

        // Output the extracted domain name
        System.out.println("The extracted domain name is: " + domain);

        // Close the scanner object
        scanner.close();
    }
}
