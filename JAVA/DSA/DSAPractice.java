package JAVA.DSA;

import java.io.*;

public class DSAPractice {
    // File paths for input and output
    private static final String INPUT_FILE = "JAVA/DSA/input.txt";
    private static final String OUTPUT_FILE = "JAVA/DSA/output.txt";

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE));
             BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE))) {

            // Read input
            String line;
            while ((line = reader.readLine()) != null) {
                // Process each line of input here
                // Example: converting to uppercase
                String result = processLine(line);

                // Write to output file
                writer.write(result);
                writer.newLine();  // Add a new line after each processed line
            }

            System.out.println("Processing complete! Check " + OUTPUT_FILE + " for results.");

        } catch (IOException e) {
            System.err.println("Error during file processing: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Process a single line of input.
     * Modify this method to implement your DSA algorithm.
     *
     * @param line Input line to process
     * @return Processed output
     */
    private static String processLine(String line) {
        // Replace this with your actual DSA algorithm implementation
        // For now, just return the input line as uppercase as an example
        return line.toUpperCase();
    }

    /**
     * Helper method to read integers from a line.
     * Useful for competitive programming problems.
     *
     * @param line Input line containing space-separated integers
     * @return Array of integers parsed from the line
     */
    private static int[] parseIntegers(String line) {
        String[] parts = line.trim().split("\\s+");
        int[] result = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            result[i] = Integer.parseInt(parts[i]);
        }

        return result;
    }
}
