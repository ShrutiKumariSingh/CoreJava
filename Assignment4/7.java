import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileViewer {

    public void displayFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        FileViewer viewer = new FileViewer();
        viewer.displayFile("message.txt");
    }
}
