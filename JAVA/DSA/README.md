# DSA Practice Setup

This directory contains a setup for practicing Data Structures and Algorithms (DSA) problems with file-based input and output in Java.

## Files

- `DSAPractice.java`: The main template file with BufferedReader and BufferedWriter setup
- `input.txt`: Place your test input here
- `output.txt`: The program will write results here

## How to Use

1. Edit the `input.txt` file with your test cases
2. Modify the `processLine()` method in `DSAPractice.java` to implement your algorithm
3. Run the program
4. Check the results in `output.txt`

## Features

- File I/O setup with BufferedReader and BufferedWriter for efficient reading and writing
- Automatic resource management with try-with-resources
- Helper method for parsing integers from input lines
- No need to configure standard input/output redirection

## Tips for DSA Problem Solving

- For competitive programming problems, most inputs follow specific formats
- Use the `parseIntegers()` helper method to easily convert space-separated integers into an array
- Add more helper methods as needed for your specific problem types
- Customize the input processing logic in the main method if your problems have more complex input formats
