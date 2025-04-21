public class Expense {
    private String date;   
    private String category;
    private double amount;
    private String description;

    public Expense(String date, String category, double amount, String description) {
        this.date = date;
        this.category = category;
        this.amount = amount;
        this.description = description;
    }

    public String toFileFormat() {
        return date + "," + category + "," + amount + "," + description;
    }

    public String getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }
}
import java.io.*;
import java.util.*;

public class ExpenseTracker {

    public void addExpense(Expense e, String filename) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(e.toFileFormat() + System.lineSeparator());
            System.out.println("Expense added.");
        } catch (IOException ex) {
            System.out.println("Error writing to file: " + ex.getMessage());
        }
    }
    public double calculateMonthlyTotal(String filename, String month) {
        double total = 0.0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length < 3) continue;

                String date = parts[0];
                double amount = Double.parseDouble(parts[2]);

                if (date.startsWith(month)) {
                    total += amount;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return total;
    }
    public void generateSummary(String filename, String outputFilename) {
        Map<String, Double> monthlyTotals = new TreeMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length < 3) continue;

                String date = parts[0];
                String month = date.substring(0, 7); // Get YYYY-MM
                double amount = Double.parseDouble(parts[2]);

                monthlyTotals.put(month, monthlyTotals.getOrDefault(month, 0.0) + amount);
            }

            try (FileWriter writer = new FileWriter(outputFilename)) {
                writer.write("Expense Summary (Monthly)\n");
                writer.write("--------------------------\n");
                for (Map.Entry<String, Double> entry : monthlyTotals.entrySet()) {
                    writer.write(entry.getKey() + ": $" + String.format("%.2f", entry.getValue()) + "\n");
                }
