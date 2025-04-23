import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NoteManager {

    private String filename;

    public NoteManager(String filename) {
        this.filename = filename;
    }

    public void createFile() {
        try {
            File myFile = new File(filename);
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }
    }

    public void writeNote(String note) {
        try {
            FileWriter writer = new FileWriter(filename, true); 
            writer.write(note + "\n");
            writer.close();
            System.out.println("Note written to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    public void readNotes() {
        try {
            File myFile = new File(filename);
            Scanner sc = new Scanner(myFile);
            System.out.println("Notes in the file:");
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a note:");
        String userNote = sc.nextLine();

        NoteManager manager = new NoteManager("notes.txt");
        manager.createFile();
        manager.writeNote(userNote);
        manager.readNotes();

        sc.close();
    }
}
