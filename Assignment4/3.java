import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopier {

    public void copyFile(String source, String destination) {
        FileReader reader = null;
        FileWriter writer = null;

        try {
            reader = new FileReader(source);
            writer = new FileWriter(destination);

            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }

            System.out.println("File copied successfully from " + source + " to " + destination);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                if (reader != null) reader.close();
                if (writer != null) writer.close();
            } catch (IOException e) {
                System.out.println("Error closing files: " + e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        FileCopier copier = new FileCopier();
        copier.copyFile("source.txt", "destination.txt");
    }
}
