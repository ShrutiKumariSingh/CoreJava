import java.io.*;
import java.util.*;

public class FileComparator {

    public void compareFiles(String file1, String file2, String resultFile) {
        try (
            BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2));
            BufferedWriter writer = new BufferedWriter(new FileWriter(resultFile))
        ) {
            String line1, line2;
            int lineNum = 1;

            writer.write("Comparison Result\n");
            writer.write("=================\n\n");

            while (true) {
                line1 = reader1.readLine();
                line2 = reader2.readLine();

                if (line1 == null && line2 == null) break;

                if (line1 == null) {
                    writer.write(" Line " + lineNum + " missing in fileA.txt: \"" + line2 + "\"\n");
                } else if (line2 == null) {
                    writer.write(" Line " + lineNum + " missing in fileB.txt: \"" + line1 + "\"\n");
                } else if (line1.equals(line2)) {
                    writer.write(" Line " + lineNum + " (Same): " + line1 + "\n");
                } else {
                    writer.write("Line " + lineNum + " differs:\n");
                    writer.write("   A: " + line1 + "\n");
                    writer.write("   B: " + line2 + "\n");
                }

                lineNum++;
            }

            System.out.println("Comparison complete. Report written to " + resultFile);

        } catch (IOException e) {
            System.out.println("Error during file comparison: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        FileComparator comparator = new FileComparator();
        comparator.compareFiles("fileA.txt", "fileB.txt", "comparison_result.txt");
    }
}
