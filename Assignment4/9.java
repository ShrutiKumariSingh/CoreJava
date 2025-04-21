import java.io.*;
import java.util.Base64;

public class EncryptedFileReader {

    public String decryptLine(String encryptedLine) {
        try {
            byte[] decodedBytes = Base64.getDecoder().decode(encryptedLine);
            return new String(decodedBytes);
        } catch (IllegalArgumentException e) {
            return "Invalid Base64 format: " + encryptedLine;
        }
    }
    public void decryptFile(String inputFile, String outputFile) {
        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                String decrypted = decryptLine(line);
                writer.write(decrypted);
                writer.newLine();
            }
            System.out.println("Decryption complete. Output written to " + outputFile);
        } catch (IOException e) {
            System.out.println("Error during file decryption: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        EncryptedFileReader reader = new EncryptedFileReader();
        reader.decryptFile("secret_data.enc", "decrypted.txt");
    }
}
public String decryptLine(String encryptedLine) {
    StringBuilder decrypted = new StringBuilder();
    int shift = 3;

    for (char c : encryptedLine.toCharArray()) {
        if (Character.isUpperCase(c)) {
            decrypted.append((char) ((c - 'A' - shift + 26) % 26 + 'A'));
        } else if (Character.isLowerCase(c)) {
            decrypted.append((char) ((c - 'a' - shift + 26) % 26 + 'a'));
        } else {
            decrypted.append(c); 
        }
    }

    return decrypted.toString();
}
