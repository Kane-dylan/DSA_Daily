package JAVA.basic;

public class Pattern8 {
  public static void main(String[] args) {
    int a = 5;
    int num = 1;

    for (int i = 1; i <= a; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(num + " ");
        num++;
      }
      System.out.println(" ");
    }
  }
}
