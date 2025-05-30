package JAVA.Exercise;

import java.util.Scanner;

public class prob10 {
  public static void Fibonacci(int n) {
    int a = 0, b = 1, c;

    System.out.print("Fibonacci Series up to " + n + " terms: ");

    if (n >= 1) {
      System.out.print(a + " ");
    }
    if (n >= 2) {
      System.out.print(b + " ");
    }

    for (int i = 3; i <= n; i++) {
      c = a + b;
      System.out.print(c + " ");
      a = b;
      b = c;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a num: ");
    int n = sc.nextInt();

    //        Fibonacci(n);
    int a = 0, b = 1;

    System.out.print(a + " ");
    if (n > 1) {
      for (int i = 2; i <= n; i++) {
        System.out.print(b + " ");
        int temp = b;
        b = a+b;
        a = temp;
      }
      System.out.println();
    }

    sc.close();
  }
}
