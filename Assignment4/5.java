import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NoteTaker {
    public void addNote(String note) {
        try (FileWriter writer = new FileWriter("daily_log.txt", true)) { 
            writer.write(note + System.lineSeparator());
            System.out.println("Note added to daily_log.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NoteTaker noteTaker = new NoteTaker();

        System.out.print("Enter your note for the daily log: ");
        String note = scanner.nextLine();

        noteTaker.addNote(note);
        scanner.close();
    }
}
