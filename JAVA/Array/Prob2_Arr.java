package JAVA.Array;

import java.util.Scanner;

public class Prob2_Arr {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of names: ");
    int size = sc.nextInt();
    sc.nextLine(); // Add this line to consume the newline character

    String name[] = new String[size];

    // input
    System.out.println("Enter " + size + " names:");
    for (int i = 0; i < size; i++) {
      name[i] = sc.nextLine(); // Changed from sc.next() to sc.nextLine()
    }

    // output
    for (int i = 0; i < name.length; i++) {
        System.out.println("name " + (i+1) +" is : " + name[i]);
    }
    
    sc.close(); // Close the scanner when done
  }
}