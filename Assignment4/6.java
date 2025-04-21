import java.io.FileReader;
import java.io.IOException;

public class CharacterCounter {

    public int countCharacters(String fileName) {
        int charCount = 0;

        try (FileReader reader = new FileReader(fileName)) {
            while (reader.read() != -1) {
                charCount++;
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return charCount;
    }

    public static void main(String[] args) {
        CharacterCounter counter = new CharacterCounter();
        int count = counter.countCharacters("story.txt");
        System.out.println("Total number of characters in file: " + count);
    }
}
