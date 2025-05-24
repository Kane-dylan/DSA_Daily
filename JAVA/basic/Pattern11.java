package JAVA.basic;

public class Pattern11 {

  public static void main(String[] args) {
    int a = 5;

    for (int i = 1; i <=a; i++) {
      //for space
      for (int j = 1; j <= a - i; j++) {
        System.out.print("  ");
      }
      // for stars
      for (int j=1; j<=5; j++){
      System.out.print(" *");
      }
      System.out.println(" ");
    }
  }
}
