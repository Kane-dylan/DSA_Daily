package JAVA.Array;

import java.util.Scanner;

public class prob1_Arr {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Size of the array: ");
    int size = sc.nextInt();
    int num[] = new int[size];

    // input
    for (int i = 0; i < size; i++) {
      num[i] = sc.nextInt();
    }

    System.out.print("Target num: ");
    int x = sc.nextInt();

    // output
    for (int i = 0; i < num.length; i++) {
      if(num[i]==x){
      System.out.print("The num found in "+i+"th position");
      }
    }
  }
}
