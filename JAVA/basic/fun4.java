package JAVA.basic;

import java.util.Scanner;

public class fun4 {

  public static int Factorial(int n) {
    if (n == 0 || n == 1) {
      return 1;
    } else {
      return n * Factorial(n - 1);
    }
  }

  public static Object FactorialNum (int n){
    if(n<0){
      System.out.println("invalid number");
      return null;
    }else if(n == 0 || n== 1){
      return 1;
    } else {
      int factorial = 1;
      for (int i = n; i >= 1; i--) {
        factorial = factorial * i;
      }
//      System.out.println(factorial);
      return factorial;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
//    System.out.println("Factorial of " + n + " is: " + Factorial(n));
    System.out.println("Factorial of " + n + " is: " + FactorialNum(n));
//    FactorialNum(n);

  }
}
